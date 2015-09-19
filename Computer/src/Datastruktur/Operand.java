package Datastruktur;

public interface Operand {

	public String string();
	public Word mult(Word wrd, Memory memory);
	public Word add(Word wrd, Memory memory);
	public Word getWord(Memory memory);
	public String print(Memory memory);
	public boolean equals(Operand other, Memory memory);
}
