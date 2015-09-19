package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;
import Datastruktur.Memory;

public abstract class BinExpr implements Instruction{
	protected Operand in1, in2;
	protected AddressInterface addr;
	
	public BinExpr(Operand in1, Operand in2, AddressInterface addr) {
		this.in1 = in1;
		this.in2 = in2;
		this.addr = addr;
	}
	
	public abstract int execute(int lastInstruction, Memory memory);

	public String string(){
		return " " + in1.string() + " " + in2.string() + " " + addr.string();
	}
	
}
