package Tree;

public class Starter {
    public static void start() {
        var p0 = new Person("Наташа", Sex.FEMALE);
        var p01 = new Person("Коля", Sex.MALE);
        var p02 = new Person("Маша", Sex.FEMALE);
        var p011 = new Person("Женя", Sex.MALE);
        var p012 = new Person("Ваня", Sex.MALE);

        GeoTree gt = new GeoTree();
        gt.add(p0, p01);
        gt.add(p0, p02);
        gt.add(p01, p011);
        gt.add(p01, p012);

        var r = new Research(gt).spend(p0, Connection.Relationship.CHILDREN);
        System.out.println(r);


    }
}
