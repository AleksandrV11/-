package Task5Lymbda.OneTwo;

public class TestThird34 {
    public static void main(String[] args) {


        Third34 third34 = new Third34();
        Third third = third34::metod2;
        int s = third.metod(5, 0);

        System.out.println(s);
    }
}
