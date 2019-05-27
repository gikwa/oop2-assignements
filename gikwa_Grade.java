import java.util.Scanner;

public class gikwa_Grade{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int choice = 0;
        String[] subjects = new String[4];
        int grades[] = new int[4];
        double sum = 0.0;
        //int avg;

    do
    {
        System.out.println("IUEA Student Grade");
        System.out.println(" -----------------------------");
        System.out.println(" 1. Enter a course name and a Marks ");
        System.out.println(" 2. Display all grades ");
        System.out.println(" 3. Calculate the average grade ");
        System.out.println(" 4. Calculate Class ");
        System.out.println(" 5. Exit program ");

        choice = scan.nextInt();

        if ( choice == 1 ) 
        {
            Scanner scansubjects = new Scanner(System.in);
            Scanner scangrades = new Scanner(System.in);

            System.out.println("Enter 4 Course Name: ");
            System.out.println();

            int i = 0;

            for( i = 0; i < 4; i++ )
            {
                System.out.println("Course Name: ");

                String temp = scansubjects.nextLine();
                subjects[i] = temp.toLowerCase();

                System.out.println("Grade: ");

                grades[i] = scangrades.nextInt();

                if( i == ( subjects.length - 1 ) )
                {
                    System.out.println("Asante for Checking! ");
                    System.out.println();
                }
            }
        }


        if ( choice == 2 )
        {
            System.out.println("Subjects " + "\t Grades ");
            System.out.println("---------------------");

            for(int p = 0; p < subjects.length; p++)
            {

                System.out.println(subjects[p] + "\t" + "    \t" + grades[p]);
            }
        }

        if ( choice == 3 )
        {   
              System.out.println("Total : " + getSum(grades));
              System.out.println("Course Unit: " + grades.length);
              System.out.println("Grade Average: " + getAverage(grades));
              System.out.println();
        }
        if (choice == 4){
            System.out.println("Asimwe your Grade is: ");
        if(sum>=80)
        {
            System.out.println("A");
        }
        else if(sum>=60 && sum<80)
        {
           System.out.println("B");
        } 
        else if(sum>=40 && sum<60)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("D");
        }
        }

 
    } while ( choice != 5);

        

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