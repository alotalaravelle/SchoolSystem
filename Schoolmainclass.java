package schoolmainclass;
import java.util.*;

public class Schoolmainclass {
    
    public static void main(String[] args) {     
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;
    int countF = 0;
        
        int size = 10;
        Student[] studentArray = new Student[size];
        Scanner scan = new Scanner(System.in);
        
        for (int x=0; x< StudentArray.length; x++){       
        System.out.println("First Name of the Student: ");
        String fname = scan.next();
        System.out.println("Last Name of the Student: ");
        String lname = scan.next();
        System.out.println("Student ID: ");
        String sid = scan.next();
        System.out.println("Grade: ");
        double marks = scan.nextDouble();
        System.out.println();
        
        
        Student student = new Student (fname, lname, sid, marks);
        studentArray[x] = student;
        
        }
        
        for (int x=0; x< studentArray.length; x++) {
            
            if (studentArray[x].getGrades() > 75) {
                countF +=1;
                System.out.println("First Name: " + studentArray[x].getFirstName() + "Last Name: " + studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Student Grade: " + studentArray[x].getGrades());
            }
            
            if (studentArray[x].getGrades() > 75 && studentArray[x].getGrades() < 79) {
                countD +=1;
                System.out.println("First Name: " + studentArray[x].getFirstName() + "Last Name: " + studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Student Grade: " + studentArray[x].getGrades());
            }
            
            if (studentArray[x].getGrades() > 80 && studentArray[x].getGrades() < 84) {
                countC+=1;
                System.out.println("First Name: " + studentArray[x].getFirstName() + "Last Name: " + studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Student Grade: " + studentArray[x].getGrades());
            }
            
            if (studentArray[x].getGrades() > 85 && studentArray[x].getGrades() < 90) {
                countB+=1;
                System.out.println("First Name: " + studentArray[x].getFirstName() + "Last Name: " + studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Student Grade: " + studentArray[x].getGrades());
            }
            
            if (studentArray[x].getGrades() > 90 && studentArray[x].getGrades() < 100) {
                countA+=1;
                System.out.println("First Name: " + studentArray[x].getFirstName() + "Last Name: " + studentArray[x].getLastName() + "Student ID: " + studentArray[x].getStudentID() + "Student Grade: " + studentArray[x].getGrades());
            }
  
        }
            System.out.println();
            System.out.println("Grading Analysis");
            System.out.println();
            System.out.println("Grade A: " + countA + " students");
            System.out.println("Grade B: " + countB + " students");
            System.out.println("Grade C: " + countC + " students");
            System.out.println("Grade D: " + countD + " students");
            System.out.println("Grade F: " + countF + " students");

    }  
}
