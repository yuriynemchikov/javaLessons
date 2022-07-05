package Tree;

import java.util.ArrayList;

public class Research {

    ArrayList<Connection> tree;
    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    public ArrayList<Human> spend(Human h, Connection.Relationship re) {
        var result = new ArrayList<Human>();
        tree.forEach((t) -> {
            if (t.h1.name == h.name && t.re == re) {
                result.add(t.h2);
            }
        });
        return result;

    }

}
