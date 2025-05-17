package My_top_100_programs_java_13052025;

import java.util.Arrays;
import java.util.Comparator;

public class second_largest_word_P19 {

	public static String findsecondlargestWord_myApproach1(String str) {
		
		if(str.length()==0 || str.trim().isEmpty()) {
			return null;
			
		}
		String[] words = str.split(" ");
		if(words.length <2) {
			return null ;
		}
		int l = words.length;
		for(int i =0;i<l;i++) {
			for(int j = i+1;j<l;j++) {
				
				if(words[j].length()<words[i].length()) {
				String temp = words[i];
				words[i] = words[j];
				words[j] = temp;
					
				}
			}
		}String second = words[l-1];
		System.out.println(second);
		return str;	
		
	}
	
	 public static String findSecondLongestWord_gemini(String sentence) {
	        if (sentence == null || sentence.trim().isEmpty()) {
	            return null;
	        }
	        String[] words = sentence.trim().split("\\s+"); // Split by one or more spaces
	        if (words.length < 2) {
	            return null; // Not enough words for a second longest
	        }

	        // Sort words by length in descending order
	        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());

	        return words[1]; // The second element after sorting is the second longest
	    }

	    public static void main(String[] args) {
	        String sentence = "Java Programming is fun and interesting";
	        String secondLongest = findSecondLongestWord_gemini(sentence);
	        if (secondLongest != null) {
	            System.out.println("Second longest word: " + secondLongest); // Output: Programming
	        } else {
	            System.out.println("Not enough words in the sentence.");
	        }
	        
	        String sentence3 = "Java Programming is fun and interesting";
	        String second = findsecondlargestWord_myApproach1(sentence3);
	        if (second != null) {
	            System.out.println("Second longest word: " + secondLongest); // Output: Programming
	        } else {
	            System.out.println("Not enough words in the sentence.");
	        }

	        String sentence2 = "Hello";
	        String secondLongest2 = findSecondLongestWord_gemini(sentence2);
	        if (secondLongest2 != null) {
	            System.out.println("Second longest word: " + secondLongest2);
	        } else {
	            System.out.println("Not enough words in the sentence."); // Output: Not enough words in the sentence.
	        }
	    }
	}

