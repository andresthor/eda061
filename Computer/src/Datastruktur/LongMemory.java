package Datastruktur;

import java.util.ArrayList;


public class LongMemory extends Memory {

	private Vector <LongWord> words;
	private int capacity; // For future use

	public LongMemory(int capacity) {
		this.capacity = capacity;
	 	words = new Vector <LongWord>(capacity);

	}

	public void set(Word wrd, int index) {
		if (words.size() <= index) {
		//Checks if word exists at index
		//Addresses must be initialized in order for ArrayList to work.
			words.add(index, (LongWord) wrd);
		} else {
			words.get(index).setValue(wrd);
		}
	}

	public Word getWord(int index) {
		return words.get(index);
	}
}