/*Remove avoidable word from the phrase “Paranoids are not paranoid because they are paranoid but
because they keep putting themselves deliberately into paranoid avoidable situations”
- Use LinkedList to do the Hash Table Operation like here the removal of word avoidable
- To do this create MyMapNode with Key Value Pair and create LinkedList of MyMapNode*/

package Fifteen;

import java.util.HashMap;

public class removeHashTable {
	// Method 1
    // To remove the word
    static void remove(String str, String word)
    {
        // Split the string using split() method
        String msg[] = str.split(" ");
        String new_str = "";
 
        // Iterating the string using for each loop
        for (String words : msg) {
 
            // If desired word is found
            if (!words.equals(word)) {
 
                // Concat the word not equal to the given
                // word
                new_str += words + " ";
            }
        }
 
        // Print the new String
        System.out.print(new_str);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom string as input
        String str = "Paranoids are not paranoid because \n they are paranoid but because they keep \n putting themselves deliberately into \n paranoid avoidable situations";
 
        // Word to be removed from above string
        String word = "avoidable";
 
        // Calling the method 1 by passing both strings to
        // it
        remove(str, word);
    }
}
