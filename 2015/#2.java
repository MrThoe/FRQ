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
          if(secretWord.subString(i,i+1).equals(guess.subString(i,i+1)))
          {
            output += secretWord.subString(i, i+1);  
          } else if (secretWord.indexOf(guess.subString(i,i+1))){
            output += "+";
          } else {
            output += "*";
      }
      return output;
    }
 }
  
