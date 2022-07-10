package Tree;

import java.util.ArrayList;

public class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Human human) {
        return this.name == human.name;
    }
}

