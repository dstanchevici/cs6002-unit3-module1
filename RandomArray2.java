
public class RandomArray2 {

    // Declare a global variable for keeping count of sorted in increasing order.
    static int numOfIncreasingSorted = 0;

    public static void main (String[] argv)
    {
        double p = estimateSortedProb (5, 100_000);
        System.out.println ("Probability an array of length 5 is sorted: " + p);
	
	double pOfIncreasing = (double) numOfIncreasingSorted / 100_000.0;
        System.out.println ("Probability an array of length 5 is sorted in increasing order is: " + pOfIncreasing);
    }
    

    static double estimateSortedProb (int arraySize, int numTrials) 
    {
        // Count the number of sorted arrays generated.
        int numSorted = 0;

        // Repeat for given number of experiments.
        for (int n=0; n<numTrials; n++) {

            // Generate a random array.
            int[] randomInts = new int [arraySize];
            for (int i=0; i<randomInts.length; i++) {
                randomInts[i] = RandTool.uniform (1, 100);
            }
            
            // See if sorted.
            if ( checkSorted(randomInts) ) {
                numSorted ++;
            }

        } //end-for-numTrials
        
        // The fraction of trials that resulted in a sorted array:
        double prob = (double) numSorted / (double) numTrials;

        return prob;
    }

    static boolean checkSorted (int[] A) {
	if (A[0] < A[1]) {
	    for (int i=1; i<A.length-1; i++) {
		if (A[i] > A[i+1]) {
		    return false;
		}
	    }
	   
	    // Keep count of sorted in increasing order.
	    numOfIncreasingSorted++;

	    return true;
	}
	else {
	    for (int i=1; i<A.length-1; i++) {
		if (A[i] < A[i+1]) {
		    return false;
		}
	    }
	    return true;
	}
    }

}
