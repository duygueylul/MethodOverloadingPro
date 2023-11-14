package MethodOverloadingPro;

public class MethodPro {
	
	static void topla(int x, int y) {
		
		System.out.println("İki Sayının Toplamı: " + (x+y));
	}
	static void topla(int x, int y, int z) {
		System.out.println("Üç Sayının Toplamı: " + (x+y+z));
	}
	static void topla(int x, int y, int z, int a) {
		System.out.println("Dört Sayının Toplamı: " + (x+y+z+a));
	}
	
	

	public static void main(String[] args) {
		
		topla(4,9);
		topla(21,58,74);
		topla(63,5,89);

	}

}
