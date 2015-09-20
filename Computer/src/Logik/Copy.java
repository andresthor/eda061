package Logik;

import Datastruktur.Address;
import Datastruktur.Word;
import Datastruktur.Memory;

public class Copy implements Instruction{
	private Word in1;
	private Address in2;
	
	public Copy(Word in1, Address in2) {
		this.in1 = in1;
		this.in2 = in2;
	}
	
	public long value() {
		return 0;
	}
	
	public String toString() {
		return "CPY " + in1 + " " + in2;
	}
	
	public int execute(int lastInstruction, Memory memory) {
		in2.setWord(in1, memory);
		return ++lastInstruction;
	}
}
