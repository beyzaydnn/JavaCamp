
public class Main {

	public static void main(String[] args) {
		
		Lecture lecture1 = new Lecture();
		lecture1.id=1;
		lecture1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JavaScript)";
		lecture1.price="Ucretsiz";
		lecture1.title="1,5 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz";			
			
		Lecture lecture2= new Lecture(2,"Yaz�l�m Geli�tirici Yeti�tirme Kamp�","Ucretsiz","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Lecture lecture3= new Lecture(3,"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)","Ucretsiz","2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		Lecture lecture4 = new Lecture(4,"Programlamaya Giri� ��in Temel Kurs","Ucretsiz","PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.");
		Lecture[] lectures = {lecture1,lecture2,lecture3,lecture4}; 
		
		
		LectureManager lecturemanager = new LectureManager();
		lecturemanager.add(lecture4);
		
		
		for(Lecture lecture : lectures)
		{
			System.out.println(lecture.name);
			System.out.println("\t");
		}

		Instructer instructer1=  new Instructer(1,"Engin","Demirog");
		InstructerManager instructermanager = new InstructerManager();
		instructermanager.delete(instructer1);
	}

}
