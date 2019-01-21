package com.test.code.easy;

import java.util.Arrays;
import java.util.Hashtable;

//x-of-a-kind-in-a-deck-of-cards/

public class XKindDeckOfCards {

	public static void main(String[] args) {

		// int[] cards = {1,2,3,4,4,3,2,1};
		// int[] cards = {1,1,1,1,2,2,2,2,2,2};
		// int[] cards = {1,1,1,2,2,2};
		// int[] cards = {1,1,1,2,2,2,3,3};
		int[] cards = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3 };

		System.out.println(validateCards(cards));

	}

	private static boolean validateCards(int[] deck) {
		boolean result = true;
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

		if (deck.length > 1 && deck.length <= 10000) {
			for (int i = 0; i < deck.length; i++) {
				if (deck[i] >= 0 && deck[i] <= 10000) {
					if (ht.containsKey(deck[i])) {

						int value = ht.get(deck[i]);

						ht.put(deck[i], value + 1);
					} else {

						ht.put(deck[i], 1);
					}
				}
			}

			Iterable<Integer> values = ht.values();

			int[] sArray = new int[ht.size()];

			int i = 0;
			for (int value : values) {
				sArray[i] = value;
				i++;
			}

			Arrays.sort(sArray);
			
			/*
			 * int minValue = sArray[0]; for(int
			 * arraySize=0;arraySize<sArray.length;arraySize++) {
			 * if(minValue!=sArray[arraySize]) { if(minValue % 2 != 0 ||
			 * sArray[arraySize] % 2 != 0 ) { result = false; } } }
			 */
			
			

		} else
			return false;

		return result;

	}

}
