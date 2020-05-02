package studentRecordsBackup.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import studentRecordsBackup.util.FileProcessor;
import studentRecordsBackup.util.Properties;
import studentRecordsBackup.util.StdoutDisplayI;
import studentRecordsBackup.util.BSTBuilder;
import studentRecordsBackup.bst.BSTInterface;
import studentRecordsBackup.util.InputReaderI;

/**
 * <p>
 * This class contains the main method.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public class Driver {

	/**
	 * <p>
	 * This is a main method.
	 * </p>
	 * 
	 * @param args
	 *            command line arguments.
	 */
	public static void main(String[] args) {
		Driver driver = new Driver();
		if (!driver.validateArguments(args)) {
			System.exit(1);
		}
		InputReaderI reader = new FileProcessor(args[0]);
		BSTBuilder bstBuilder = new BSTBuilder(reader);
		// call to construct three binary search tree.
		List<BSTInterface> trees = bstBuilder.construct();
		driver.displayTreeContents(trees);
		driver.displaySum(trees);
		// call to update the Binary Search Tree with update value.
		BSTInterface originalBST = trees.get(Properties.ORIGINAL.getIndex());
		originalBST.update(Integer.parseInt(args[1]));
		driver.displaySum(trees);
	}

	/**
	 * <p>
	 * This method displays the contents of each of the trees by traversing the
	 * tree in-order.
	 * </p>
	 * 
	 * @param trees
	 *            list of trees for which contents are to be displayed.
	 */
	private void displayTreeContents(List<BSTInterface> trees) {
		for (Properties property : Properties.values()) {
			StdoutDisplayI result = (StdoutDisplayI) trees.get(property.getIndex());
			result.printInorder();
		}
	}

	/**
	 * <p>
	 * This method displays the sum of all B-Numbers stored in a binary search
	 * tree.
	 * </p>
	 * 
	 * @param trees
	 *            list of trees for which sums are to be displayed.
	 */
	private void displaySum(List<BSTInterface> trees) {
		System.out.println();
		for (Properties property : Properties.values()) {
			StdoutDisplayI result = (StdoutDisplayI) trees.get(property.getIndex());
			result.printBSum();
		}
	}

	/**
	 * <p>
	 * This method validates the command line arguments. It performs following
	 * validations:
	 * </p>
	 * <li>1. checks whether the given filename is valid i.e. if a stream can be
	 * created of the file with given filename.</li>
	 * <li>2. Validates if the second argument is an integer.</li>
	 * 
	 * @param args
	 *            command line arguments.
	 * @return true if all arguments are valid otherwise throws an error to
	 *         standard output and exits the application.
	 */
	private boolean validateArguments(String[] args) {
		if (args.length != 2) {
			System.err.println("Please enter a valid number of arguments.");
			System.exit(1);
		}
		File file = new File(args[0]);
		if (file.isFile() && file.canRead()) {
			try {
				new FileInputStream(file);
			} catch (IOException exception) {
				System.err.println("File Stream could not be created. " + exception);
				System.exit(1);
			}
		} else {
			System.err.println("Please provide a valid file. ");
			System.exit(1);
		}
		try {
			Integer.parseInt(args[1]);
		} catch (NumberFormatException exception) {
			System.err.println("Please enter an argument in valid format. " + exception);
			System.exit(1);
		}
		return true;
	}

}