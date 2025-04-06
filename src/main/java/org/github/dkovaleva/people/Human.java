package org.github.dkovaleva.people;

import java.util.Objects;

public class Human {
    private int yearBirth;
    private int weight;
    private String name;

    public Human(String name, int yearBirth, int weight) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof Human) {
            Human newH = (Human) o;
            return Objects.equals(name, newH.name) //name.equals(newH.name) // TODO запомнить
                    && (weight == newH.weight)
                    && (yearBirth == newH.yearBirth);
        }

        return false;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Human human)) return false;
//        return yearBirth == human.yearBirth && weight == human.weight && Objects.equals(name, human.name);
//    }

    @Override
    public int hashCode() {
        return name.hashCode() + yearBirth;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", weight=" + weight;
    }
}
