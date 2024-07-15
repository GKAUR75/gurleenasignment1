
/**
 * Write a description of class StudentMark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class StudentMark
{
    String grade;
    private int numbers;
    private double marks;
    
    public static void main(String[] args) {
    
    int student_number = 30;
    double [] marks = new double [student_number];
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Print marks of 30 students:");
    
    for(int i=0; i<student_number; i++) { 
     //accept only valid mark - check valid mark should be between 0 and 30  
       double temp = sc.nextDouble();  
    
      // if (temp < 0 || temp > 30) {
        // System.out.println(" Invalid marks, enter the mark again");
    // }
    marks[i] = temp;
    
    
}

              // pseudocode code 
           // Create Algorithm 1
           // Repeat from 0 to 30 in loop
           // Set Marks = user input
          // Set HightestMark = 0;
          // Repeat each Mark:
          // if i > Max:
          // Max = i;
          // else do nothing
          // print Max
          
         // Initialize the Hightest Marks 0
         int hightestmark = 0; //The marks are between 0 and 30
          
        // 0 to 30 loop run
        for(int i = 0; i <= 30; i++) {
          System.out.println("Enter the marks");
           int mark = sc.nextInt();
           
           // check the enter number is greater then current entered Hightest Mark
           if(mark > hightestmark) {
               hightestmark = mark;
               
               // print the Hightest Mark
               System.out.println("Hightest Mark");
               
           }
        }
         
         
             // pseudocode code 
          // Create Algorithm 
           // Repeat from 0 to 30 in loop
           // Set Marks = user input
          // Set lowestMarks = 0;
          // Repeat each mark:
          
          // if i > Min:
          // Min = i
          // else do nothing
          // print Min
          
       // Initialize the Lowest Marks 0
         int lowestmarks = 0; // The marks are between 0 and 30
          
        // 0 to 30 loop
        for(int i = 0; i <= 30; i++) {
          System.out.println("Enter the marks");
           int mark = sc.nextInt();
           
           // check the entered number is less then current Lowest Mark
           if( mark > lowestmarks) {
               lowestmarks = mark;
               
               // print the Lowest Mark
               System.out.println("Lowest Mark");
               
           }
        }
    
    
    
    
        
    System.out.println("Enter marks: ");
    for(int k=0; k<student_number; k++)  {
    System.out.println(marks[k]);    
    }
     


      // Pseudo code
     // create Algorithm 2
     // Set up number or variables for mean
     // sum = create a total number
     // calculate mean
     // prepare for standard deviation formula
     // Show the mean and standard deviation formula
      // calculate standard deviation
     // create squareroot
    


      // mean = sum of all the marks / number of all the marks
      double total = 0;
      
      for (int i=0; i < student_number; i++) {
          total = total + marks[i];
      }
      
     double mean = total / student_number;
     
     double summedDiff = 0;
     for (int i=0; i < student_number; i++) {
        summedDiff = summedDiff + (marks[i] - mean)*(marks[i] - mean);
        
     summedDiff = summedDiff / student_number;
     
     //double squareRootSummedDiff = summedDiff = take a power of 0.5
    
    }
}
}