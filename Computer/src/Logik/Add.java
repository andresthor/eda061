package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public class Add extends BinExpr{
	
	public Add(Operand in1, Operand in2, AddressInterface addr) {
		super(in1, in2);
	}
	
	public String op() {
		return "";
	}
	
	public void execute() {
		
	}
}
