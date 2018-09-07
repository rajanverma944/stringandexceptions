import java.util.*;
public class reverseastring {

	public static void main(String[] args) {
     String s;
     Scanner scan = new Scanner(System.in);
     inpu=scan.next();
     String r="";
     int a=s.length();
     for(int i=a;i>=0;i--)
     {
    	 r=r+s.charAt(i);
     }
     System.out.println(r);
	}
}