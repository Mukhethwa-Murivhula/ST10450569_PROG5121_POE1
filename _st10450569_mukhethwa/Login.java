package poe.part.pkg1._st10450569_mukhethwa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class Login {

    public static String username;
    public static String password;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter password:");
        String inputPassword = scanner.nextLine();

        if (loginUser(inputUsername, inputPassword)) {
            System.out.println(returnLoginStatus());
        } else {
            System.out.println("Username or password is not correct.");
        }
    }

    public static boolean checkUsername(String username) {

        return username.length() <= 5 && username.contains("_");
    }

    public static boolean checkPasswordComplexity() {

        boolean check1;
        boolean check2;
        boolean check3;

        check1 = containsCapitalLetters(password);
        check2 = containsDigit(password);
        check3 = containsSpecialCharacters(password);

      return check1 && check2 && check3;
           

    }

    public static boolean containsCapitalLetters(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDigit(String password) {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsSpecialCharacters(String password) {
        String specialCh = "!@#$%^&*()?><!!@%$&*";
        for (char ch : password.toCharArray()) {
            if (specialCh.contains(String.valueOf(ch))) {
                return true;
            }

        }
        return false;
    }

    public static boolean loginUser(String loginUsername, String loginPassword) {
        return loginUsername.equals(username) && loginPassword.equals(password);
    }

    public static String returnLoginStatus() {
        return "Welcome " + username + ", it's great to see you again.";
    }
}
