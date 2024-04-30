package hexlet.code;

public class Quadrate implements Geometric {
    private int side;

    public Quadrate(int side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "quadrate";
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
