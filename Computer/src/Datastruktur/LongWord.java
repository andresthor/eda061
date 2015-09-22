package Datastruktur;


public class LongWord implements Word{
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}
	
	public String toString() {
		return Long.toString(value);
	}

	public Word getWord(Memory memory) {
		return this;
	}


	public Word mult(Word wrd, Memory memory) {
		return new LongWord(this.value * ((LongWord) wrd).value());
	}

	public Word add(Word wrd, Memory memory) {
		return new LongWord(this.value + ((LongWord) wrd).value());
	}	

	public boolean equals(Operand other, Memory memory) {
		LongWord wrd = (LongWord) other;
		return this.value == ((LongWord) wrd).value();
	}


	public long value() {
		return value;
	}
	
	public String print(Memory memory) {
		return Long.toString(value);
	}
}
