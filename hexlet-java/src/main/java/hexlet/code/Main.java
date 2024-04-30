package hexlet.code;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(App2.hasDuplicates(new String[] {"java", "javascript", "php", "java"})); // true
        System.out.println(App2.hasDuplicates(new String[] {"java", "javascript", "php", "perl"})); // false
    }
}