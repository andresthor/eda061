package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;

public abstract class BinExpr implements Instruction{
	private Operand in1, in2;
	private Address resPos;
	
	public BinExpr(Operand in1, Operand in2) {
		this.in1 = in1;
		this.in2 = in2;
	}
	
	public abstract String op();
	
	public void execute() {
		
	}
	
}
