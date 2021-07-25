import java.util.Scanner;
public class UC3 {
	public static void main(String args[]) {
		double hours;
                                double salary;
                                double wages = 20;
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter the total working Hours");
                 hours  = sc.nextDouble();
                 if(hours==4)
                 { 
                    System.out.println(hours*wages);  
     
                  }
                  else 
                    {
                   
                     System.out.println("You work is not included in partime");
	     }

}
}
