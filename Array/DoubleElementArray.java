public class DoubleElementArray {

    public static boolean  repeat(int num[]) {
        int repeatNum = 0;
        for (int i = 0; i < num.length; i++) {
            repeatNum = num[i];
            for (int j = 0; j < num.length; j++) {
                
            }
            if (num[i + 1] == repeatNum) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        repeat(num);
    }
}
