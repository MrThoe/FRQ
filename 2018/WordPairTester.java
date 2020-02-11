package fRQ_2018;

public class MainFunctionFRQ {
	public static void main(String[] args) {
		
		String[] wordNums = {"one", "two", "three", "four"};
		WordPairList ex = new WordPairList(wordNums);
		for(int i = 0; i < ex.allPairs.size(); i++) {
			System.out.println(ex.allPairs.get(i).words[0] + ex.allPairs.get(i).words[1]);
		}
	}
}
