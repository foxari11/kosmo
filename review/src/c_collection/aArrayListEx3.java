package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Student> result = method();
		for(Student s : result) {
			System.out.println(s);
		}
		System.out.println("----------------");
		Iterator it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길자",25));
		list.add(new Student("홍길이",35));
		list.add(new Student("홍삼이",45));
		return list;
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
