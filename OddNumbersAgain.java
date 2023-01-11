
public class OddNumbersAgain {

    public static void main (String[] argv)
    {
	int[] odds = {1, 3, 5, 7, 9};
	int[] odds2 = {};

	// Read this example:
	printTwice (odds);

	// Debug this one: -- DEBUGGED
	printTwice (odds2);

	// Debug this one:
	differentPrint (odds);
    }

    static void printTwice (int[] A)
    {
	if (A.length > 0) {
	    printWithWhile (A);
	    printWithDo (A);
	}
	else {
	    System.out.println ("The array is empty.");
	}

    }

    static void differentPrint (int[] A)
    {
	printWithWhile2 (A);
    }

    static void printWithWhile (int[] A)
    {
	System.out.print ("  Array elements: ");
	int i=0;
	while (i < A.length) {
	    System.out.print ("  " + A[i]);
	    i ++;
	}
	System.out.println ();
    }

    static void printWithDo (int[] A)
    {
	System.out.print ("  Array elements: ");
	int i=0;
	do {
	    System.out.print ("  " + A[i]);
	    i ++;
	} while (i < A.length);
	System.out.println ();
    }

    static void printWithWhile2 (int[] A)
    {
	System.out.print ("  Array elements: ");
	int i=0;
	while (i < A.length) {
	    System.out.print ("  " + A[i]);
	    i ++;
	}
	System.out.println ();
    }

}
