package hexlet.code;

public class App {

    public static double getSquare(int line1, int line2, int corner) {
        double result = (line1 * line2 / 2) * Math.sin(corner * Math.PI / 180);
        return result;
    }

    public static String checkSecurity(Url url) {
        String host_name = url.getHost();
        if (url.getProtokol().equals("https")) {
            return "Connection to " + host_name + " is secure";
        } else {
            return "Connection to " + host_name + " is not secure";
        }
    }

    public static Double calculateAverage(Integer[] mas) {
        if (mas.length == 0) {
            return null;
        }
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == null) {
                return null;
            }
            sum = sum + mas[i];
        }
        return (double) sum / mas.length;
    }
    public static String getFigureSquare(Geometric figure){
        String result = "Square of " + figure.getName() + " is " + figure.getSquare();
        return result;
    }

    //урок 10
    public static void printSquare(Rectangle figure){
        try{
            System.out.println(figure.getSquare());
        } catch (RuntimeException e){
            System.out.println(e);
        }
    }

    //Урок 11



    public static void main(String[] args) {
        System.out.println(getSquare(10, 10, 60));

        var url1 = new Url("https://google.com");

// Протокол https - соединение считается безопасным
// google.com – имя хоста
        System.out.println(App.checkSecurity(url1)); // "Connection to google.com is secure"


        var url2 = new Url("http://example.com");

// Протокол http - соединение считается не безопасным
// example.com – имя хоста
        System.out.println(App.checkSecurity(url2)); // "Connection to example.com is not secure"

        Geometric quadrate = new Quadrate(5);
        System.out.println(App.getFigureSquare(quadrate)); // "Square of quadrate is 25"

        System.out.println("урок 10");
        var figure1 = new Rectangle(4, 5);
        App.printSquare(figure1); // => 20

        var figure2 = new Rectangle(-4, 5);
        App.printSquare(figure2); // => Не удалось посчитать площадь
    }
}
