public class palindrome {

    private String word; //number of characters between 0-20
    private boolean palindrome; //declaration of a palindrome
    private boolean mirrored; // declaration od a mirrored string

    //Default Constructor setting all values to false
    private palindrome() {
        word="";
        palindrome= false;
        mirrored= false;

    }

    //Overloaded Constructor
    palindrome(String w) {
        this();
        setWord(w);
        checkPalindrome();
        checkMirrored();
        checkMirrorPalindrome();
    }
    //Set methods
    private void setWord(String w) {
        if(w.length()<=20) {
            this.word=w.trim().toUpperCase();
        }
    }
   //checks to see if the word inputted by the user is same as the word in reverse
    private void checkPalindrome() {
        String rev= reverse(word);
        //if it returns false it is not a palindrome
        this.palindrome= word.equals(rev); // if it returns true it is classified as a palindrome
    }

    //checks is the string inputted in reverse by the user is the same as the original
    private void checkMirrored() {
        String word2=reverse(replaceLetters(word));
        // it is not a palindrome
        this.mirrored= word.equals(word2); //it is a palindrome

    }

    //Checks if the string inputted by the user is both a mirrored string  and a palindrome
    private void checkMirrorPalindrome() {
    }

    private String reverse(String word) {
        StringBuilder rev= new StringBuilder();

        for(int i=word.length()-1;i>=0;i--) {
            rev.append(word.charAt(i));
        }
        return rev.toString(); //returns the reverse of the string

    }

    //this method replaces the letters with the reverse of those letters
    private String replaceLetters(String w) {
        String character="AEHIJLMOSTUVWXYZ12358";
        String reverse= "A3HILJMO2TUVWZY51SEZ8";

        char[]word= w.toCharArray();

        for(int i=0;i<w.length();i++) {
            int index = character.indexOf(word[i]);


            if(index==-1) {
                word[i]=' ';
                break;
            }
            else {
                word[i]=reverse.charAt(index);
            }
        }
        return new String(word);

    }
    //Returns the word along with the corresponding type
    String checkType() {
        if(!palindrome && !mirrored) {
            return word + " -- is not a palindrome"; //returns message if string is not a palindrome
        }
        else if(palindrome && !mirrored) {
            return word + " -- is a regular palindrome"; //returns message if string is not a regular palindrome
        }
        else if(!palindrome) {
            return word + " -- is a mirrored string"; //returns message if string is not a mirrored string
        }
        else{
            return word + " -- is mirrored palindrome"; // returns message if string is a mirrored palindrome
        }
    }

    //returns the string representation of the object
    public String toString() {
        return word; //returns the word
    }
}
