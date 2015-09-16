package Datastruktur;

import java.util.*;


public class LongMemory extends Memory {

	//private ArrayList<Word> words;
	private int size;

	public LongMemory(int size) {
		this.size = size;
	 	super.words = new ArrayList<Word>(size);
	}

	public void set(Word wrd, int index) {
			super.words.set(index, wrd);
		
	}

	public Word getWord(int index) {
		return super.words.get(index);
	}
}
