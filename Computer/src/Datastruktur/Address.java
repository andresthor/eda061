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

	public long value() {
		return memory.getWord(index).value();
	}

	public void setMemory(Memory memory){
		this.memory = memory;
	}
}
