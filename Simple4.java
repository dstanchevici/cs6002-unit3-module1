
public class Simple4 {

    static int[] A;

    public static void main (String[] argv)
    {
        A = new int [4];
        // At this point: A will have an address (a pointer).

	for (int i=0; i<4; i++) {
	    A[i] = i*i;
	}
    }

}
