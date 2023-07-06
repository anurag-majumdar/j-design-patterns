package composite.todo_list;

import behavioural_patterns.composite.todo_list.CompositeTodo;
import behavioural_patterns.composite.todo_list.Text;
import behavioural_patterns.composite.todo_list.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestTodoList {
    @Test
    public void testTodoList() {
        Text text1 = new Text("Todo Item 1");
        Text text2 = new Text("Todo Item 2");
        Text text3 = new Text("Todo Item 3");
        Text text4 = new Text("Todo Item 4");
        Text text5 = new Text("Todo Item 5");
        Text text6 = new Text("Todo Item 6");

        CompositeTodo subTodo1 = new CompositeTodo("TodoList1", List.of(text1, text2, text3));
        CompositeTodo subTodo2 = new CompositeTodo("TodoList2", List.of(text4, text5, text6));

        CompositeTodo rootCompositeTodo = new CompositeTodo("Main List", List.of(subTodo1, subTodo2));
        String html = rootCompositeTodo.getHtml();
        System.out.println(html);

        Assertions.assertNotNull(html);
    }
}
