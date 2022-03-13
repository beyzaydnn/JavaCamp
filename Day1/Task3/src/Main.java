
public class Main {

	public static void main(String[] args) {
		
		//Hello World
		System.out.println("Hello Java");
		
		//Variables
		int ogrenciSayisi =10;
		System.out.println("Öðrenci sayým : "+ ogrenciSayisi);
		
		//Data Types
		int sayi =12;
		double sayi1 =12.5;
		char karakter = 'A';
		
		
		// Conditional
        int sayi2 = 24;
        if (sayi2 < 20) {
            System.out.println("Sayý 20'den küçüktür");
        } else if (sayi2 == 20) {
            System.out.println("Sayý 20'ye eþittir.");
        } else {
            System.out.println("Sayý 20'den büyüktür");
        }
        
        // ReCap Demo 1
        
        int sayi3 =240;
        int sayi4 =250;
        int sayi5 =23;
        int enBuyuk=sayi3;
        
        if(enBuyuk<sayi4) {
        	enBuyuk=sayi4;
        }  
        if(enBuyuk<sayi5) {
        	enBuyuk=sayi5;
        }
        
        System.out.println("En buyuk = " +enBuyuk);
        
        // SwitchDemo
        
        int number = 4;
        switch (number) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            case 5:
                System.out.println("Number is 5");
                break;
            case 6:
                System.out.println("Number is 6");
                break;
            case 7:
                System.out.println("Number is 8");
            default:
            	System.out.println("Number more than 8");
                break;
        }
        
        //Loop Demo
        
        for(int i=1;i<10;i++)
        {
        	System.out.println(i);
        }
        System.out.println("Dongu Bitti");
        
        
        int j=1;
        while(j<10)
        {
        	System.out.println(j);
        	j++;
        }
        System.out.println("Dongu Bitti");
	}

}
