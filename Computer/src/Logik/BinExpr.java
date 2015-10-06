package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;
import Datastruktur.Word;
import Datastruktur.Memory;

public abstract class BinExpr implements Instruction{
	protected Operand in1, in2;
	protected Address addr;
	
	public BinExpr(Operand in1, Operand in2, Address addr) {
		this.in1 = in1;
		this.in2 = in2;
		this.addr = addr;
	}
	
	protected abstract Word op(Word op1, Word op2, Memory memory);

	// Template method used
	public int execute(int lastInstruction, Memory memory) {
		Word op1 = in1.getWord(memory);
		Word op2 = in2.getWord(memory);
		Word result = op(op1, op2, memory);

		addr.setWord(result, memory);
		return ++lastInstruction;
	}

	protected abstract String String();

	public String toString(){
		return String() + " " + in1 + " " + in2 + " " + addr;
	}
	
}
