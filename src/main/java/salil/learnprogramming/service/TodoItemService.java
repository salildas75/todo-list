package salil.learnprogramming.service;

import salil.learnprogramming.model.TodoData;
import salil.learnprogramming.model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
