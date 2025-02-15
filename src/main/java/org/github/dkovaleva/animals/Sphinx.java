package org.github.dkovaleva.animals;

public class Sphinx extends Cat {
    private Body body = Body.SKIN;

    public Sphinx(String name, String color) {
        super(name, color);
    }

    @Override
    public Body getBody() {
        return body;
    }
}
