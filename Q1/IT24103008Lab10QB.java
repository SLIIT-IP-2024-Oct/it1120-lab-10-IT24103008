import java.util.Scanner;
 
 public class IT24103008Lab10QB {
  
   public static char determineGrade(int mark){
    if(mark>=75){
     return 'A';

   } else if(mark >= 60){
    return 'B';

   } else if (mark >=50){
   return'C';

   } else if (mark >=40){
    return'D';
  
   } else {
       return'F';  
  
      }
}
   public static void main(String[]args) {
      
     // create a scanner object
   Scanner scanner = new Scanner(System.in);
    
     // input the mark
   System.out.print("Enter the marks(0-100)");
    int mark = scanner.nextInt();

   // validate the marks
    assert mark >= 0 && mark <= 100 : " invalid mark ";

  // determine the grade
    char grade = determineGrade(mark);

  if(mark>=75){
   assert grade == 'A': "incorrect grade assigned";
  } else if(mark >= 60) {
   assert grade == 'B': "incorrect grade assigned"; 
 } else if(mark >= 50) {
  assert grade == 'C': "incorrect grade assigned";
 } else if(mark >= 40) {
   assert grade == 'D': "incorrect grade assigned";
 } else {
   assert grade == 'F': "incorrect grade assigned";
 }

   System.out.println("mark is unvalid");
   System.out.println(" grade for the entered mark is :" + grade);


     }
}

 