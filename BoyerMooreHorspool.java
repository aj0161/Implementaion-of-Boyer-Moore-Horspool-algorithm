/**
 * This function implements Boyer Moore Horspool algorithm.
 * In this algorithm, the comparison is done from right to left, starting with the last character in the pattern
 */

public class BoyerMooreHorspool {

    public static int FindUsingArray(String searchTo, String text) {

        if ( text.length() - searchTo.length() < 0 ) {
            return -1;
        }

        int[] MatchTable = new int[256]; //ASCII values

        //Acc to the algorithm, don't use the last chars
        int LastCharacterLength = (searchTo.length()) -1 ;


        for (int character = 0; character < LastCharacterLength; character++) {

            MatchTable[searchTo.charAt(character)] = MatchTable[searchTo.charAt(character)]+ 1;
        }

        int index = 0;

        int difference = text.length() - searchTo.length();

        while (index <= difference) {

            int B = text.charAt(index + LastCharacterLength);
            int C = searchTo.charAt(LastCharacterLength);

            while (C == B) {

                 B = text.charAt(index + LastCharacterLength);
                 C = searchTo.charAt(LastCharacterLength);

                //move to the next character
                LastCharacterLength--;

                if (LastCharacterLength <= 0) {
                    return index;
                }
            }
            int des = text.charAt(index + LastCharacterLength);
            index += LastCharacterLength - MatchTable[des];
        }

        return -1;

    }

    public static int FindUsingHash(String searchTo, String text) {

        return 1;
    }
}
