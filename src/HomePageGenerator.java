import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**********************************************************************
 * @file HomePageGenerator.java
 * @brief BRIEF DESCRIPTION OF ANY ISSUES FACED
 * @author YOUR FULL NAME
 * @date: SUBMISSION DATE
 * @acknowledgement: FULL NAME(S) OF YOUR COLLABORATOR(S)
 ***********************************************************************/
public class HomePageGenerator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String output = "";

        // Sample code - erase/modify as needed
//        System.out.println("What's your name?");
//        name = keyboard.nextLine();
//        output = "<!DOCTYPE html>\n";
//        output = output + "<html>\n";
//        output = output + "<body>\n";
//        output = output + "<h1>" + name + "</h1>";
//        output = output + "</body>\n" + "</html>";
        // end Sample code

        writeToFile("homepage.html", output);
    }

    /**
     * Creates a file using the filename and storing str as content.
     * Overwrites the file if it already exists.
     * @param filename - name of the file
     * @param str - string to write to the file
     */
    public static void writeToFile(String filename, String str) {
        File file = new File(filename);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(file));
            System.out.println("Writing to file... " + filename);
            out.write(str);
            out.newLine();
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
