/*Ability to find frequency of words in a large paragraph phrase “Paranoids are not
paranoid because they are paranoid but because they keep putting themselves
deliberately into paranoid avoidable situations”
- Use hashcode to find index of the words in the para
- Create LinkedList for each index and store the words and its frequency
- Use LinkedList to do the Hash Table Operation
- To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode*/

package Fifteen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class findFrequency {
	static void duplicate(String inputString){

		HashMap<String, Integer> wordCount = new HashMap<String,Integer>();
		String[] words = inputString.split(" ");

		for(String word : words){
			if(wordCount.containsKey(word)){
				wordCount.put(word, wordCount.get(word)+1);             
			}
			else{
				wordCount.put(word, 1);
			}
		}
		//Extracting of all keys of word count
		Set<String> wordsInString = wordCount.keySet();
		System.out.println("Ability to find frequency of words in a\n  large paragraph phrase");
		System.out.println("------------------------------------------");
		for(String word : wordsInString){
			if(wordCount.get(word)>1){				
				System.out.println(word+" : "+wordCount.get(word));
			}
		}

	}
	public static void main(String args[]){
		duplicate("Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");
	}
}
