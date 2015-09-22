package Datastruktur;

public interface Word extends Operand {

	public String toString();
	public Word add(Word other, Memory memory);
	public boolean equals(Operand other, Memory memory);
}
