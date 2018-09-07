import java.util.*;
public class Noofwords {

	public static void main(String[] args) {
     String r;
     Scanner scan=new Scanner(System.in);
     r=scan.nextLine();
     int count=1;
     for(int i=0;i<r.length()-1;i++)
     {
    	 if(r.charAt(i)==' ' && r.charAt(i+1)!=' ')
    	 {
    		 count++;
    	 }
     }
     System.out.println(count);
     }}