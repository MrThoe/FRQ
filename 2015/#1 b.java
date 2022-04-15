public static int[] rowSums(int[][] arr2D)
{
    int[] output = new int[arr2D.length];
    for(int i = 0; i < arr2D.length; i++)
    {
      //arraySum(int[] arr) returns the sum of a 1D integer array
      output[i] = arraySum(arr2D[i]); 
    }
    return output;
}

//OR

public static int[] rowSums(int[][] arr2D)
{
    int[] output = new int[arr2D.length];
    for(int[] i : arr2D)
    {
      //arraySum(int[] arr) returns the sum of a 1D integer array
      output[i] = arraySum(i); 
    }
    return output;
}
