import java.util.*;

public class cost {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float cost = (pencil + pen + eraser);
        System.out.println("The Cost is:" + cost);

        float newcost = cost + (cost * 0.18f);
        System.out.println("Now with 18% gst the Cost is:" + newcost);
        sc.close();
    }
}