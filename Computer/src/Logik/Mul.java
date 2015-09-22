package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;
import Datastruktur.Memory;
import Datastruktur.Word;

public class Mul extends BinExpr{
	
	public Mul(Operand in1, Operand in2, Address addr) {
		super(in1, in2, addr);
	}
	
	public int execute(int lastInstruction, Memory memory) {
		Word muller = in1.getWord(memory);
		Word mullable = in2.getWord(memory);
		Word prod = muller.mul(mullable, memory);

		addr.setWord(prod, memory);
		return ++lastInstruction;
	}

	public String toString(){
		return "MUL" + super.toString();
	}
}
