package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public abstract class BinExpr implements Instruction{
	private Operand in1, in2;
	private AddressInterface addr;
	
	public BinExpr(Operand in1, Operand in2, AddressInterface addr) {
		this.in1 = in1;
		this.in2 = in2;
		this.addr = addr;
	}
	
	public abstract String op();
	
	public void execute() {
	}

	public String string(){
		return " " + in1.string() + " " + in2.string() + " " + addr.string();
	}
	
}
