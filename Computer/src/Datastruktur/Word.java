package Datastruktur;

public interface Word extends Operand {

	public void setValue(Word wrd);
	public Word mul(Word wrd, Memory memory);
	public Word add(Word wrd, Memory memory);
}
