package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public class Mul extends BinExpr{
	
	public Mul(Operand in1, Operand in2, AddressInterface addr) {
		super(in1, in2, addr);
	}
	
	public String op() {
		return "";
	}
	
	public void execute() {
	}

	public String string(){
		return "MUL" + super.string();
	}
}
