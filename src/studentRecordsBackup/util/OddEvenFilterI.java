package studentRecordsBackup.util;

/**
 * <p>
 * This interface declares a method to check whether a given number is even or odd.
 * </p>
 * 
 * 
 * @author Anand Kulkarni
 *
 */
public interface OddEvenFilterI {

	/**
	 * <p>
	 * This method is used to check whether the given number is even or odd.
	 * </p>
	 * 
	 * @param updateValue
	 *            value to be tested.
	 * @return depends on the implementation.
	 */
	public boolean check(Integer updateValue);

}
