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

	//Methods for instructions implemented in LongWord since other classes
	//can't know data type.

	public Word mul(Word wrd, Memory memory) {
		value *= ((LongWord) wrd).value();
		return this;
		//return new LongWord(this.value * ((LongWord) wrd).value());
	}

	public Word add(Word wrd, Memory memory) {
		value += ((LongWord) wrd).value();
		return this;
		//return new LongWord(this.value + ((LongWord) wrd).value());
	}	

	public boolean equals(Operand other, Memory memory) {
		LongWord wrd = (LongWord) other.getWord(memory);
		return this.value == ((LongWord) wrd).value();
	}


	public long value() {
		return value;
	}

	public void setValue(Word wrd) {
		this.value = ((LongWord) wrd).value();
	}
	
	public String print(Memory memory) {
		return Long.toString(value);
	}
}
