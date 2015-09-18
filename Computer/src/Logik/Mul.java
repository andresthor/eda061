package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public class Mul extends BinExpr{
	
	public Mul(Operand in1, Operand in2, AddressInterface addr) {
		super(in1, in2, addr);
	}
	
	public void execute() {
		addr.setWord(in1.getWord().mult(in2.getWord()));
	}

	public String string(){
		return "MUL" + super.string();
	}
}
