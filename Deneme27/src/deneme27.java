import java.util.Scanner;

public class deneme27 {
	public static int toplama(int a,int b) {
		return (a+b);
	}
	public static int toplama(int a,int b, int c) {
		return (a+b+c);
	}
	public static int cikarma(int a,int b) {
		return (a-b);
	}
	public static int carpma(int a,int b) {
		return (a*b);
	}
	public static int carpma(int a,int b,int c) {
		return (a*b*c);
	}
	public static double bolme(int a,int b) {
		return ((double)a / b);
	}

	public static void main(String[]args) {
		
		String islemler = "1.Toplama İşlemi\n"
				+ "2.Çıkarma İşlemi\n"
				+ "3.Çarpma İşlemi\n"
				+ "4.Bölme İşlemi\n"
				+ "Çıkış için q'ya basınız...";
		System.out.println(islemler);
		System.out.println("*********************");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Yapılacak işlemi seçiniz(örn. 3): ");
			String islem = scanner.nextLine();
			
			
			if(islem.equals("q")) {
				System.out.println("Çıkış yapılıyor...");
				break;
			}
			else if(islem.equals("1")) {
				System.out.println("Kaç değerli işlem (2 veya 3):");
				int kac = scanner.nextInt();
				scanner.nextLine();
				
				if(kac==2) {
					System.out.println("İlk sayı: ");
					int a = scanner.nextInt();
					System.out.println("İkinci sayı: ");
					int b = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Sonuç: "+ toplama(a,b));
				}
				 else if(kac==3) {
					System.out.println("İlk sayı: ");
					int a = scanner.nextInt();
					System.out.println("İkinci sayı: ");
					int b = scanner.nextInt();
					System.out.println("Üçüncü sayı: ");
					int c = scanner.nextInt();
					
					scanner.nextLine();
					System.out.println("Sonuç: "+ toplama(a,b,c));
				}
				
				 else {
					 System.out.println("Bunun için uygun metot bulunmuyor...");
				 }
				
				
				
			}
			
			else if(islem.equals("2")) {
			
		    System.out.println("İlk sayı: ");
			int a = scanner.nextInt();
			System.out.println("İkinci sayı: ");
			int b = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Sonuç: "+ cikarma(a,b));
			
			}
			
			
			else if(islem.equals("3")) {
				System.out.println("Kaç değerli işlem (2 veya 3):");
				int kac = scanner.nextInt();
				scanner.nextLine();
				
				if(kac==2) {
					System.out.println("İlk sayı: ");
					int a = scanner.nextInt();
					System.out.println("İkinci sayı: ");
					int b = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Sonuç: "+ carpma(a,b));
				}
				 else if(kac==3) {
					System.out.println("İlk sayı: ");
					int a = scanner.nextInt();
					System.out.println("İkinci sayı: ");
					int b = scanner.nextInt();
					System.out.println("Üçüncü sayı: ");
					int c = scanner.nextInt();
					scanner.nextLine();
					
					System.out.println("Sonuç: "+ carpma(a,b,c));
				}
				 else {
					 System.out.println("Bunun için uygun metot bulunmuyor...");
				 }
			      
			}
			
			else if(islem.equals("4")) {
				
			    System.out.println("İlk sayı: ");
				int a = scanner.nextInt();
				System.out.println("İkinci sayı: ");
				int b = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Sonuç: "+ bolme(a,b));
				}
				
			else {
				System.out.println("Geçersiz İşlem...");
			}
		
		
		}
		
		scanner.close();
		
	}
	
	
	
}