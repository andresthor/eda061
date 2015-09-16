package Datastruktur;

public class Address implements AddressInterface{

	private int place;
	private static Memory memory;

	public Address(int adr) {
		
	}
	
	public int getIndex() {
		return 0;
	}

	public void setWord() {
	}
	
	public String string() {
		return "";
	}

	public long value() {
		return 0;
	}

	public void setMemory(Memory memory){
		this.memory = memory;
	}
}
