
import java.util.*;

public class SubArray {

    public static void main (String[] argv)
    {
	int[] A = {1, 4, 9, 16, 25, 36, 49, 64};
	int[] B = extract (A, 2, 5);
	System.out.println (Arrays.toString(B));
	// Should print {9,16,25,36}
    }

    static int[] extract (int[] A, int first, int last)
    {
	int[] B = new int [last - first + 1];
	int bInd = 0;
	for (int i=first; i<=last; i++) {
	    B[bInd++] = A[i];
	}
	return B;
    }
}
