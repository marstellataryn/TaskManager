import java.util.ArrayList;

// task class for individual task
class Task {
    private String title;
    private String description;
    private String dueDate;
    private boolean highPriority;
    private boolean completed;

    // constructor to create new tasks
    public Task(String title, String description, String dueDate, boolean highPriority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.highPriority = highPriority;
        this.completed = false;
    }

    // method to complete task
    public void markComplete() {
        this.completed = true;
    }
}

// category class for type of task
class Category {
    private String categoryName;
    private String categoryColor;
    private ArrayList<Task> tasks;

    // constructor to create a new category
    public Category(String categoryName, String categoryColor) {
        this.categoryName = categoryName;
        this.categoryColor = categoryColor;
        this.tasks = new ArrayList<>();
    }

    // method to categorize task
    public void addTask(Task task) {
        task.add(task);
    }

    // method to remove task category
    public void deleteTask(Task task) {
        task.remove(task);
    }
}

// taskmanager class for overall functionality
class TaskManager {
    private ArrayList<Task> taskList;
    private ArrayList<Category> categoryList;

    // constructor to create new task manager
    public TaskManager() {
        this.taskList = new ArrayList <>();
        this.categoryList = new ArrayList<>();
    }

    //method to add a task and category
    public void addTask(Task task, Category category) {
        taskList.add(task);
        category.addTask(task);
    }

    // method to delete task/category
    public void deleteTask(Task task, Category category) {
        taskList.remove(task);
        category.deleteTask(task);
    }
}