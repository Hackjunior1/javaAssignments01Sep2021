package Java_Assignmetn_01Nov2021;
//Assignment Link : - https://onedrive.live.com/view.aspx?resid=B270BFA8B6522593!218&ithint=file%2cdocx&authkey=!AJn3nCj6TliBsnc
public class FindMissingNumberFromArray {
	public void FindMissingNum(int[] arr) {
		int len=arr.length+1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				System.out.println("Array is empty. please read elements into array.");
			else
				sum +=arr[i];
		}
		//formula to calculate sum of natural numbers are( n*(n+1))/2 
		int NAturalNumSum=(len*(len+1))/2;
		System.out.println("missing number from array is "+(NAturalNumSum-sum));
		
	}
	public static void main(String[] args) {
		int A[] = {6,1,2,8,3,4,7,10,5};
		FindMissingNumberFromArray fmnfa=new FindMissingNumberFromArray();
		fmnfa.FindMissingNum(A);
	}
}


