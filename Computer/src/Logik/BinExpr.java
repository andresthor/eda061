package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public abstract class BinExpr implements Instruction{
	private Operand in1, in2;
	private AddressInterface resPos;
	
	public BinExpr(Operand in1, Operand in2) {
		this.in1 = in1;
		this.in2 = in2;
	}
	
	public abstract String op();
	
	public void execute() {
	}

	public String string(){
		return "";
	}
	
}
