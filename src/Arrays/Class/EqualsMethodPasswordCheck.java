package Arrays.Class;

import java.util.Scanner;

public class EqualsMethodPasswordCheck {
    static void main(String[] args) {
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
        while (!isCorrectPassword){
            System.out.println("Congratulations");
        }
    }
}
