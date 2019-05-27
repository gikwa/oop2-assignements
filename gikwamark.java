/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gikwa
 */
import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
            // Creating the object of the scanner
        Scanner scan = new Scanner(System.in);
        //declaration and initializing 
        int choice = 0;
        // Creating Array  of String for courses 
        String[] courses = new String[4];
        int grades[] = new int[4];
        double sum = 0.0;

    do{
        System.out.println(" Student Grade");
        System.out.println(" -----------------------------");
        System.out.println(" 1. Enter a course name and a grade ");
        System.out.println(" 2. Display all grades ");
        System.out.println(" 3. Calculate the average grade ");
        System.out.println(" 4. Exit program ");

        choice = scan.nextInt();

        if ( choice == 1 ) {
            Scanner scancourses = new Scanner(System.in);
            Scanner scangrades = new Scanner(System.in);

            System.out.println("Enter 4 Course Name: ");
            System.out.println();

            int i = 0;

            for( i = 0; i < 4; i++ )
            {
                System.out.println("Course Name: ");
                // Scanner object to save the course name and print 
                String temp = scancourses.nextLine();
                courses[i] = temp.toLowerCase();

                System.out.println("Marks: ");

                grades[i] = scangrades.nextInt();

                if( i == ( courses.length - 1 ) ){
                    System.out.println("Thanks for your Submition ! ");
                    System.out.println();
                }
            }
        }


        if ( choice == 2 )
        {
            System.out.println("courses " + "\t Marks ");
            System.out.println("---------------------");

            for(int p = 0; p < courses.length; p++)
            {

                System.out.println(courses[p] + "\t" + "\t" + grades[p]);
            }
        }

        if ( choice == 3 )
        {   
              System.out.println("Total of Marks: " + getSum(grades));
              System.out.println("Course Unit: " + grades.length);
              System.out.println("Grades: " + getAverage(grades));
              System.out.println();
        }


    } while ( choice != 4);


}

    public static double getAverage(int[] array)
    {
        int sum = 0;
        for(int i : array) sum += i;
        return ((double) sum)/array.length;
    }

    public static double getSum(int[] array)
    {
        int sum = 0;
        for (int i : array) {
         sum += i;
        }
        return sum;
    }

}
}
