package in.ravived.lnd.basicindex;

import java.io.BufferedReader;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SimpleIndex {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleIndex.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.debug("Hello from BasicIndex..start");
		
		
	   //check if argument exist and its a directory
		
		//get list of files in a directory - no recursive feature
		
		// for every file in directory ...
		
		   //check if file  is of type txt
		
		  // open file and read every line
		
		  ///

	}
	
	
	private boolean checkArguments(String[] args){
		
		return true;
	}
	

	private List<File> getFileList(String dirPath){
		File folder = new File(dirPath);
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles){
		
			FilenameUtils.getExtension(file.getName());
			
		
		}
		
		return null;
	}
	

	private void createIndexForEachFileInList(List<File> fileList){
		
		//For every file
			//Open File in BufferReader mode
	
		
				
	}
	
	private void createIndexForEachOpenFile(BufferedReader openFileBR){
		
		// for every line in the file
			// get every word in the file
			
			//createOrUpdateIndex()
		
		
		
	}
	
	private void createOrUpdateIndex(String word, String fileName){
		
	}

	
}
