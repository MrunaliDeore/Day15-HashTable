/*Ability to find frequency of words in a sentence like “To be or not to be”
- Use LinkedList to do the Hash Table Operation
- To do this we create MyMapNode with Key Value Pair and create LinkedList of MyMapNode*/

package Fifteen;

import java.util.HashMap;
import java.util.Set;

public class linkedHashTable {
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
		System.out.println("Ability to find frequency of words in a \n"
				+ "sentence like “To be or not to be”");
		System.out.println("------------------------------------------");
		for(String word : wordsInString){
			if(wordCount.get(word)>1){				
				System.out.println(word+" : "+wordCount.get(word));
			}
		}

	}
	public static void main(String args[]){
		duplicate("To be or not To be");

	}
}
