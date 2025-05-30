package solidPrinciple.singleresponsibilty;

public class BadBook {
    private String name;
    private String text;
    private String author;

    public BadBook(String name, String text, String author){
        this.name = name;
        this.text = text;
        this.author = author;
    }

    public String replaceWordInText(String word, String replacementWord){
        return this.text.replaceAll(word, replacementWord);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }

    void printTextToConsole(String text){

    }
}
