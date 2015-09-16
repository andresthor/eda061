package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.Operand;

public class Copy implements Instruction{
	private Operand in1;
	private AddressInterface in2;
	
	public Copy(Operand in1, AddressInterface in2) {
		this.in1 = in1;
		this.in2 = in2;
	}
	
	public long value() {
		return 0;
	}
	
	public String string() {
		return "CPY " + in1.string() + " " + in2.string();
	}
	
	public void execute() {
		
	}
}
