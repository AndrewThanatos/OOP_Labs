package Lab_5;

public class Punctuation extends SentenceElement{
    static final String punctuationSymbols = "!.?,;:";
    private String punctuationString;

    public Punctuation(String punctuationStirng){
        this.punctuationString = punctuationStirng;
    }

    static boolean isPunctuation(String s){
        return punctuationSymbols.contains(s);
    }

}
