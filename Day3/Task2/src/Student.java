
public class Student extends User {

	private int age;
	private String degree;
	
	public Student() {
		
	}

	public Student(int id, String userName, String password, String firstName, String lastName,int age,String degree) {
		super(id, userName, password, firstName, lastName);
		this.age = age;
		this.degree = degree;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}


	
}
