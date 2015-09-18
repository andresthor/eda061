package Datastruktur;



public class Address implements AddressInterface{

	private int index;
	private static Memory memory;

	public Address(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}

	public void setWord(Word wrd) {
		memory.set(wrd, index);
	}

	
	public String string() {
		return "[" + index + "]";
	}

	public static void setMemory(Memory mem){
		memory = mem;
	}

	public String print() {
		return getWord().print();
	}

	public Word mult(Word wrd) {
		return getWord().mult(wrd);
	}

	public Word add(Word wrd) {
		return getWord().add(wrd);
	}

	public Word getWord() {
		return memory.getWord(index);
	}
}
