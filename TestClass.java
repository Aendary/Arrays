public class TestClass
{
    public static void main(String[] args) {
        int i;
        float f = 2.5f;
        boolean flag = true;
        String[] array = {"Alpha","Bravo","Charlie","Delta","Echo"};
        int Starry = array.length - 1;
        for (int Starray = 0; Starray < array.length; Starray++) {
            System.out.println(array[Starray]);
            
        }
        for (String value : array) {
            System.out.println(value);
        }
        System.out.println();
        for (int Staray = 0; Staray < array.length; Staray++) {
            System.out.print(array[Staray]);
            if (Staray < Starry) {
                System.out.print("-"); 
            }
        }
    }
}