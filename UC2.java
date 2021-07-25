import java.util.Scanner;
public class UC2 {
	public static void main(String args[]) {
		double hours;
                                double salary;
                                double wages = 20;
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the total working Hours");
                 hours  = sc.nextDouble();
                 if(hours<8)
                 {
                     System.out.println("You work less");
     
                  }
                  else
                    {
                    System.out.println(hours*wages);
	     }

}
}
