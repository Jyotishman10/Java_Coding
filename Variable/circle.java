import java.util.*;
public class circle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;//3.14 is determined as double by java so from double to float not possible thats why it is needed to declare it as float so 3.14f. 
        System.out.println(area);
        sc.close();
    }
}
