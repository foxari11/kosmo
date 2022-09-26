package poly;

import java.util.Scanner;

public class Polymorphism {
	public static void main(String[] args) {
		
//		Book b;
//		Dvd d;
//		Cd c;
		
		Item i = null;
		
		System.out.println("해당하는 물품번호 (1.책, 2.DVD, 3.CD)");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel){
		case 1: i = new Book1("001","총균쇠","제러드","코스모"); break;
		case 2: i = new Dvd(); break;
		case 3: i = new Cd(); break;
		}
		
		i.output();
		
	}

}
