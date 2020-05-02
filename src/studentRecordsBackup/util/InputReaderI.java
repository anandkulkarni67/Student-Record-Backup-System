package studentRecordsBackup.util;

/**
 * <p>
 * This interface declares all methods required to read input from an input
 * source.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public interface InputReaderI {

	/**
	 * <p>
	 * This method reads a line from an input file. It returns a null if end og
	 * input is reached.
	 * </p>
	 * 
	 * @return line read from the input source.
	 */
	public String readLine();

	/**
	 * <p>
	 * This method is used to close the input resource.
	 * </p>
	 */
	public void close();

}
