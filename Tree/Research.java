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
            if (t.human1.name.equals(h.name)  && t.re == re) {
                result.add(t.human2);
            }
        });
        return result;

    }

}
