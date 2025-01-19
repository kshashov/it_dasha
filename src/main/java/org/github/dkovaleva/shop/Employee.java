package org.github.dkovaleva.shop;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private String position;

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String newPosition) {
        position = newPosition;
    }

    public String getPosition() {
        return position;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hashCode(name);
//    }
}
