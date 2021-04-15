package com.cameron.algos;

public class AlgosController {
	public static void main(String[] args) {
		Algo algorithm = new Algo();
		int[] myArr = {2,-3,5,7,9,-4};
		//int index = 2;
		//int value = 10;
		//double[] myArr1 = {1,3,5,7,20};
		//algorithm.printNums();
		//algorithm.printOdds();
		//System.out.println(algorithm.sumOdds());
		//algorithm.printValues(myArr);
		//System.out.println(algorithm.findMax(myArr));
		//System.out.println(algorithm.findAvg(myArr1));
		//System.out.println(algorithm.allOdds());
		//System.out.println(algorithm.greaterThan(myList, 10));
		//System.out.println(algorithm.squareValues(myArr));
		//System.out.println(algorithm.elimNegative(myArr));
		//algorithm.maxMinAvg(myArr1);
		//System.out.println(algorithm.getShwifty(myArr));
		//System.out.println(algorithm.randomArray());
		//System.out.println(algorithm.swapperoo(myArr));
		//System.out.println(algorithm.reverse(myArr));
		//System.out.println(algorithm.insert(myArr, index, value));
		System.out.println(algorithm.removeNegatives(myArr));
	}

}
