package pf3quickSort;

public class quickSort {
	//partition is method which returns exact position of pivot element in sorted array
	public  int Partition(int[] numbers, int left, int right)
    {
        int pivot = numbers[left];                  //I'm taking first element as pivot
        while (true)                                //and finding its right position 
        {                                           //in sorted ascending array
            while (numbers[left] < pivot)
                left++;
 
            while (numbers[right] > pivot)
                right--;
 
            if (left < right)
              {
                int temp = numbers[right];
                numbers[right] = numbers[left];
                numbers[left] = temp;
              }
              else
              {
                    return right;
              }
        }
    }
 
      public int[] QuickSort_Recursive(int[] arr, int left, int right)
    {
        
        if(left < right)                                    //base condition
        {
            int pivIndex = Partition(arr, left, right);
 
            if(pivIndex > 1)
                QuickSort_Recursive(arr, left, pivIndex - 1);  //recursive call
 
            if(pivIndex + 1 < right)
                QuickSort_Recursive(arr, pivIndex + 1, right);   //recursive call
        }
       
        return arr;
    }
      //to display sorted array on console
      public void display(int[] arr)
      {
      for(int cnt=0;cnt<arr.length;cnt++)
		{
		System.out.print(arr[cnt] + "  ");
		}
      }
}
