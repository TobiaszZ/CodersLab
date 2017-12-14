package exam;

public class Main2 {
	static String shorten(String str, int length){
		String xxx = str.substring(0, length);
		return xxx;
			
	}
	public static void main(String[] args) {
		String str="Naucz się programować od podstaw";
		int length=2;
		System.out.println(shorten(str,length));
	}
}
