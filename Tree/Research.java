package Tree;

import java.util.ArrayList;

public class Research {

    ArrayList<Connection> tree;
    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    public ArrayList<Person> spend(Person h, Connection.Relationship re) {
        var result = new ArrayList<Person>();
        tree.forEach((t) -> {
            if (t.person1.name.equals(h.name)  && t.re == re) {
                result.add(t.person2);
            }
        });
        return result;

    }

}
