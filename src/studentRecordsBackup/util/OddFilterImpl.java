package studentRecordsBackup.util;

/**
 * <p>
 * This class implements OddEvenFilterI interface to return true if an update
 * value is odd.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class OddFilterImpl implements OddEvenFilterI {

	/**
	 * <p>
	 * This method is used to check whether the input value to the method is
	 * odd.
	 * </p>
	 * 
	 * @return true if input value is odd, true otherwise.
	 */
	@Override
	public boolean check(Integer updateValue) {
		return !((updateValue % 2) == 0);
	}
}
