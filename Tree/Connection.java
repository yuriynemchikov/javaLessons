package Tree;

public class Connection {
    private Person person1;
    private Relationship re;
    private Person person2;

    enum Relationship {
        PARENT,
        CHILDREN;
    }

    public Connection(Person p1, Relationship re, Person p2){
        this.person1 = p1;
        this.re = re;
        this.person2 = p2;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person1, re, person2);
    }

    public Person getPerson1(){
        return person1;
    }

    public Relationship getRelationship(){
        return re;
    }

    public Person getPerson2(){
        return person2;
    }


}
