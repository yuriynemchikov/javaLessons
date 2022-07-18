package Tree;

import java.time.Period;

public class Person extends Human{

    private Sex sex;

    public Person(String name, Sex sex) {
        super(name);
        this.sex = sex;
    }

    public Person(String name) {
        super(name);
    }
}
