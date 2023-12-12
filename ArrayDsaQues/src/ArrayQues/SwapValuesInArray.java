package ArrayQues;
public class SwapValuesInArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		arr[4]=40;
		
		swap(arr, 2, 4);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
