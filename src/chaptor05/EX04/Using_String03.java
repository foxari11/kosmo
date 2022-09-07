package chaptor05.EX04;

public class Using_String03 {

	public static void main(String[] args) {
		// String vs 다른 참조 자료형 (배열) 비교.
		// String에 저장된 값은 수정이 불가, 새로운 값이 Heap 영역에 생성됨.
		
		// 1. String (객체의 내용 변경이 불가함 ==> 새로운 객체 생성)
		String str1 = new String("안녕");
		String str2 = str1;      //Stack 영역의 객체 주소를 복사함.
		
		System.out.println(str1 == str2);
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = "안녕하세요";     
		System.out.println(str1 == str2);   
	    System.out.println(str2);
	    
	}

}
