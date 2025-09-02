public class Main {
    public static void main(String[] args){
    numOccur("happy", "a");
    numOccur("happy", "p");
    numOccur("happy", "A");

    // #2: returns the number of occurrences of word, which may have many characters
    System.out.println(numOccurs("happy to be with the two of you too", "to"));
    System.out.println(numOccurs("happy to be with the two of you too", "th"));
    System.out.println(numOccurs("happy to be with the two of you too", "o"));
    System.out.println(numOccurs("happy to be with the two of you too", "Happy"));

    // #3: returns the index where the characters in the String begin to increase (the ASCII Value increase)
    // ex.  findIncreaseStart("ZZYYYYYRMPLLCCA")  return 9 because that is the index of the first increasing char
    // ex.  findIncreaseStart("ZZYYYYYRM")  return -1 because there is no increasing char
    // ex.  findIncreaseStart("ABC")  return 1 because that is the index of the first increasing char
    // In answering this, you MUST use compareTo

    // #4: returns the number of vowels in str.  In solving this problem, you MUST use numOccur.
    // assume all lowercase letters

    // #5: returns a String that consists of all the characters in str except the vowels
    //assume all lowercase letters
    // eliminateVowels("happiness")   returns "hppnss"

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
            if(str.substring(i, i+word.length()).equals(word)){   
                x++;

            }
        }
        return x;
    }


    //#3
    public int findIncreaseStart(String str){

        return 0;
    }

    //#4
    public int countVowels(String str){

        return 0;
    }

    //#5
    public String eliminateVowels(String str){

        return null;
    }

}


