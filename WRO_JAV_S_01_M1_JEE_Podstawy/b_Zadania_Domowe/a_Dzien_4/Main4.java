package b_Zadania_Domowe.a_Dzien_4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class Main4 {
	public static int[] sortedArray()throws InputMismatchException {
		Scanner input = new Scanner (System.in);
    	System.out.println("Ile elementów do losowania: ");
    	int i=0;
    	try {
    		i=input.nextInt();
    		}
    	catch (InputMismatchException e) {
  		  	System.out.println("Coś jest nie tak ");
    		}
  		  	int tabela[] = new int[i];
  		  	Random result = new Random();
  		  	for(int ij = 0; ij<i; ij++)
  		  		tabela[i]=result.nextInt(100);
  		  	Arrays.sort(tabela);
  		  	input.close();
  		  	
  		  	return tabela;
  		  	}
	
    public static void main(String[] args) {
    	sortedArray();

    }


}
