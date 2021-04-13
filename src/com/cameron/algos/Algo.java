package com.cameron.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

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
	public void printValues( int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	} 
	//Find Max
	public int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	//Find Avgerage
	public double findAvg(double[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / arr.length;
		return avg;
	}
	//List With Odd Numbers
	public ArrayList<Integer> allOdds(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i <= 255; i+=2) {
			arr.add(i);
		}
		return arr;
	}
	//Greater Than Y
	public int greaterThan(int[] arr, int y) {
		int sum = 0;
		for(int i : arr) {
			if(i > y) {
				sum += 1;
			}
		}
		return sum;
	}
	//Square the Values
	public String squareValues(int[] arr) {
		for( int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}
		return Arrays.toString(arr);
	}
	//Eliminate Negative Numbers
	public String elimNegative(int[] arr) {
		for( int i = 0; i < arr.length; i++) {
			if( arr[i] < 0) {
				arr[i] = 0;
			}
		}
		return Arrays.toString(arr);
	}
	//Max, Min, and Average
	public void maxMinAvg(double[] arr) {
		double max = arr[0];
		double min = arr[0];
		double sum = 0;
		for( double i : arr) {
			if(i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
			sum += i;
		}
		double avg = sum / arr.length;
		System.out.println("Max: "+max+" Min: "+min+" Avg: "+avg);
	}
	//Shifting the values in the array
	public String getShwifty(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			int temp = arr[i];
			@SuppressWarnings("unused")
			int next = arr[i+1];
			arr[i] = arr[i+1];
			next = temp;
		}
		arr[arr.length-1] = 0;
		return Arrays.toString(arr);
	}
	//Random Array
	public ArrayList<Integer> randomArray(){
		ArrayList<Integer> bounds = new ArrayList<Integer>();
		for(int i = 1; i <= 100; i++){
			bounds.add(i);
        }
        Random random = new Random();
        ArrayList<Integer> randomTen = new ArrayList<Integer>();
        for( int i = 0; i < 10; i++){
            int randomNum = random.nextInt(90);
            randomTen.add(bounds.get(randomNum));
        }
        return randomTen;
    } 
	//Swapping two values
	public String swapperoo(int[] input) {
		int first = input[0];
		int last = input[input.length-1];
		input[0] = last;
		input[input.length-1] = first;
		return Arrays.toString(input);
	}
}















