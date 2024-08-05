import java.util.*;
public class type_conversion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = a;
        // long b = sc.nextLong();it gives error because long variable size is bigger than int so long variable does not fit in int for its small size.
        // int a = b;//it says that lossy conversion because your some data will be lost.
        System.out.println(b);

        //int c = sc.nextFloat();   //!!!Error  type_conversion.java:11: error: incompatible types: possible lossy conversion from float to int


        //         int c = sc.nextFloat();
//                           ^
// 1 error
        
        float c = sc.nextInt();// !!Output 12
                                //12.0 it means int will  fit in float but float will not fit in an int.
        System.out.println(c);
        sc.close();
    }
}