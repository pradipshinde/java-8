package com.pradip.learn.java.imperativevsdeclarative;

import java.util.stream.IntStream;

/**
 * @author Pradip
 *
 */
public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {
		
		 // sum of integers for the range from 0 to 100

		/**
		 * Imperative Style. (Object oriented programming uses the same style)
		 *  How style of programming
		 */
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			//Shared mutable state, its sequential and it will go step by step
			//It will have issue if we try to run the code in multi threaded environment
			sum += i; 
			
		}

		System.out.println("Sum using Imperative Approach:- " + sum);

		/**
		 * Declarative Style.(Functional programming uses the same style) 
		 * What style of programming
		 * You let the system do the job for you and get the result
		 */

		int sum1 = IntStream.rangeClosed(101, 100)
				//.parallel()
				.sum();

		System.out.println("Sum using Declarative Approach:- " + sum1);

	}
}
