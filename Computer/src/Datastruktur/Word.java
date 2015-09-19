package Datastruktur;

public interface Word extends Operand {

	public String string();
	public Word add(Word other, Memory memory);
	public boolean equals(Operand other, Memory memory);
}
