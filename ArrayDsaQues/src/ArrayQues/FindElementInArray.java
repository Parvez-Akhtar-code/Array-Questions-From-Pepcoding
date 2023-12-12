package ArrayQues;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the array length : ");
		int n=scn.nextInt();
		int[] arr= new int[n];
		System.out.println("enter the array values -->");
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
			}
		System.out.print("enter the finding value :");
		int val=scn.nextInt();
		System.out.print("value on index :");
		for(int i=0;i<n;i++) {
			
			if(arr[i]==val) {
				System.out.println(i);
				break;
			}
		}

	}

}
