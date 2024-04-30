package hexlet.code;

public class Rectangle {
    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getSquare() {
        if (length < 0 || width < 0) {
            throw new RuntimeException("Не удалось посчитать площадь");
        } else {
            return length * width;
        }
    }
}
