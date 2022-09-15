package hu.petrik.pontoop.pont;

public class Circle {

    private Pont kozeppont;
    private double sugar;

    public Circle (Pont kozeppont, double sugar) {
        this.kozeppont = kozeppont;
        this.sugar = sugar;
    }
    @Override
    public String toString() {
        return String.format("(%d, %d, %.3f)", this.kozeppont.getX(),this.kozeppont.getY(), this.sugar);
    }


}
