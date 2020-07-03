/**
 * Created by KPS on 7/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        int temp = 0 ;
        int a = 12;
        int b = 14;
        System.out.println("a :" + a + " b : "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a :" + a + " b : "+ b);
    }
}
