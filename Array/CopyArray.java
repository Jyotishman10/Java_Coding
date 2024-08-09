public class CopyArray {

    public static void Main_array(int num[], int num2[]) {
        System.out.print("First array elements : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("");
        num2 = new int[num.length];

        System.arraycopy(num, 0, num2, 0, num.length);

        System.out.print("Second Array elements : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        int num2[] = {};
        Main_array(num, num2);

    }
}
