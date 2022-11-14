package com.greatlearning.design;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FloorAssembly {
	int noOfFloors;
	int arr[];
	
	PriorityQueue<Integer> pqueue = new PriorityQueue<>(Collections.reverseOrder());
	
	public void arrangeFloors() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of floors you want in Building");
		noOfFloors = sc.nextInt();
		int day = noOfFloors;
		arr = new int[noOfFloors];
		for(int i = 0; i<noOfFloors; i++) {
			
			System.out.println("Enter floor size on day: " + (i+1));
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("The entered order of Floor plan is: ");
		for(int i =0; i<noOfFloors; i++) {
			
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println();
		
		calculate(day, arr, noOfFloors);
	}
	
	public void calculate(int days, int[] array, int floorsize) {
		System.out.println("The order construction is as follows: ");
		for(int i =0; i<floorsize; i++) {
			
			System.out.println("Day:" + (i+1));
			int x=array[i];
			
			if(days == x) {				
				System.out.print(x + " ");
				days--;
				
				while(!pqueue.isEmpty() && days == pqueue.peek()) {
					System.out.print(pqueue.poll()+ " ");
					days--;		
				}			
			} else {			
				pqueue.add(x);
				System.out.println("--");			
			}			
			System.out.println();
		}	
	}
}
