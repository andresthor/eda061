package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;
import Datastruktur.Memory;

public class Mul extends BinExpr{
	
	public Mul(Operand in1, Operand in2, Address addr) {
		super(in1, in2, addr);
	}
	
	public int execute(int lastInstruction, Memory memory) {
		addr.setWord(in1.getWord(memory).mul(in2.getWord(memory), memory), memory);
		return ++lastInstruction;
	}

	public String toString(){
		return "MUL" + super.toString();
	}
}
