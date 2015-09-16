package Datastruktur;

import java.util.*;


/*
LongMemory
--
- words: ArrayList<LongWord>
--
+ LongMemory(int) 
/int=längd av listan
+ checkFreeSpace()
+ getWord(Adress):

*/

public class LongMemory extends Memory {

	private ArrayList<LongWord> words;
	public LongMemory(int size) {
	 words = new ArrayList<Longword>(size);	
	}
	
	public int checkFreeSpace() {
		return 0;
	}
	
	public LongWord getWord(Address adr) {
		return new LongWord(new Long("1"));
	}
}
