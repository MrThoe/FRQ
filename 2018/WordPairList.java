package fRQ_2018;

import java.util.*;

public class WordPairList {

	public ArrayList<WordPair> allPairs;

	public WordPairList(String[] words){ 
		allPairs = new ArrayList();
		for(int i = 0; i < words.length - 1; i++) {
			for(int j = i + 1; j < words.length; j++) {
				WordPair wordPair = new WordPair(words[i], words[j]);
				allPairs.add(wordPair);
			}
		}
	}
	
	
	public int numMatches(){
		return 0;
	} 
}
