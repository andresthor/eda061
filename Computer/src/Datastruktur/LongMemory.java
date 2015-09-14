package Datastruktur;

public class LongMemory extends Memory {

	public LongMemory(int size) {
		
	}
	
	public int checkFreeSpace() {
		return 0;
	}
	
	public LongWord getWord(Address adr) {
		return new LongWord();
	}
}
