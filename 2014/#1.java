public class WordScrambler
{
  private String[] scrambledWords;
  
  public WordScrambler(String[] wordArr)
  {
    scrambledWords = mixedWords(wordArr);
  }
  
  private String recombine(String word1, String word2)
  {
    String output = "";
    //Since i is an int, if length is odd, like 7, then 7/2 = 3.
    for(int i = 0; i < word1.length()/2; i++){
      output += word1.charAt(i);
    }
    for(int i = word2.length()/2; i < word2.length(); i++){
      output += word2.charAt(i);
    }
    return output;
  }
  
  private String[] mixedWord(String[] words)
  {
    String[] output = new String[words.length];
    for(int i = 0; i < words.length-1; i++){
      if(i%2==0){
        output[i] = recombine(words[i], words[i+1]);
      } else {
        output[i] = recombine(words[i], words[i-1]);
      }
    }
    return output;
  }
}
