package Tree;

import java.util.ArrayList;

public class Research {

    private ArrayList<Connection> tree;
    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }
    public ArrayList<Person> spend(Person p, Connection.Relationship re) {
        var result = new ArrayList<Person>();
        tree.forEach((t) -> {
            if (t.getPerson1().getName().equals(p.name)  && t.getRelationship() == re) {
                result.add(t.getPerson2());
            }
        });
        return result;

    }

    public String allFamily(){
        for(Connection family : tree) {
            System.out.println(family);
        }
        return null;
    }

}
