import java.util.*;
class Hack{

	public static void main(String [] s){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(int i=0;i<a.length()-1;i++){
        	    char ch = a.charAt(i);
        	    int count =0;
        	    for(int j=0;j<a.length()-1;j++){
        	        if(ch==a.charAt(j))
        	            count++;
        	    }
        	    System.out.println("Count of "+ch+"is "+count);
       	 	}
	}
}