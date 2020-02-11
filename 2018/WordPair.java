package fRQ_2018;

public class WordPair {
	
	public String[] words;
	public WordPair(String first, String second) {
		words = new String[2];
		words[0] = first;
		words[1] = second;
	}
	
	public String getFirst() {
		return words[0];
	}
	
	public String getSecond() {
		return words[1];
	}
}
