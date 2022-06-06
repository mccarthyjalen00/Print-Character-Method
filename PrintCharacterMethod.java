//**********************************
//COSC 1336 CS 1
//Name: Jalen McCarthy
//Date: 10/8/21
//Print Character using method
//*********************************
import java.util.Scanner;
public class PrintCharacterMethod {

	//Create Table
	public static void printChars(char ch1, char ch2, int numberPerLine) {
	int printChars = ch1;
	int lines = (ch2-ch1) / numberPerLine+1;
	for (char i = 1; i <= lines; i++); {
		for (char j=1; j<=numberPerLine; j++) {
		if (printChars<=(int)ch2) {
		System.out.printf("%3c" , printChars);
		printChars++;
	}
		}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//Create variables
	char ch1 = 'a';
	char ch2 = 'z';
	int numberPerLine = 10;
		
	//Create Scanner class
	Scanner input = new Scanner(System.in);
	
	//Prompt User to enter character
	System.out.print("Please input the beginning character:");
	 ch1 = input.next().charAt(0);
	
	
	System.out.print("Please input the ending character:");
	 ch2 = input.next().charAt(0);
	//Display Results
	System.out.print("Please input numbers of characters display per line:");
	numberPerLine =input.nextInt();
	
	//Display Results
	
	printChars(ch1, ch2, numberPerLine);
	
	input.close();
	
	

	
	}

	}


