package exam;

import java.util.Random;

public class Main3 {
	static int[] div(int size, int interval) {
        int result[] = new int[size];
        int xxx = 0;
        do {
                Random generator = new Random();
                int i = generator.nextInt(interval)+1 ;

                if (i%2==0 && i%3!=0) {
                        result[xxx] = i;
                        xxx++;
                }
        } while (xxx < size);

        return result;
}
public static void main(String[] args) {
        int size = 4;
        int interval = 20;
        int[] tab = div(size, interval);
        for (int i = 0; i < tab.length; i++) {
                System.out.println(tab[i]);
        }
}
}



