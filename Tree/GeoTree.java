package Tree;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Connection> tree = new ArrayList<>();

    public ArrayList<Connection> getTree() {
        return tree;
    }

    public void add(Human parent, Human children){
        tree.add(new Connection(parent, Connection.Relationship.CHILDREN, children));
        tree.add(new Connection(children, Connection.Relationship.PARENT, parent));
    }
}
