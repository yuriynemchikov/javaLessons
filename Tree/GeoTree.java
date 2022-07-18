package Tree;

import java.util.ArrayList;
import java.util.Iterator;

public class GeoTree {
    private ArrayList<Connection> tree = new ArrayList<>();

    public ArrayList<Connection> getTree() {
        return tree;
    }

    public void add(Person parent, Person children){
        tree.add(new Connection(parent, Connection.Relationship.CHILDREN, children));
        tree.add(new Connection(children, Connection.Relationship.PARENT, parent));
    }


}
