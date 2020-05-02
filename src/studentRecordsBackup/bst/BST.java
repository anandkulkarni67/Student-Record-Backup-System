package studentRecordsBackup.bst;

import studentRecordsBackup.util.StdoutDisplayI;

/**
 * <p>
 * This class contains logic for all the operations performed on Binary search
 * tree.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class BST implements BSTInterface, StdoutDisplayI {

	private Node rootNode = null;

	/**
	 * <p>
	 * This method is used to insert a new B-Number is a binary search tree.
	 * </p>
	 * 
	 * @param number B-Number to be insrted,
	 * @return Newly inserted node.
	 */
	@Override
	public Node insert(int number) {
		return insert(rootNode, new Node(number));
	}

	/**
	 * <p>
	 * This method uses recursion while inserting a node into the tree.
	 * </p>
	 * 
	 * @param currentNode
	 *            Stores details about the current node while recursively
	 *            traversing the tree.
	 * @param newNode
	 *            New node to be inserted into the tree.
	 * @return Newly inserted node.
	 */
	private Node insert(Node currentNode, Node newNode) {
		if (isEmpty()) {
			rootNode = newNode;
		} else {
			if (currentNode.getNumber() > newNode.getNumber()) {
				if (null == currentNode.getLeft()) {
					currentNode.setLeft(newNode);
				} else {
					insert(currentNode.getLeft(), newNode);
				}
			} else {
				if (null == currentNode.getRight()) {
					currentNode.setRight(newNode);
				} else {
					insert(currentNode.getRight(), newNode);
				}
			}
		}
		return newNode;
	}

	/**
	 * <p>
	 * This method is used to print the all B-Numbers from a tree by using
	 * in-order traversal.
	 * </p>
	 * 
	 */
	@Override
	public void printInorder() {
		if (null == rootNode) {
			System.out.println("<Empty Tree>");
		} else {
			printInorder(rootNode);
			System.out.println();
		}
	}

	/**
	 * <p>
	 * This method uses recursion while traversing the tree using In-order
	 * traversal algorithm and prints all B-Numbers stored in a tree data
	 * structure.
	 * </p>
	 * 
	 * @param currentNode
	 *            Stores details about the current node while recursively
	 *            traversing the tree using in-order traversal algorithm.
	 */
	private void printInorder(Node currentNode) {
		if (null != currentNode) {
			printInorder(currentNode.getLeft());
			System.out.printf("%-5d", currentNode.getNumber());
			printInorder(currentNode.getRight());
		}
	}

	/**
	 * <p>
	 * This method is used to update the tree using update value.
	 * </p>
	 */
	@Override
	public void update(int updateValue) {
		updateNodeValue(rootNode, updateValue);
	}

	/**
	 * <p>
	 * This method updates all B-Numbers stored in the binary search tree by
	 * traversing the tree using pre-order traversal.
	 * </p>
	 * 
	 * @param currentNode
	 * @param updateValue
	 */
	private void updateNodeValue(Node currentNode, int updateValue) {
		if (null != currentNode) {
			currentNode.updateNode(updateValue);
			updateNodeValue(currentNode.getLeft(), updateValue);
			updateNodeValue(currentNode.getRight(), updateValue);
		}
	}

	/**
	 * <p>
	 * This method is used to find the maximum node from current tree.
	 * </p>
	 */
	@Override
	public Node findMaxNode() {
		if (!isEmpty()) {
			return getMaxNode(rootNode);
		}
		return null;
	}

	/**
	 * <p>
	 * This method is used to recursively find the maximum node in the current
	 * binary search tree.
	 * </p>
	 * 
	 * @param currentNode
	 * @return node with maximum B-Number.
	 */
	private Node getMaxNode(Node currentNode) {
		if (null == currentNode.getRight()) {
			return currentNode;
		}
		return getMaxNode(currentNode.getRight());
	}

	/**
	 * <p>
	 * This method is used to calculate the sum of all B-Numbers stored in a
	 * binary search tree.
	 * </p>
	 * 
	 * @param currentNode
	 *            node used to keep track current Node while recursively calling
	 *            the same method.
	 * @return sum of all B-Numbers in a tree.
	 */
	private int calculateSum(Node currentNode) {
		int sum, sumLT, sumRT;
		if (null == currentNode) {
			sum = 0;
			return sum;
		} else {
			sumLT = calculateSum(currentNode.getLeft());
			sumRT = calculateSum(currentNode.getRight());
			return sumLT + currentNode.getNumber() + sumRT;
		}
	}

	/**
	 * @return the rootNode
	 */
	public Node getRootNode() {
		return rootNode;
	}

	/**
	 * <p>
	 * This method validates whether the tree is empty or not.
	 * </p>
	 * 
	 * @return True if tree is empty, false otherwise.
	 */
	private boolean isEmpty() {
		return (null == rootNode);
	}

	/**
	 * <p>
	 * This method prints the sum of all b-Numbers stored in a tree.
	 * </p>
	 */
	public void printBSum() {
		System.out.println("The sum of all the B-Numbers is: " + calculateSum(rootNode));
	}

	@Override
	public String toString() {
		return "BST [rootNode=" + rootNode + "]";
	}

}