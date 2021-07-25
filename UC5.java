import java.util.Scanner;
public class UC5 {
	public static void main(String args[]) {
		double days;
                                double hours = 8 ;
                                double wages = 20;
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the total working days");
                 days  = sc.nextDouble();
                 if(days<20)
                 {
                     System.out.println("You work less number of days");
     
                  }
                  else
                    { 
                    System.out.println("Your Monthly Salary is");
                    System.out.println(hours*wages * days);
	     }

}
}
