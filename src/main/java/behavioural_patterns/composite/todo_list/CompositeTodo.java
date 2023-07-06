package behavioural_patterns.composite.todo_list;

import java.util.List;

public class CompositeTodo implements Todo {
    private String title;
    private List<Todo> todos;

    public CompositeTodo(String title, List<Todo> todos) {
        this.title = title;
        this.todos = todos;
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder("<h1>" + this.title + " </h1> \n<ul>");
        for (Todo todo : this.todos) {
            html.append("\n\t<li> ").append(todo.getHtml()).append(" </li>");
        }
        html.append("\n</ul>");

        return html.toString();
    }
}
