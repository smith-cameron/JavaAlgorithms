package com.cameron.algos;

import java.util.ArrayList;
import java.util.Arrays;

public class Algo {
	//Print 1 - 255
	public void printNums() {
		for(int i = 1; i <= 255; i++) {
			System.out.println(i);
		}
	}
	//Odds
	public void printOdds() {
		for(int i = 1; i <= 1000; i+=2) {
			System.out.println(i);
		}
	}
	//Sum of Odds
	public int sumOdds() {
		int sum = 0;
		for(int i = 1; i<= 5000; i+=2) {
			sum += i;
		}
		return sum;
	}
	//Iterate through array
	public void printValues( int[] myList) {
		for(int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
	} 
	//Find Max
	public int findMax(int[] myList) {
		int max = myList[0];
		for(int i = 0; i < myList.length; i++) {
			if(myList[i] > max) {
				max = myList[i];
			}
		}
		return max;
	}
	//Find Avgerage
	public double findAvg(double[] myList) {
		double sum = 0;
		for(int i = 0; i < myList.length; i++) {
			sum += myList[i];
		}
		double avg = sum / myList.length;
		return avg;
	}
	//List With Odd Numbers
	public ArrayList<Integer> allOdds(){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 1; i <= 255; i+=2) {
			newList.add(i);
		}
		return newList;
	}
	//Greater Than Y
	public int greaterThan(int[] myList, int y) {
		int sum = 0;
		for(int i : myList) {
			if(i > y) {
				sum += 1;
			}
		}
		return sum;
	}
	//Square the Values
	public String squareValues(int[] myList) {
		for( int i = 0; i < myList.length; i++) {
			myList[i] *= myList[i];
		}
		return Arrays.toString(myList);
	}
	//Eliminate Negative Numbers
	public String elimNegative(int[] myList) {
		for( int i = 0; i < myList.length; i++) {
			if( myList[i] < 0) {
				myList[i] = 0;
			}
		}
		return Arrays.toString(myList);
	}
}















