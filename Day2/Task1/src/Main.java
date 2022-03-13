
public class Main {

	public static void main(String[] args) {
		
		Lecture lecture1 = new Lecture();
		lecture1.id=1;
		lecture1.name="Yazýlým Geliþtirici Yetiþtirme Kampý (JavaScript)";
		lecture1.price="Ucretsiz";
		lecture1.title="1,5 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz";			
			
		Lecture lecture2= new Lecture(2,"Yazýlým Geliþtirici Yetiþtirme Kampý","Ucretsiz","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Lecture lecture3= new Lecture(3,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA & REACT)","Ucretsiz","2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		Lecture lecture4 = new Lecture(4,"Programlamaya Giriþ Ýçin Temel Kurs","Ucretsiz","PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.");
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
