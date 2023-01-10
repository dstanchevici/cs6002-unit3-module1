
import java.util.*;

public class OddExercise {

    public static void main (String[] argv)
    {
	int[] oddIntegers = makeOddArray (10);
	System.out.println ( "Our array: " + Arrays.toString(oddIntegers) );

        boolean found = search (5, oddIntegers);
        System.out.println ("found=" + found);

        found = search (6, oddIntegers);
        System.out.println ("found=" + found);
    }


    // Note: return type is an array.

    static int[] makeOddArray (int size)
    {
	// Note use of variable "size" in creating array space.
	int[] oddGuys = new int [size];
	for (int i=0; i<oddGuys.length; i++) {
	    oddGuys[i] = 2*i + 1;
	}
	return oddGuys;
    }

    static boolean search (int x, int[] numbers)
    {
        for (int i=0; i<numbers.length; i++) {
	    if (x==numbers[i]) {
		return true;
	    }
	}
	return false;
    }

}
