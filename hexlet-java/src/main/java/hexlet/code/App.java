package hexlet.code;

public class App {
    public static double getSquare(int line1, int line2, int corner) {
        double result = (line1 * line2 / 2) * Math.sin(corner * Math.PI / 180);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSquare(10, 10, 60));
    }
}
