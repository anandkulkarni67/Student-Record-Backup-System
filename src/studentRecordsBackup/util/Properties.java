package studentRecordsBackup.util;

/**
 * <p>
 * This enum is used document information about number of data structures.
 * </p>
 * 
 * @author Anand Kulkarni
 *
 */
public enum Properties {

	// Original data structure.
	ORIGINAL(0),
	// Backup data structure 1.
	BACKUP_1(1),
	// Backup data structure 2.
	BACKUP_2(2);

	// this variable is used to store index of a variable.
	private final int index;
	// this variable is used store to maximum number data structures.
	private final int noDataStructures = 3;

	private Properties(int indexIn) {
		index = indexIn;
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @return the noDataStructures
	 */
	public int getNoDataStructures() {
		return noDataStructures;
	}

}
