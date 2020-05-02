PROJECT <3> README FILE

Author(s): <Anand Kulkarni>

PURPOSE:

[
  This project intends to use Observer pattern for updating backup data structures with an update value.
]

PERCENT COMPLETE:

[
  I believe, I have completed 100% of this project.
]

PARTS THAT ARE NOT COMPLETE:

[
  None.
]

BUGS:

[
  None.
]

FILES:

[
  Following files are included with this projectIncluded with this project are 4 files:
  BST.java: This class contains logic for all the operations performed on binary search tree.
  BSTInterface.java: This interface declares all methods that are required to implement Binary search tree for this assignment.
  Node.java: This class acts as a subject as well as observer in this assignment.
  ObserverI.java: This interface declares all methods which the observer implementation is required to implement.
  SubjectI.java: This interface declares all methods which are required to be implemented by Subject implementation.
  Driver.java: This class contains the main method.
  BSTBuilder.java: This class is responsible for building multiple binary search trees at a time.
  EvenFilterImpl.java: This class implements OddEvenFilterI interface to return true if an update value is even.
  FileProcessor.java: This class contains logic pertaining to file operations.
  InputReaderI.java:  This interface declares all methods required to read input from an input source.
  OddEvenFilterI.java: This interface declares a method to check whether a given number is even or odd.
  OddFilterImpl.java: This class implements OddEvenFilterI interface to return true if an update value is odd.
  Properties.java: This enum is used document information about number of data structures.
  StdoutDisplayI.java: This interface declares all methods which are necessary to display the output.
  README.txt: the text file you are presently reading.
]

SAMPLE OUTPUT:

[
  remote01:~/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System> ant -buildfile src/build.xml clean
  Buildfile: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/src/build.xml

  clean:
     [delete] Deleting directory /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/BUILD

  BUILD SUCCESSFUL
  Total time: 1 second
  remote01:~/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System> ant -buildfile src/build.xml all
  Buildfile: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/src/build.xml

  prepare:
      [mkdir] Created dir: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/BUILD
      [mkdir] Created dir: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/BUILD/classes

  studentRecordsBackup:
      [javac] /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/src/build.xml:48: warning: 'includeantruntime' was not set, 
              defaulting to build.sysclasspath=last; set to false for repeatable builds
      [javac] Compiling 14 source files to /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/BUILD/classes

  compile_all:

  all:

  BUILD SUCCESSFUL
  Total time: 2 seconds
  remote01:~/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=1
  Buildfile: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/src/build.xml

  jar:
      [mkdir] Created dir: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/BUILD/jar
      [jar] Building jar: /import/linux/home/akulka15/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System/BUILD/jar/studentRecordsBackup.jar

  run:
      [java] 1    2    3    4    5    6    7    8    9    10   
      [java] 1    2    3    4    5    6    7    8    9    10   
      [java] 1    2    3    4    5    6    7    8    9    10   
      [java] 
      [java] The sum of all the B-Numbers is: 55
      [java] The sum of all the B-Numbers is: 55
      [java] The sum of all the B-Numbers is: 55
      [java] 
      [java] The sum of all the B-Numbers is: 66
      [java] The sum of all the B-Numbers is: 55
      [java] The sum of all the B-Numbers is: 65

  BUILD SUCCESSFUL
  Total time: 1 second
  remote01:~/design patterns/assign3test/anand_kulkarni_assign3/Student_Records_Backup_System>
]

TO COMPILE:

[
  Steps for program compilation :
  1. Traverse inside the project folder by using following command :
	cd Student_Records_Backup_System/
  2. Compile all java classes by using following command :	
	ant -buildfile src/build.xml all
]

TO RUN:

[
  Steps for program execution :
  1. Execute following command to run the program :
	ant -buildfile src/build.xml run -Darg0=<INPUT_FILE_PATH> -Darg1=<UPDATE_VALUE>
	For example : ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=1
]

DATA STRUCTURES:

[
  1. HashMap<Observer, Filter> is used to store association between Observer and Filter.
]

EXTRA CREDIT:

[
  None.
]

BIBLIOGRAPHY:

This serves as evidence that we are in no way intending Academic Dishonesty.
<Anand Kulkarni>

[
  None.
]

ACKNOWLEDGEMENT:

[
  None.
]
