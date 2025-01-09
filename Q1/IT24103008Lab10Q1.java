import java.util.Scanner;

   public class IT24103008Lab10Q1 {
    public static void main(String []args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter exam mark:");
     int mark = scanner.nextInt();

    assert(mark >= 0 && mark <= 100) : "invalid mark ";

    System.out.println(" mark is validated");
    
    }
}

     