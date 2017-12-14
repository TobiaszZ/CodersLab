package exam;

import java.util.Scanner;

public class Main4 {
    
    static int[] returnTab() {
             System.out.println("podaj n: ");
             Scanner in = new Scanner(System.in);
             int n = in.nextInt();
             int tab[] = new int[n];
             for (int i = 1; i <= n; i++) {
                     tab[i - 1] = i;
             }

             in.close();
             return tab;
     }

     public static void main(String[] args) {
             int[] tab = returnTab();
             for (int i = 0; i < tab.length; i++) {
                     System.out.println(tab[i]);
             }
     }

 }


	

