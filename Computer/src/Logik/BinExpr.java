package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;
import Datastruktur.Memory;

public abstract class BinExpr implements Instruction{
	protected Operand in1, in2;
	protected Address addr;
	
	public BinExpr(Operand in1, Operand in2, Address addr) {
		this.in1 = in1;
		this.in2 = in2;
		this.addr = addr;
	}
	
	public abstract int execute(int lastInstruction, Memory memory);

	public String toString(){
		return " " + in1 + " " + in2 + " " + addr;
	}
	
}
