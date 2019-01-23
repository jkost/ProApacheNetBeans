package todo.model;

import java.util.List;

/**
 *
 * @author ikost
 */
public interface TaskManagerInterface {

    void addTask(Task task) throws ValidationException;

    List<Task> listAllTasks(boolean priorityOrDate);

    List<Task> listTasksWithAlert() throws ModelException;

    void markAsCompleted(int id, boolean completed);

    void removeTask(int id) ;

    void updateTask(Task task) throws ValidationException;
    
}
