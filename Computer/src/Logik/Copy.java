package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;

public class Copy implements Instruction{
	private Operand in1;
	private Address in2;
	
	public Copy(Operand in1, Address in2) {
		
	}
	
	public long value() {
		return 0;
	}
	
	public String string() {
		return "";
	}
	
	public void execute() {
		
	}
}
