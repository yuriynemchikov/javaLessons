package Planner;

import java.util.ArrayList;

public class Task extends ArrayList<Task> {
    private int id;
    private String dateOfAdd;
    private String deadline;
    private String nameAuthor;
    private Priority priorityLevel;

    private Task t;

    public Task(int id, String dateOfAdd, String deadline, String name, Priority priorityLevel){
        this.id = id;
        this.dateOfAdd = dateOfAdd;
        this.deadline = deadline;
        this.nameAuthor = name;
        this.priorityLevel = priorityLevel;
    }

    public int getId(){
        return id;
    }

    public String getDateOfAdd(){
        return dateOfAdd;
    }

    public String getDeadline(){
        return deadline;
    }


    public void setDeadline(String deadline){
        this.deadline = deadline;
    }

    public String getName(){
        return nameAuthor;
    }

    public void setName(String name){
        this.nameAuthor = name;
    }

    public String getLevel(){
        if(this.priorityLevel == Priority.HIGH){
            return String.format("Немедленное выполнение");
        }
        else if(this.priorityLevel == Priority.LOW){
            return String.format("Низкий приоритет");
        }
        else {
            return String.format("Средний приоритет");
        }
    }

    public void setPriorityLevel(Priority level){
        this.priorityLevel = level;
    }

    @Override
    public String toString() {
        return String.format("id: %d, Дата добавления: %s, Дедлайн: %s, Автор задачи: %s, Приоритет: %s", this.id, this.dateOfAdd,
                this.deadline, this.nameAuthor, this.priorityLevel);
    }

}
