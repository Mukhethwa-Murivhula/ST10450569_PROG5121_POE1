/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe.part.pkg1._st10450569_mukhethwa;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void testcheckUsernamePass() {
        Login login = new Login();
        String username = "kyl_1";
        boolean result;
        boolean expected = true;
        result = login.checkUsername(username);
        assertEquals(expected, result);
        System.out.println("Username entered correctly");
    }
    
     @Test
    public void testcheckUsernameFail() {
        Login login = new Login();
        String username = "ky!!!!%t";
        boolean result;
        boolean expected = false;
        result = login.checkUsername(username);
        assertEquals(expected, result);
        System.out.println(result);
    }
    
    @Test
    public void checkPasswordComplexityPass() {
        Login login = new Login();
        login.password ="Ch&&sec@ke99!";
        boolean result;
        boolean expected = true;
        result = login.checkPasswordComplexity();
        assertEquals(expected, result);
        System.out.println(result);
    }
    
    
    @Test
    public void checkPasswordComplexityFail() {
        Login login = new Login();
        login.password = "Ch&&sec@ke99!";
        boolean result;
        boolean expected = false;
        result = login.checkPasswordComplexity();
        assertEquals(expected, result);
        System.out.println(result);
    }   
        
    @Test
    public void loginUserPass(){
       Login login = new Login();
       String username = "ky_le";
       String password = "Password@1";
       login.username = "ky_le";
       login.password = "Password@1";
       
       
       boolean expected = true;
       boolean result = login.loginUser(username, password);
       
       assertEquals(expected, result);
       
    }
    @Test
    public void loginUserFail(){
       Login login = new Login();
       String username = "kyle";
       String password = "Password";
       login.username = "kyle";
       login.password = "Password";
       
       
       boolean expected = false;
       boolean result = login.loginUser(username, password);
       
       assertEquals(expected, result);
}
}