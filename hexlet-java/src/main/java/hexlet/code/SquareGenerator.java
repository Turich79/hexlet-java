package hexlet.code;

public class SquareGenerator {
    public static Square[] generate(double side, int count){
        Square[] mas = new Square[count];
        for (int i = 0; i < count; i++) {
            mas[i] = new Square(side);
        }
        return mas;
    }
}
