package com.renz.BubbleSort;
/*
 * Sorting Array using Bubble sort algorithm
 * Jayson Mallari
 */
import java.util.Scanner;
public class BubbleSort {

		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			int[] arr ;
			int numToSort;
			
			System.out.println("How many numbers would you like to sort? ");
			numToSort = in.nextInt();
			arr = new int[numToSort];
			
			
			for(int x=0;x<arr.length;x++){
				System.out.print(x+1 +": ");
				arr[x] = in.nextInt();
			}
			
			bubbleSort(arr);
			for(int x=0;x<arr.length;x++){
				System.out.print(arr[x] +"\t ");
			}
		}
		
		public static void bubbleSort(int[] arr){

			for(int x = arr.length - 1; x>=0;x--){
				for(int y = 1;y<arr.length;y++){
					if ((arr[y-1])>arr[y]){
						int tmp = arr[y-1];
						arr[y-1] = arr[y];
						arr[y] = tmp;
					}
				}
			}
		}
}
