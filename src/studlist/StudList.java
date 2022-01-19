
package studlist;
import java.util.Scanner;

/**
 *
 * @author sangh
 */
public class StudList {
    public static void main(String[] args) {
       Student[] sList = new Student[3];//decelaration of object
       Scanner input = new Scanner(System.in);
       
       for(int i = 0; i <= sList.length - 1; i++){
           sList[i] = new Student();//initiliaze the object
           System.out.println("Enter student name: ");
           sList[i].setName(input.nextLine());//store value into the array of objects
       }
       
       for(int i = 0; i < sList.length - 1; i++){
           System.out.println("Student name: " + sList[i].getName());
       }
    }
    
}
