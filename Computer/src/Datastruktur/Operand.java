package Datastruktur;

public interface Operand {

	public String toString();
	public Word getWord(Memory memory);
	public String print(Memory memory);
	public boolean equals(Operand other, Memory memory);
}
