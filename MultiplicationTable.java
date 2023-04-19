package project01;
import java.util.Scanner;

public class MultiplicationTable {
	int multipleNumber;
	
	MultiplicationTable(int inputNumber){
		this.multipleNumber = inputNumber;
	}
	
	void Multiplication(int inputNumber) {
		for(int i=1; i<10; i++) {
			System.out.println(inputNumber + "*" + i + "=" + inputNumber*i);
		}
	}
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number1 = Integer.parseInt(scanner.nextLine());
		MultiplicationTable multiplicationTable = new MultiplicationTable(number1);
		multiplicationTable.Multiplication(number1);
	}
}
