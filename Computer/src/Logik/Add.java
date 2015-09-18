package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public class Add extends BinExpr{
	
	public Add(Operand in1, Operand in2, AddressInterface addr) {
		super(in1, in2, addr);
	}
	
	public void execute() {
		addr.setWord(in1.getWord().add(in2.getWord()));
	}

	public String string(){
		return "ADD" + super.string();
	}
}
