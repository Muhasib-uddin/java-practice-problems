import java.io.*;

public class ArrayString {
	
	public static void main (String [] args){
		String[] arrayOfCharacters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};		     
		String characterCombination;
		int digitCounter;
		
		do {
			characterCombination = generateCharacterCombination(arrayOfCharacters);
			digitCounter = generateDigitCounter(characterCombination);
			
		}while( digitCounter < 2);
		
		System.out.println(characterCombination);
	}
	
	static String generateCharacterCombination(String[] arrayOfCharacters){
		String combination = "";
		boolean[] usedCharacters = new boolean[arrayOfCharacters.length];
		for(int i=0; i < 10 ; i++){
			int randomArrayIndex = (int) (Math.random() * arrayOfCharacters.length );
			while(usedCharacters[randomArrayIndex]){
				randomArrayIndex = (int) (Math.random() * arrayOfCharacters.length );	
			}
			
			usedCharacters[randomArrayIndex] = true;
			combination = combination + arrayOfCharacters[randomArrayIndex];		
		}
		return combination;
	}
	
	static int generateDigitCounter(String combination){
		int digitCounter = 0;
		char[] combinationArray = combination.toCharArray();
		int i = 0;
		for(int j = 48 ; j <= 57 ; j++){
			int asciiOfCharacter = (int) combinationArray[i];
			if(asciiOfCharacter == j){
				digitCounter++ ;
			}
			i++;
		}
		return digitCounter;
	}
}
