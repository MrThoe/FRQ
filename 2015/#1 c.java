public static boolean isDivers(int[][] arr2D)
{
  int[] sums = rowSums(arr2D);
  for(int i = 0; i < sums.length; i++)
  {
    for(int j = 0; j < sums.length; j++)
    {
      if(i != j && sum[i] == sums[j])
      {
        return false;
      }
    }
  }
  return true;
}
