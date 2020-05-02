package studentRecordsBackup.bst;

import java.util.Map;
import java.util.HashMap;

import studentRecordsBackup.util.OddEvenFilterI;

/**
 * <p>
 * This class acts as a subject as well as observer in this assignment. Hence it
 * implements both ObserverI and SubjectI interfaces.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class Node implements SubjectI, ObserverI {

	/**
	 * This variable is used to store B-Number.
	 */
	private Integer number;

	/**
	 * this variable is used to store the mapping between
	 * observerAgainstFilterMap. Here value is just a filter object since there
	 * can be only one filter associated with the observer in this assignment.
	 */
	private Map<ObserverI, OddEvenFilterI> observerAgainstFilterMap;

	/**
	 * This variable is used to store reference to the left subtree.
	 */
	private Node left;

	/**
	 * This variable is used to store reference to the right subtree.
	 */
	private Node right;

	/**
	 * This variable is used to store information about whether the B-Number
	 * stored in this node is maximum amongst all the nodes in the binary search
	 * tree.
	 */
	private boolean isMaximum;

	public Node(int numberIn) {
		observerAgainstFilterMap = new HashMap<ObserverI, OddEvenFilterI>();
		number = numberIn;
	}

	/**
	 * <p>
	 * This method is used to update B-Numbers stored in observers.
	 * </p>
	 */
	@Override
	public void update(int updatedValue) {
		number += updatedValue;
	}

	/**
	 * <p>
	 * This method registers the observers in a HashMap data structure.
	 * </p>
	 */
	@Override
	public void registerObeserver(ObserverI observer, OddEvenFilterI filter) {
		observerAgainstFilterMap.put(observer, filter);
	}

	/**
	 * <p>
	 * This method removes an observer from a HashMap data structure.
	 * </p>
	 */
	@Override
	public void removeObserver(ObserverI observer) {
		observerAgainstFilterMap.remove(observer);
	}

	/**
	 * <p>
	 * This method is used to update observers of the current subject node based
	 * on filtering.
	 * </p>
	 */
	@Override
	public void notifyObservers(int updateValue) {
		observerAgainstFilterMap.entrySet().stream().filter(entry -> {
			OddEvenFilterI oef = entry.getValue();
			return oef.check(updateValue);
		}).forEach(entry -> {
			ObserverI observer = entry.getKey();
			observer.update(updateValue);
		});
	}

	/**
	 * <p>
	 * This method is used to update the BNumber from the subject node and call
	 * notifyAll() observers method to update corresponding observers.
	 * </p>
	 * 
	 * @param updateValue
	 *            value by which the BNumber stored in the current node needs to
	 *            be updated.
	 */
	public void updateNode(int updateValue) {
		if (isMaximum()) {
			number = number + 2 * updateValue;
		} else {
			number += updateValue;
		}
		notifyObservers(updateValue);
	}

	/**
	 * @return the isMaximum
	 */
	public boolean isMaximum() {
		return isMaximum;
	}

	/**
	 * @param isMaximum
	 *            the isMaximum to set
	 */
	public void setMaximum(boolean isMaximum) {
		this.isMaximum = isMaximum;
	}

	/**
	 * @return the number
	 */
	public Integer getNumber() {
		return number;
	}

	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}

}