package chaptor04.EX04;

import java.util.Scanner;

public class Using_For05b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int s = sc.nextInt();
	    for (int i = 1; i<10;  i++) {
	    	System.out.print( s +  "*" +  s + "=" + s * i  );
     	    System.out.println();
	    	}
	    sc.close();
		}

	}


