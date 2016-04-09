package in.ravived.lnd.basicindex;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleIndex {


	private static final Logger Logger = LoggerFactory.getLogger(SimpleIndex.class);

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Logger.debug("BasicIndex..start");

		SimpleIndex sindex = new SimpleIndex();

		// check if argument exist and its a directory
		if (sindex.checkArguments(args) == false) {
			Logger.error("invalid arguments. usage .. SimpleIndex <path to index>");
			return;
		}

		// get list of files in a directory - no recursive feature
		sindex.getTxtFileList(args[0]);

		// for every file in directory ...

		// check if file is of type txt

		// open file and read every line

		///

	}

	private boolean checkArguments(String[] args) {
		Logger.info("" + args.length);
		if (args.length > 0) {
			Logger.info("argument value: " + args[0]);
		}
		if (args == null || args.length != 1) {
			return false;
		}
		return true;
	}

	private List<File> getTxtFileList(String dirPath) {
		File folder = new File(dirPath);
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {

			Logger.info(FilenameUtils.getExtension(file.getName()));

		}

		return null;
	}

	private void createIndexForEachFileInList(List<File> fileList) {

		// For every file
		// Open File in BufferReader mode

	}

	private void createIndexForEachOpenFile(BufferedReader openFileBR) {

		// for every line in the file
		// get every word in the file

		// createOrUpdateIndex()

	}

	private void createOrUpdateIndex(String word, String fileName) {

	}

}
