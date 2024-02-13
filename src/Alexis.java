import java.util.Scanner;
/**********************************************************************
 * @file Alexis.java
 * @brief BRIEF DESCRIPTION OF ANY ISSUES FACED
 * @author YOUR FULL NAME
 * @date: SUBMISSION DATE
 * @acknowledgement: FULL NAME(S) OF YOUR COLLABORATOR(S)
 ***********************************************************************/
public class Alexis {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;

         System.out.println("Hello! My name is Alexis. What is your name?");
        name = keyboard.nextLine();

        String userHobby;
        System.out.println("Nice to meet you, " + name + "! What you like to do in your spare time?");
        userHobby = keyboard.nextLine();

        String habitualYears;
        System.out.println("That sounds wonderful! How long have you been " + userHobby + "?");
        habitualYears = keyboard.nextline();
        System.out.println(habitualYears "? That is impressive!");
        
        // Sample code
        // System.out.println("What's your name?");
        // name = keyboard.nextLine();
        //System.out.println("Thanks, " + name);
        // end Sample code

    }
}
