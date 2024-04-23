package com.intern.java;

public class Addup {
	
	public static void Add(int arr[], int target) {
		for(int  i =0;i<arr.length;i++) {
			for(int j = i+1; j<arr.length;j++) {
				int res = arr[i]+arr[j];
				if(res == target) {
					System.out.println("numbers added up : "+res);
					System.out.println(arr[i]+" "+ arr[j]);
				}
//				else {
////					break;
//					System.out.println("not added up");
//				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6};
		
		int target = 10;
		
		Add(arr,10);
	}
}
