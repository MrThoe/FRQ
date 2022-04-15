public class HiddenWord{
  
  private string secretWord;
  private int l;  //Length of word
  
  public HiddenWord(String theWord)
  {
    secretWord = theWord;    
    l = theWord.length();
  }
  
  public String getHint(String guess)
  {
      String output = "";
      for(int i = 0; i < secretWord.length; i++)
      {
          if(secretWord.charAt(i) == guess.charAt(i))
          {
            output += secretWord.charAt(i);  
          } else if (secretWord.indexOf(guess.charAt(i))){
            output += "+";
          } else {
            output += "*";
      }
      return output;
    }
 }
  
