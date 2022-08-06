package simplilearn.examples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchWithInts {
	
	public static void main ( String[] args) {
		
		String input  = getInput("Enter a number between 1 and 12");
		
		int month = Integer.parseInt(input);
		
		switch( month) {
		case 1: System.out.println("Jan");
			break;
		case 2: System.out.println("Feb");
			break;	
		default:
			System.out.println("Enter another month");
			break;
		}
	
	}
	
	private static  String getInput(String prompt) {
		
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter input ");
		
	}


}
