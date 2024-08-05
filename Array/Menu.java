import java.util.*;

public class Menu {

    public static int linearSearch(String menu[], String food) {

        for (int i = 0; i < menu.length; i++) {
            if (food.equals(menu[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String menu[] = { "Dosa", "Fuchka", "Chowmin", "Biriyani", "Bhelpuri" };
        
        System.out.print("Enter the food item you want to search for: ");
        String food = sc.nextLine();
        
        int index = linearSearch(menu, food);

        if (index == -1) {
            System.out.println("This Food is not available");
        } else {
            System.out.println(food + " is available");
        }

        sc.close();
    }
}
