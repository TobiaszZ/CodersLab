package a_Zadania.a_Dzien_1.d_Konstruktor;

import java.util.Arrays;

public class Calculator {
	private String[] history;
	Calculator(){
	this.history = new String [0];
	}
	public int add(int num1, int num2){
		int result = num1 + num2;
		String koniec = "added" + num1 + "to" + num2 + "got" + "result";
		
		this.addToHistroy(koniec);
		return result;
	}
//	private void addToHistroy(String operation){
//		String newHistory[] = new String[this.history.length+1];
//		System.arraycopy(this.history,0, newHistory, 0, this.history.length);
//		newHistory[newHistory.length-1] =  operation ; 
//		this.history= newHistory;
//		
//}
	
	
	private void addToHistroy(String operation){
		this.history = Arrays.copyOf(this.history, this.history.length + 1);
		this.history[this.history.length-1] = operation;
	}
	public static void main(String[] args){
		Calculator calc = new Calculator();
		calc.add(4, 5);
		calc.add(9, 2);
	}
}