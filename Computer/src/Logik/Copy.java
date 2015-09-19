package Logik;

import Datastruktur.AddressInterface;
import Datastruktur.*;

public class Copy implements Instruction{
	private Word in1;
	private AddressInterface in2;
	
	public Copy(Word in1, AddressInterface in2) {
		this.in1 = in1;
		this.in2 = in2;
	}
	
	public long value() {
		return 0;
	}
	
	public String string() {
		return "CPY " + in1.string() + " " + in2.string();
	}
	
	public int execute(int lastInstruction, Memory memory) {
		System.out.println("copy kallat");
		in2.setWord(in1, memory);
		return ++lastInstruction;
	}
}
