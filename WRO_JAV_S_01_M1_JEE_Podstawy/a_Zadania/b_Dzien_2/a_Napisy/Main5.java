package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
    	String str="asdfdd";
    	char c='d';
    	System.out.println(charPos(str,c));

    }

    static int charPos(String str, char c) {
    	int pos=0;
    	for(int i=0; i<str.length(); i++)
    		if(str.charAt(i)==c) {
    			pos=i;
    		}
    return pos;
    }
}
