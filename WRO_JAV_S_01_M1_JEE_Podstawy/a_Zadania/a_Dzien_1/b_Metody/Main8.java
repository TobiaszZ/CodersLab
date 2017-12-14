public class Main8 {
	
	static int maxOfThree (int a, int b, int c) {
		if(a>b){
			if(a>c) return a;
			else return c;
		}
		else {
			if (b>c) return b;
			else return c;
		}
	}
    
    public static void main(String[] args) {
        System.out.println(maxOfThree(1,3,2));
    
}
}
