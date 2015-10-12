package Datastruktur;

public class Address implements Operand{

	private int index;

	public Address(int index) {
		this.index = index;
	}

	public void setWord(Word wrd, Memory memory) {
		memory.set(wrd.getWord(memory), index);
	}

	public String toString() {
		return "[" + index + "]";
	}

	public String print(Memory memory) {
		return getWord(memory).print(memory);
	}

	public Word getWord(Memory memory) {
		return memory.getWord(index);
	}

	/*public boolean equals(Operand other, Memory memory)
	{
		return other.equals(getWord(memory), memory);
	}*/
}
