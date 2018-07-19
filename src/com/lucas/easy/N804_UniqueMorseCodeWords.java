package com.lucas.easy;

import java.util.HashMap;

public class N804_UniqueMorseCodeWords {
	public static void main(String[] args) {
		String[] wStrings = {"a"};
		System.out.println(uniqueMorseRepresentations(wStrings));
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
        HashMap<String, String> hm = new HashMap<>();
        for(int i=0; i<words.length; i++){
            String mc = word2MC(words[i]);
            if(!hm.containsKey(mc)){
            	hm.put(mc, words[i]);
            }
        }
        return hm.size();
    }
    
    public static String word2MC (String word){
        String rst = "";
        if(word == "") return rst; 
        String[] aMC = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] aWord = word.toCharArray();
        for(int i=0; i<aWord.length; i++){
            rst += aMC[aWord[i] - 'a']; 
        }
        return rst;
    }
}
