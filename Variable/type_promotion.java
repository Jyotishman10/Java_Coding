public class type_promotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
       // char c = (a - b);// cannot convert int to char.
        System.out.println((int) (a));
        System.out.println((int) (b));
        System.out.println(b);
        System.out.println(b - a);
    }
}
