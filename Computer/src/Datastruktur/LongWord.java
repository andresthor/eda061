package Datastruktur;


public class LongWord implements Word{
	private long value;
	
	public LongWord(long value) {
		this.value = value;
	}
	
	public String string() {
		return Long.toString(value);
	}

	public Word getWord() {
		return this;
	}


	public Word mult(Word wrd) {
		System.out.println("mult kallat");
		if (wrd instanceof LongWord) {
			LongWord longWrd = (LongWord) wrd;
			return new LongWord((longWrd.value() * this.value));

		} else {
			throw new IllegalArgumentException("Wrong word/memory");
		}
	}

	public Word add(Word wrd) {
		System.out.println("add kallat");
		if (wrd instanceof LongWord) {
			LongWord longWrd = (LongWord) wrd;
			return new LongWord((longWrd.value() + this.value));

		} else {
			throw new IllegalArgumentException("Wrong word/memory");
		}
	}	



	public long value() {
		return value;
	}
	
	public String print() {
		return Long.toString(value);
	}
}
