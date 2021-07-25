public class line3 {
public static void main(String[]args) {
	int x1=5;
	int x2=6;
	int y1=7;
	int y2=9;
	int l1=x2-x1;
	int l2=y2-y1;
	int length=(int)Math.sqrt(Math.pow(l1,2)+Math.pow(l2, 2));
	System.out.println(length)  ;           
	
	if(l1==l2) {
		System.out.println("Lines are equal");
	}
               else if (l1>=l2) {
		System.out.println("Line1 is greater");
	}
  else if (l1<=l2) {
		System.out.println("Line2 is greater");
	}
  else  {
		System.out.println("Lines are equal");
	}                                     
	 
	
}
}