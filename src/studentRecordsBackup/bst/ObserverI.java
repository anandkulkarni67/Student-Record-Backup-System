package studentRecordsBackup.bst;

/**
 * <p>
 * This interface declares all methods which the observer implementation are
 * required to implement.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public interface ObserverI {

	/**
	 * <p>
	 * This method is used to notify observers with update value.
	 * </p>
	 * 
	 * @param updatedValue
	 *            new value.
	 */
	public void update(int updatedValue);

}
