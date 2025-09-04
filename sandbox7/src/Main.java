public class Main {
    public static void main(String[] args){
    // numOccur("happy", "a");
    // numOccur("happy", "p");
    // numOccur("happy", "A");

    // #2: returns the number of occurrences of word, which may have many characters
    // System.out.println(numOccurs("happy to be with the two of you too", "to"));
    // System.out.println(numOccurs("happy to be with the two of you too", "th"));
    // System.out.println(numOccurs("happy to be with the two of you too", "o"));
    // System.out.println(numOccurs("happy to be with the two of you too", "Happy"));

    // #3: returns the index where the characters in the String begin to increase (the ASCII Value increase)
    // System.out.println(findIncreaseStart("ZZYYYYYRMPLLCCA"));
    // System.out.println(findIncreaseStart("ZZYYYYYRM"));
    // System.out.println(findIncreaseStart("ABC"));
    // In answering this, you MUST use compareTo

    // #4: returns the number of vowels in str.  In solving this problem, you MUST use numOccur.
    // assume all lowercase letters
    // System.out.println(countVowels("abcdefghijklmnopqrstuvwxyz"));
    // System.out.println(countVowels("asdf;kqhwerypknvm,zxbcv,mandc;klshdlkjhdjglas sdhfaslkdfhlq"));

    // #5: returns a String that consists of all the characters in str except the vowels
    //assume all lowercase letters
    System.out.println(eliminateVowels("happiness"));

    }

    //#1
    public static int numOccur(String str, String word){
        int x = 0;
        for (int i = 0; i<str.length(); i++){
            if(str.substring(i, i+1).equals(word)){
                x++;
            }
        }
        return x;
    }

    // #2
    public static int numOccurs(String str, String word){
        int x = 0;
        for (int i = 0; i<str.length()-word.length()+1; i++){
            System.out.println(str.substring(i, i+word.length()));
            if(str.substring(i, i+word.length()).equals(word)){   
                x++;
            }
        }
        return x;
    }


    //#3
    public static int findIncreaseStart(String str){
        String letters = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int[] ints = new int[str.length()];
        for (int i = 0; i<str.length(); i++){
            ints[i] = letters.indexOf(str.substring(i, i+1));
            System.out.println(letters.indexOf(str.substring(i, i+1)));
        }
        for (int i = 1; i<ints.length; i++){
            if (ints[i-1] < ints[i]){
                return i;
            }
        }
        return -1;
    }

    //#4
    public static int countVowels(String str){
        return numOccur(str, "a") + numOccur(str, "e") + numOccur(str, "i") + numOccur(str, "o") + numOccur(str, "u");
    }

    //#5
    public static String eliminateVowels(String str){
        str = str.replaceAll("a", "");
        str = str.replaceAll("e", "");
        str = str.replaceAll("i", "");
        str = str.replaceAll("o", "");
        str = str.replaceAll("u", "");
        return str;
    }

}


