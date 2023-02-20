package Task5Lymbda.OneOne;

public class TestSecond4 {
    public static void main(String[] args) {
        Second24 second24 = new Second24();
        Second second = second24::metod2;
        int d = second.metod(6);
        System.out.println(d);


    }
}
