package com.pradip.learn.java.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Pradip
 *
 */
public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {
		// Remove the duplicates from the list.

		List<Integer> integers = Arrays.asList(0, 1, 2, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 10);

		/**
		 * Imperative Style:-
		 */
		List<Integer> uniqueIntegerList = new ArrayList<>();
		for (Integer integer : integers) {
			if (!uniqueIntegerList.contains(integer)) {
				uniqueIntegerList.add(integer);
			}
		}

		System.out.println("Imperative Unique IntegerList :- " + uniqueIntegerList);

		/**
		 * Declarative Style:-
		 */

		List<Integer> uniqueIntegerList1 = integers.stream().distinct().collect(Collectors.toList());

		System.out.println("Declarative Unique IntegerList :- " + uniqueIntegerList1);
	}
}
