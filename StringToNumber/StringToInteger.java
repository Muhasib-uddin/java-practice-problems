import java.io.*;
import java.util.Scanner;

public class StringToInteger{
	
	public static void main (String[] args){
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the Number String: ");
		String givenString = scanner.nextLine();
		
		int result=0;
		int start=0;
		int characterLength = givenString.length();
		//System.out.println(givenString.length());
		if(givenString.charAt(0) == '-'){
		start=1;
		}
		for(int i = start ; i < characterLength ; i++){

			result=result*10+givenString.charAt(i)-48;
		}
			
		if(start==1){
			System.out.println("String Converted to Integer is:  " + result*-1);
			}
		else{
			System.out.println("String Converted to Integer is:  " + result);
		}
	}
	
}
