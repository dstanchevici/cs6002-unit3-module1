
public class PangramCheck {

    public static void main (String[] argv)
    {
        // Pangram: a sentence with at least one occurence of each letter 'a' to 'z'.

        String[] pangramWords = {"two", "driven", "jocks", "help", "fax", "my", "big", "quiz"};
        boolean isPangram = checkPangram (pangramWords);
        System.out.println ("isPangram=" + isPangram);

        String[] pangram2 = {"the", "quick", "brown", "fox", "jumps", "over", "a", "lazy", "dog"};
        isPangram = checkPangram (pangram2);
        System.out.println ("isPangram=" + isPangram);

        String[] pangram3 = {"how", "vexingly", "quick", "daft", "zebra", "jumped"};
        isPangram = checkPangram (pangram3);
        System.out.println ("isPangram=" + isPangram);

    }


    static boolean checkPangram (String[] words)
    {

	String sentenceString = "";
	for (String w: words) {
	    sentenceString += w;
	}

	if (sentenceString.length() < 26) {
	    return false;
	}

        int start = (int) 'a';
        int end = (int) 'z';

	for (int i=start; i<=end; i++) {

	    boolean charFound = false;

	    for (int j=0; j < sentenceString.length(); j++) {
		int nOfCh = (int) sentenceString.charAt(j);
		if (i == nOfCh) {
		    charFound = true;
		    break;
		}
	    }
	    
	    if (charFound == false) {
		return false;
	    }

	}

	return true;

    }

}

