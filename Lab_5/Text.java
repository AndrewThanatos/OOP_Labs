package Lab_5;

public class Text {
    private Sentence[] sentences;
    String text;

    public Text(String text){
        String[] sentensesString = text.split("(?<=[?!.]) ");
        sentences = new Sentence[sentensesString.length];

        for (int i=0; i<sentensesString.length; i++){
            sentences[i] = new Sentence(sentensesString[i]);
        }
    }

}
