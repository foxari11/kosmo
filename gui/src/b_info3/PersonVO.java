package b_info3;

public class PersonVO {
	
	private String name;
	private String id;
	private String tell;
	private String gender;
	private int age;
	private String home;
	
	public PersonVO() {}
	
	public PersonVO(String name, String id, String tell, String gender, int age, String home) {
		super();
		this.name = name;
		this.id = id;
		this.tell = tell;
		this.gender = gender;
		this.age = age;
		this.home = home;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}


	public String toString() {
		return "PersonVO [name=" + name + ", id=" + id + ", tell=" + tell + ", gender=" + gender + ", age=" + age
				+ ", home=" + home + "]  \n";
	}
	
	
	

}
