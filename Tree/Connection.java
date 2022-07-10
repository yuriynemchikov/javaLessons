package Tree;

public class Connection {
    Human human1;
    Relationship re;
    Human human2;

    enum Relationship {
        PARENT,
        CHILDREN;
    }

    public Connection(Human h1, Relationship re, Human h2){
        this.human1 = h1;
        this.re = re;
        this.human2 = h2;
    }

    public String getHuman1() {
        return String.valueOf(human1);
    }


    @Override
    public String toString() {
        return String.format("<%s %s %s>", human1, re, human2);
    }


}
