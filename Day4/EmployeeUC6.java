import java.lang.Math;

public class EmployeeUC6 {
	
	public static final  int salaryPerHour=20,partTime=1,fullTime=2,workingDays=20,maxWorkingHours=100;
	
		   public static void main(String[] args) {
			   
			   int empHours=0,totalEmpHours=0,totalWorkingDays=0,totalEmpWage=0;
			   
			  while(totalWorkingDays < workingDays && totalEmpHours < maxWorkingHours) {
				  totalWorkingDays ++;
			    
			  int empCheck = (int)Math.floor(Math.random() *10 )% 3;
			  
			  
			  switch(empCheck) {
			  
			      case partTime:
				  System.out.println("Employee is Present Part Time");
				  empHours=4;
				  break;
				  
			      case fullTime:
			    	  System.out.println("Employee is Present Full Time");
			    	  empHours=8;
			    	  break;
			    	  
			      default:
			    	  System.out.println("Employee is Absent");
			    	  empHours=0;
			    	  
			  }
			  
			  totalEmpHours += empHours;
			  System.out.println("DAY:"+ totalWorkingDays +"Emp hrs:" + totalEmpHours);
			    	  
			  }
			  totalEmpWage= totalEmpHours * salaryPerHour;
			  
			  System.out.println("Total wage is: " + totalEmpWage);
			 	  
		
		  }
				           			    

	}