package com.test.code.easy;

public class SingleRowKeyboard {

	public int calculateTime(String keyboard, String key) {
		int time = 0;
		char[] keyChar = keyboard.toCharArray();
		char[] keyA = key.toCharArray();

		int previous = 0;
		for (int i = 0; i < keyA.length; i++) {
			int currentPosition = 0;
			for (int j = 0; j < keyChar.length; j++) {
				if (keyA[i] == keyChar[j]) {
					currentPosition = j;
				}
			}

			time = time + Math.abs(previous - currentPosition);
			previous = currentPosition;
		}

		return time;
	}

}
