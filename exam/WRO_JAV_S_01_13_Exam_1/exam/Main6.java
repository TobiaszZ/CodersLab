package exam;

public class Main6 {
	static String replaceStr(String str, String forReplace, String replacement){
	String xxx = str.replace(forReplace,replacement);
	return xxx;
	}
	public static void main(String[] args) {
		String str="MAMA";
		String forReplace="MA";
		String replacement="TA";
		System.out.println(replaceStr(str,forReplace,replacement));
	}
}