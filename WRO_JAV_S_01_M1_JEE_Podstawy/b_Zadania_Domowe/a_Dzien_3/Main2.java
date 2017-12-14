package b_Zadania_Domowe.a_Dzien_3;

import java.util.*;
public class Main2 {

	static String safeGet(String[] str, int index) 
		throws ArrayIndexOutOfBoundsException {
		return str[index];
		}
	public static void  main(String[] args){
		String[] str = {"aaa", "bab", "cac"};
    	int index=2;
    	
    	try {
            System.out.print (safeGet(str , index));
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś indeks wykraczający poza rozmiar tablicy!");
    	}

    }
    
		




