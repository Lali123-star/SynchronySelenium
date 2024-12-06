package collection;

public class App {

	public static int second(int a[],int n) {
		int[] arr = new int [n];
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[n-2];
	}
	public static void main(String args[]) {
	int[] arr = {12,13,14,6,8};
	int n=14;
	int result = second(arr,n);
	System.out.println(result);
}
}
	
			
