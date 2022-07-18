package Tree;

public class Starter {

    View view;

    public Starter(View v){
        view = v;
    }
    public static void buttonClick() {
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

        while(true) {
            int a = View.getRequest("1 - Увидеть родителей кого-то\n" +
                    "2 - Увидеть детей кого-то\n" +
                    "3 - Посмотреть всё дерево\n");
            switch (a) {
                case 1:
                    String findParent = View.getName("Родителей кого хотите увидеть?\n");
                    var p = new Research(gt).spend(new Person(findParent), Connection.Relationship.PARENT);
                    System.out.println(p);
                    break;

                case 2:
                    String findChild = View.getName("Чьих детей хотите увидеть?\n");
                    var c = new Research(gt).spend(new Person(findChild), Connection.Relationship.CHILDREN);
                    System.out.println(c);
                    break;

                case 3:
                    var f = new Research(gt).allFamily();
                    System.out.println(f);
                    break;

                default:
                    System.out.println("Ввели неправильную цифру");
            }
        }

        }
 }

