package studentRecordsBackup.util;

/**
 * <p>
 * This class implements OddEvenFilterI interface to return true if an update
 * value is even.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class EvenFilterImpl implements OddEvenFilterI {

	/**
	 * <p>
	 * This method is used to check whether the input value to the method is
	 * even.
	 * </p>
	 * 
	 * @return true if input value is even, false otherwise.
	 */
	@Override
	public boolean check(Integer updateValue) {
		return ((updateValue % 2) == 0);
	}
}
