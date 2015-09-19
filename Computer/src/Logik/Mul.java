package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;
import Datastruktur.Memory;

public class Mul extends BinExpr{
	
	public Mul(Operand in1, Operand in2, AddressInterface addr) {
		super(in1, in2, addr);
	}
	
	public int execute(int lastInstruction, Memory memory) {
		addr.setWord(in1.getWord(memory).mult(in2.getWord(memory), memory), memory);
		return ++lastInstruction;
	}

	public String string(){
		return "MUL" + super.string();
	}
}
