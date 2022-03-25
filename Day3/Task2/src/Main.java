
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Beyzaydnn","abcd","Beyza","Aydın",24,"MathEng");
		Instructor instructer = new Instructor(1,"Beyzaydnn","abcd","Beyza","Aydın","Engin","Demirog");
		
	    StudentManager studentmanager = new StudentManager();
		studentmanager.add(student);
		
		InstructerManager instructermanager = new InstructerManager();
		instructermanager.add(instructer);
		
		
		

	}

}
