package com.pradip.learn.java.lambdas;

import java.util.Comparator;

/**
 * @author Pradip
 *
 */
public class ComparatorLambdaExample {

	public static void main(String[] args) {

		/**
		 * Prior java 8
		 */

		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//0 o1=o2
				//1 o1>o2
				//-1 01<o2
				return o1.compareTo(o2);
			}
		};

		System.out.println("Comparison result of two integer using legacy way is :" + comparator.compare(11, 12));

		/**
		 * java 8 lambda:
		 *  ()->{}
		 */

		// 1
		Comparator<Integer> lambdaComparator = (Integer a, Integer b) -> {
			return a.compareTo(b);
		};

		System.out.println("Comparison result of two integer using lambda way is :" + lambdaComparator.compare(11, 10));

		// 2
		Comparator<Integer> lambdaComparator2 = (a, b) -> a.compareTo(b);

		System.out.println("Comparison result of two integer using lambda way is :" + lambdaComparator2.compare(11, 10));

	}
}
