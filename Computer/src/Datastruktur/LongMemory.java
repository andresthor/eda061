package Datastruktur;

import java.util.ArrayList;


public class LongMemory extends Memory {

	private ArrayList<LongWord> words;
	private int capacity;

	public LongMemory(int capacity) {
		this.capacity = capacity;
	 	words = new ArrayList<LongWord>(capacity);

	}

	public void set(Word wrd, int index) {
		if (words.size() <= index) {
			words.add(index, (LongWord) wrd);
		} else {
			words.get(index).setValue(wrd);
		}
	}

	public Word getWord(int index) {
		return words.get(index);
	}
}