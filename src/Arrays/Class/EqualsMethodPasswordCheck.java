// Question: How can String.equals verify a password entered by the user?
package Arrays.Class;

import java.util.Scanner;

public class EqualsMethodPasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        password(input);
        input.close();


    }

    static void password(Scanner input) {
        String password = "Bags";
        String userPassword = input.nextLine();
        boolean isCorrectPassword = password.equals(userPassword);
        System.out.println(isCorrectPassword? "go":"sleep");
    }
}
