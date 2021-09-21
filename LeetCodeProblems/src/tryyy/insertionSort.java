package tryyy;

public class insertionSort {

    public int[] sort(int []array)
    {
      int n = array.length;
      for(int i = 0;i<n;i++)
      {
          for(int j=i;j>0;j--)
          {
              if(array[j]<array[j-1])
                  swap(j-1,j,array);
              else break;
          }
      }
      return array;
    }
    void swap(int i,int j,int []array)
    {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}
