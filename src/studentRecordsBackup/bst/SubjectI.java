package studentRecordsBackup.bst;

import studentRecordsBackup.util.OddEvenFilterI;

/**
 * <p>
 * This interface declares all methods which are required to be implemented by
 * Subject implementation.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public interface SubjectI {

	/**
	 * <p>
	 * This method is used to register an Observer with a subject.
	 * </p>
	 * 
	 * @param observer
	 *            observer object to be registered.
	 * @param filter
	 *            filter associated with an observer
	 */
	public void registerObeserver(ObserverI observer, OddEvenFilterI filter);

	/**
	 * <p>
	 * This method is used remove association between subject and observer.
	 * </p>
	 * 
	 * @param observer
	 *            observer object to be removed.
	 */
	public void removeObserver(ObserverI observer);

	/**
	 * <p>
	 * This method is used to notify all observers of a particular subject.
	 * </p>
	 * 
	 * @param updateValue
	 *            value to be updated by.
	 */
	public void notifyObservers(int updateValue);

}
