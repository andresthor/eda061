package Datastruktur;

import java.util.ArrayList;

public abstract class Memory {
	protected ArrayList<Word> words;
	
	public abstract void set(Word wrd, int index);
	public abstract Word getWord(int index);
}
