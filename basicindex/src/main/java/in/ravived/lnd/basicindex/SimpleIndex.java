package in.ravived.lnd.basicindex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleIndex {

	private static final Logger Logger = LoggerFactory.getLogger(SimpleIndex.class);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Logger.debug("BasicIndex..start");

		SimpleIndex sindex = new SimpleIndex();

		// check if argument exist and its a directory
		if (sindex.isValidArgument(args) == false) {
			Logger.error("invalid arguments. usage .. SimpleIndex <path to index>");
			return;
		}

		// get list of files in a directory - no recursive feature
		File[] txtFileList = sindex.getTxtFileList(args[0]);

		// for every file in directory ...
		sindex.createIndexForEachFileInList(txtFileList);

	}

	private boolean isValidArgument(String[] args) {
		Logger.info("" + args.length);
		if (args.length > 0) {
			Logger.info("argument value: " + args[0]);
		}
		if (args == null || args.length != 1) {
			return false;
		}
		return true;
	}

	private File[] getTxtFileList(String dirPath) {
		File currentDirectory = new File(new File(".").getAbsolutePath());
		Logger.debug("Current Directory ->" + currentDirectory.getAbsolutePath());
		File folder = new File(dirPath);
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {

			Logger.info(FilenameUtils.getExtension(file.getName()));

		}

		return listOfFiles;
	}

	private void createIndexForEachFileInList(File[] txtFileList) throws Exception {

		// For every file
		// Open File in BufferReader mode
		int lineNumber=0;
		for( File currentTxtFile : txtFileList){
			BufferedReader bufReader = new BufferedReader(new FileReader(currentTxtFile));
			String currentLine;
			while ((currentLine = bufReader.readLine())!= null){
				lineNumber++;
				createOrUpdateIndexForGivenLine(lineNumber, currentLine, currentTxtFile.getAbsolutePath());
			}
			bufReader.close();
			//reset line count;
			lineNumber=0;
		
		}

	}

	
	private void createOrUpdateIndexForGivenLine(int lineNumber, String currentLine, String fileName) {
		Logger.debug(fileName + " - LineNumber - " + lineNumber + " - " + currentLine.length());
		
		//For every word in the Line create new entry or update the index
		StringTokenizer lineTokens = new StringTokenizer(currentLine," ");
		Logger.debug(fileName + " - " + currentLine.length());
		
	}

}
