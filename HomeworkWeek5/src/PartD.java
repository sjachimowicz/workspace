import java.util.Scanner;

public class PartD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a sentence to be translated");
		String sentence = input.nextLine();
		
		String[] words = sentence.split(" ");
		
		for( int i = 0; i < words.length; i++){
			System.out.print(translate(words[i]) + " ");

		}

	}
	public static String translate(String word){
		String consonant = new String();
		int counter = 0;

		//check 2nd char
		if(word.length() > 1 && !isVowel(word.charAt(1))){
			//if consonant increment counter
			counter++;
		}
		
		if(word.length() > 0 && !isVowel(word.charAt(0))){
			// if consonant store 1st char, increment counter
			if(counter == 0){
				consonant = word.substring(0, 1);
				word = word.substring(1);
			}
			counter++;
		}
	
		
		//if counter > 1
		if(counter > 1){
			return word;
		}
		else{
			return word.concat("-").concat(consonant).concat("eh");
		}
		
		
	}
	public static boolean isVowel(char letter){
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		for( int i = 0; i < vowel.length; i++){
			if(letter == vowel[i]){
				return true;
			}
		}
		return false;
	}

}
