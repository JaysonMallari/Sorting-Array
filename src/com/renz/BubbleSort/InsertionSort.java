package com.renz.BubbleSort;
/*
 * Sorting Array using Bubble sort algorithm
 * Jayson Mallari
 */
import java.util.Scanner;
public class InsertionSort {
	
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
		
		insertionSort(arr);
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x] +"\t ");
		}
	}
	
	public static void insertionSort(int[] arr){
		int x,key,y;
		for( x =1; x>arr.length;x++){
			key = arr[x];
			
			for(y =x - 1;(y >= 0) && (arr[y] < key);y --){
				arr[y+1] = arr[y];
			}
			arr[y+1]=key;
		}
	}

}
