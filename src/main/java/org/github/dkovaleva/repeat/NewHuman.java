package org.github.dkovaleva.repeat;

public class NewHuman {
    private String name;
    private int year;
    private int height;

    public NewHuman(String name, int year, int height) {
        this.name = name;
        this.year = year;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof NewHuman newHuman) {
            return (newHuman.year == year)
                    && (newHuman.height == height)
                    && (name.equals(newHuman.name));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 31 * year * height * name.hashCode();
    }


}
