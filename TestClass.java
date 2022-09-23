public class TestClass
{
    public static void main(String[] args) {
        int i;
        float f = 2.5f;
        boolean flag = true;
        String[] array = {"Alpha","Bravo","Charlie","Delta","Echo"};
        for (int Starray = 0; Starray < array.length; Starray++) {
            System.out.println(array[Starray]);
            
        }
        for (String value : array) {
            System.out.println(value);
        }
        System.out.println();
        for (int Starray = 0; Starray < array.length; Starray++)
            System.out.println("-"); //Alpha-Bravo-Charlie-Delta-Echo
    }
}