package studentRecordsBackup.bst;

/**
 * <p>
 * This interface declares all methods that are required to implement Binary
 * search tree for this assignment.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public interface BSTInterface {
	/**
	 * <p>
	 * This method inserts a new BNumber in a binary search tree.
	 * </p>
	 * 
	 * @param number
	 *            B-Number to be inserted in a binary search tree.
	 * @return
	 */
	public Node insert(int number);

	/**
	 * <p>
	 * This method increment the B-Numbers of all nodes in a binary search tree
	 * by update value.
	 * </p>
	 * 
	 * @param updateValue
	 */
	public void update(int updateValue);

	/**
	 * <p>
	 * This method finds a node with maximum value in a binary search tree.
	 * </p>
	 * 
	 * @return node with maximum B-Number.
	 */
	public Node findMaxNode();

}
