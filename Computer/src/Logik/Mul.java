package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public class Mul extends BinExpr{
	
	public Mul(Operand in1, Operand in2, AddressInterface addr1) {
		super(in1, in2);
	}
	
	public String op() {
		return "";
	}
	
	public void execute() {
	}

	public String string(){
		return "";
	}
}
