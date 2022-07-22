package Planner;

import java.util.Date;

public class Task {
    private int id;
    private Date dateOfAdd;
    private String deadline;
    private String nameAuthor;
    private Priority priorityLevel;

    public Task(int id, String deadline, String name, Priority priorityLevel){
        this.id = id;
        this.dateOfAdd = new Date();
        this.deadline = deadline;
        this.nameAuthor = name;
        this.priorityLevel = priorityLevel;
    }

    public int getId(){
        return id;
    }

    public Date getDateOfAdd(){
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

}
