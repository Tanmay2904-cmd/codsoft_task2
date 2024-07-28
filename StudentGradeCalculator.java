import java.util.Scanner;
public class StudentGradeCalculator
{

    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR");

       //Inout student's name
         System.out.println("ENTER STUDENT'S NAME: ");
         String studentName = scanner.nextLine();

       //Input no. of subjects
         System.out.println("ENTER NUMBER OF SUBJECTS");
         int n =scanner.nextInt();//Here n is considered as number of subjects.
         int total=0;

       //Input total marks obtained
         System.out.println("ENTER THE MARKS OBTAINED IN" + n + "EACH SUBJECT RESPECTIVELY");
          for(int i = 0;i < n; i++){
              int marks = scanner.nextInt();
              total += marks;
           }
            double averagePercentage = (double) total/ n;
            String grade;
        //Determine the grade
           if(averagePercentage>=90){
             grade ="A+";
           }
            else if(averagePercentage>=80 && averagePercentage<90 ){
                grade ="A";
            }
             else if (averagePercentage>=70 && averagePercentage<80){
                grade = "B";
            }
             else if (averagePercentage>=60 && averagePercentage<70){
                grade ="C";
            }
             else if (averagePercentage>=50 && averagePercentage<60){
                grade ="D";
            }
             else if (averagePercentage>=40 && averagePercentage<50){
                grade ="E";
            }
             else if (averagePercentage>=35 && averagePercentage<40){
                grade = "P";
            }
             else{
                grade = "Fail(F)";
            }
 
         //output results
            System.out.println("Total marks = "+total);
            System.out.println("Average percentage= "+ averagePercentage +"%");
            System.out.println("Grade is : "+ grade);
            scanner.close();//close the scanner
     }
 } 