public static boolean isLongSeq(int n)
{
  if(n < hailstoneLength(n))
  {
    return true; 
  }
  return false;
}
