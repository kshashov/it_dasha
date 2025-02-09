package org.github.dkovaleva.animals;

public enum Body {
    SKIN("Кожа"),
    WOOL("Шерсть"),
    CHESHUYA("Чешуя");

    private String name;

    Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
