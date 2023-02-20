package Task5Lymbda.OneTOneTGen;

public class TestFifth5 {
    public static void main(String[] args) {

        Fifth54 fifth54=new Fifth54();
        Fifth fifth=fifth54::metod;
        Integer g= (Integer) fifth.metod(8889);
        System.out.println(g);




    }
}
