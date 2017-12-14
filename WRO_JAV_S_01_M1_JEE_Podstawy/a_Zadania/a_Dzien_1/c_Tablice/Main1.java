package a_Zadania.a_Dzien_1.c_Tablice;

public class Main1 {

    public static void main(String[] args) {
		int [] mainTab = new int [50];
		for(int i=0; i<50; i++) mainTab[i]=i;
		for(int i=0; i<50; i++) {
		if(i<10) System.out.print("0");
		if(i%10==0 && i!=0) System.out.println();
		System.out.print(mainTab[i] + ", ");
		}
	}
}
