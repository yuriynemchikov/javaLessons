package Tree;

public class Starter {
    public static void start() {
        var p0 = new Human("Наташа");
        var p01 = new Human("Коля");
        var p02 = new Human("Маша");
        var p011 = new Human("Женя");
        var p012 = new Human("Ваня");

        GeoTree gt = new GeoTree();
        gt.add(p0, p01);
        gt.add(p0, p02);
        gt.add(p01, p011);
        gt.add(p01, p012);

        var r = new Research(gt).spend(p0, Connection.Relationship.CHILDREN);
        System.out.println(r);


    }
}
