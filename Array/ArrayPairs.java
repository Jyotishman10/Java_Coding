public class ArrayPairs {

    public static void ArrPair(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int CurrentNo = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.err.print("(" + CurrentNo + "," + numbers[j] + ") ");
                tp++;
            }
            System.err.println("");

        }
        System.err.println("Total Pairs are = " + tp);
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10 };
        ArrPair(number);
    }
}
