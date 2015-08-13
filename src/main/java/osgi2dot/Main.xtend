package osgi2dot;

import java.io.File
import java.util.ArrayList
import java.util.List
import org.kohsuke.args4j.Argument
import org.kohsuke.args4j.CmdLineException
import org.kohsuke.args4j.CmdLineParser
import org.kohsuke.args4j.Option

public class Main {

	@Option(name="--allowedPrefixes", usage="List of allowed prefixes. If given, a found plugin/feature is not taken into account if its id doesn't match one of these prefixes.", metaVar="STRING")
	public List<String> allowedPrefixes;

	@Option(name="--filteredPrefixes", usage="List of forbidden prefixes. If given, a found plugin/feature is not taken into account if its id matches one of these prefixes.", metaVar="STRING")
	public List<String> filteredPrefixes;

	@Option(name="--outputFile", usage="Path to the output file. If given, will write into this file instead of printing to the console.")
	public File outputFile;

	@Argument
	public List<File> folders = new ArrayList<File>();

	public def static void main(String[] args) {
		new Main().doMain(args)
	}

	public def void doMain(String[] args) {
		val CmdLineParser parser = new CmdLineParser(this);
		parser.properties.withUsageWidth(80).withOptionValueDelimiter("=");

		try {

			// parse the arguments.
			parser.parseArgument(args);

			// checking if enough arguments are given.
			if(folders.isEmpty())
				throw new CmdLineException(parser, "No folders given.");

			// setting args
			val osgi2dot = new Osgi2dot(folders)

			// setting options
			if(allowedPrefixes != null && !allowedPrefixes.isEmpty)
				osgi2dot.addAllowedPrefixes(allowedPrefixes)
			if(filteredPrefixes != null && !filteredPrefixes.isEmpty)
				osgi2dot.addFilteredPrefixes(filteredPrefixes)
			if(outputFile != null)
				osgi2dot.outputFile = outputFile

			// starting program	
			osgi2dot.generate

		} catch(CmdLineException e) {

			System.err.println(e.getMessage());
			System.err.println("Usage: java -jar pdedependencies2dot.jar [options...] <folder1,folder2,...>");
			println()
			parser.printUsage(System.err);
			System.err.println();

			return;
		}
	}

}
