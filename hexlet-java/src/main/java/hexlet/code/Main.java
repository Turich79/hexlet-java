package hexlet.code;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //System.out.println(App2.hasDuplicates(new String[] {"java", "javascript", "php", "java"})); // true
        //System.out.println(App2.hasDuplicates(new String[] {"java", "javascript", "php", "perl"})); // false
        var seq = new Random(100);
        var result1 = seq.getNext();
        var result2 = seq.getNext();

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result1 != result2); // true

        seq.reset();

        var result21 = seq.getNext();
        var result22 = seq.getNext();
        System.out.println("result21" + result21);
        System.out.println("result22" + result22);
        System.out.println(result1 == result21); // true
        System.out.println(result2 == result22); // true
    }
}