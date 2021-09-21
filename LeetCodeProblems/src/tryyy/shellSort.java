package tryyy;

public class shellSort {
    public int[] shellSort(int []array){
        int j;
        int length = array.length;
        for(int gap = length/2;gap>0;gap/=2)
        {
            for(int i = gap;i<array.length;i++)
            {
                int temp = array[i];
                for( j = i;j>=gap&&temp<array[j-gap];j -= gap){
                    array[j] = array[j-gap];
                }
                array[j] = temp;
                // 分组交换
            }
        }
        return array;
    }
}
