package behavioural_patterns.composite.todo_list;

// Leaf Node
public class Text implements Todo {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String getHtml() {
        return this.text;
    }
}
