package studentRecordsBackup.util;

import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * <p>
 * This class contains logic pertaining to file operations.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class FileProcessor implements InputReaderI {

	// A reader object used to read contents of a file.
	private BufferedReader fileReader = null;

	public FileProcessor(String fileNameIn) {
		try {
			fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileNameIn))));
		} catch (FileNotFoundException exception) {
			System.err.println("File Not Found.");
			exception.printStackTrace();
			System.exit(1);
		}
	}

	/**
	 * <p>
	 * This method reads a line from an input file. It returns a null if end of
	 * input is reached.
	 * </p>
	 * 
	 * @return next line from an input file / null if end of input is reached.
	 */
	public String readLine() {
		try {
			return fileReader.readLine();
		} catch (IOException exception) {
			System.err.println("Error occured while reading a file.");
			System.exit(1);
		}
		return null;
	}

	/**
	 * <p>
	 * This method is responsible for closing a file.
	 * </p>
	 * 
	 * @return none
	 */
	public void close() {
		try {
			fileReader.close();
		} catch (IOException e) {
			System.err.println("Error occured while closing a file.");
			System.exit(1);
		}
	}

	/**
	 * Overridden toString() method.
	 */
	@Override
	public String toString() {
		return "FileProcessor [fileReader=" + fileReader + "]";
	}
}