package studentRecordsBackup.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import studentRecordsBackup.bst.BST;
import studentRecordsBackup.bst.Node;
import studentRecordsBackup.bst.BSTInterface;

/**
 * <p>
 * This class is responsible for building multiple binary search trees at a
 * time.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class BSTBuilder {

	// This variable is used to hold reference of an input reader variable.
	private InputReaderI reader;

	public BSTBuilder(InputReaderI readerIn) {
		reader = readerIn;
	}

	/**
	 * <p>
	 * This method reads the input using an input reader and constructs multiple
	 * identical trees.
	 * </p>
	 * 
	 * @param noBackups
	 *            Number of backup trees to be created (excluding the original
	 *            tree).
	 * @return List of trees.
	 */
	public List<BSTInterface> construct() {
		String line = null;
		List<BSTInterface> list = new ArrayList<BSTInterface>();
		OddEvenFilterI evenFilter = new EvenFilterImpl();
		OddEvenFilterI oddFilter = new OddFilterImpl();

		Arrays.asList(Properties.values()).stream().forEach(property -> {list.add(getNewBST());});

		while ((line = reader.readLine()) != null) {
			int number = Integer.parseInt(line);
			Node nodeO = list.get(Properties.ORIGINAL.getIndex()).insert(number);
			nodeO.registerObeserver(list.get(Properties.BACKUP_1.getIndex()).insert(number), evenFilter);
			nodeO.registerObeserver(list.get(Properties.BACKUP_2.getIndex()).insert(number), oddFilter);
		}
		Node maxNode = list.get(Properties.ORIGINAL.getIndex()).findMaxNode();
		if (null != maxNode) {
			maxNode.setMaximum(true);
		}
		return list;
	}

	/**
	 * <p>
	 * This method returns a new instance of a BST class.
	 * </p>
	 * 
	 * @return
	 */
	private BST getNewBST() {
		return new BST();
	}

	@Override
	public String toString() {
		return "BSTBuilder [reader=" + reader + "]";
	}
}