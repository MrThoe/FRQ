public class GameSpinner{
  
  private int numSectors;
  private int spins;
  private int num;
  
  public GameSpinner(int n)
  {
    numSectors = n;
    num = 0;
    spins = 0;
  }
  
  public int currentRun()
  {
    return spins;
  }
  
  public int spin()
  {
    int n = (int)(Math.random()*4)+1;
    //While spinning, it is easy to check against the previous number to see if the streak is continuing
    if(n == num){
      spins++;
    } else {
      spins = 1;
    }
    num = n;
    return n;
  }
 
  
}
