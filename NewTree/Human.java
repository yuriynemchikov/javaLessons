package NewTree;

public abstract class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public void info(){
        System.out.println("Меня зовут "+ this.name);
    }

}
