package Tree;

public abstract class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.name);
    }

}

