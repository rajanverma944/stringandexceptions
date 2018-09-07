import java.util.*;
public class stringcontains {

	public static void main(String[] args) {
     String r;
     String s;
     Scanner scan=new Scanner(System.in);
     r=scan.nextLine();
     s=scan.nextLine();
     if(r.contains(s))
     {
    	 System.out.println("yes");
     }
     else
    	 System.out.println("No");
    }}