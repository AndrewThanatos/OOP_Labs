package Lab_5;

public class Sentence {
    private SentenceElement[] sentenceElements;
    private String sentence;

    public Sentence(String sentence) {
        String[] sentenceElementsString =
                sentence.split("(?=[" +
                        Punctuation.punctuationSymbols +
                        "])| ");
        sentenceElements =
                new SentenceElement[sentenceElementsString.length];
        for (int i=0; i<sentenceElementsString.length; i++){
            if (Punctuation.isPunctuation(sentenceElementsString[i]))
                sentenceElements[i] = new Punctuation(sentenceElementsString[i]);
            else
                sentenceElements[i] = new Word(sentenceElementsString[i]);
        }

    }
}
