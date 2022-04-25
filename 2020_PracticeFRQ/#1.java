public static int hailstoneLength(int n)
{
  int count = 0;
  while (n != 1)
  {
    count += 1;  // Add one to the counter for each time the loops executes
    if(n%2==0) {
      n = n/2;  
    } else {
      n = 3*n +1;
    }
  } // END WHILE LOOP
  return count;
}
