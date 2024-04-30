package hexlet.code;

public class App3 {
    public static Quadrate enlargeQuadrate(Quadrate quadrate){
        return new Quadrate(quadrate.getSide()*2);
    }
}
