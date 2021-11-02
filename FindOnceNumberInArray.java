package Java_Assignmetn_01Nov2021;

import java.util.Arrays;

public class FindOnceNumberInArray {
	
	public void FindOnce(int arr[]) {
		int len=arr.length;
		int temp;
		Arrays.sort(arr);
		System.out.print("Not repeated Elements are : ");
		for(int i=0;i<len;i++) 
		{
			int count=0;
			
			for (int j = 0; j < len; j++)
            {
                 //check the condition if any number is same so
               //incre
               if(arr[i]==arr[j] && i!=j)
                      count++;
            }
			if(count==0)
				System.out.print(arr[i]+" ");
		}
		
		
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,50,65,65};
		FindOnceNumberInArray fonia= new FindOnceNumberInArray();
		fonia.FindOnce(arr);

	}

}
