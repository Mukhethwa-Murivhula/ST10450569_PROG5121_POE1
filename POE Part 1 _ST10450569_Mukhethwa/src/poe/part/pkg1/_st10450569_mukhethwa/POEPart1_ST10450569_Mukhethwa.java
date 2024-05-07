/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part.pkg1._st10450569_mukhethwa;

import java.util.Scanner;

public class POEPart1_ST10450569_Mukhethwa {

    public static String userName;
    public static String password;

    public static void main(String[] args) {

        //Part 1*
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;

        String loginUsername;
        String loginPassword;

        System.out.print("Hello there!" + "Register for an account");

        //prompting the user for their details for the registration
        System.out.print("Please enter your username >>");
        userName = input.nextLine();

        if (Login.checkUsername(userName)) {
            System.out.println("Username is successfully captured");

        } else {
            System.out.println("Username is not correctly formatted,please ensure that your username contains and is no more than 5 characters in length");

        }

        System.out.println("Please enter your password>>");
        password = input.nextLine();

        if (Login.containsCapitalLetters(password) && password.length() >= 8 && Login.containsDigit(password) && Login.containsSpecialCharacters(password)) {
            System.out.println("Password successfully captured");

        } else {
            System.out.println("Password is not correctly formatted,please ensure that the password contains at least 8 characters , a capital letter,a digit and special characters");
        }

        //prompting the user for login details
        System.out.println("Login");

        System.out.print(" Enter your first name >>");
        firstName = input.nextLine();

        System.out.print(" Enter your last name >>");
        lastName = input.nextLine();

        System.out.println("Please login using your username");
        loginUsername = input.nextLine();

        if (loginUsername.equals(userName)) {
            System.out.println("Login Username successfully captured");

        } else {
            System.out.println("Login Username unsuccessful");
        }

        System.out.println("Please login using your password");
        loginPassword = input.nextLine();

        if (loginPassword.equals(password)) {
            System.out.println("Welcome " + firstName + " " + lastName + " it is great to see you again!");
        } else {
            System.out.println(" Login Password or Login username unsuccessful");
        }

    }
}

//End of part 1*

