package methods;

public class Main {

	public static void main(String[] args) {
		
		sayibulmaca();

	}
	
	
	public static void sayibulmaca() {
		
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		
		String mesaj = "";
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				
				mesaj = "Sayi mevcuttur :" + aranacak;
				mesajVer(mesaj);
				return;
			}
		}
		mesaj = "Sayi mevcut deðil :" + aranacak;
		
	}

	
	public static void mesajVer(String mesaj) {
		
		System.out.println(mesaj);
	}
	
	
}
