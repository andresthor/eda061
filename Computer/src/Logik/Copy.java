package Logik;

import Datastruktur.Address;
import Datastruktur.Word;
import Datastruktur.Memory;

public class Copy implements Instruction{
	private Word in1;
	private Address addr;
	
	public Copy(Word in1, Address addr) {
		this.in1 = in1;
		this.addr = addr;
	}
	
	public long value() {
		return 0;
	}
	
	public String toString() {
		return "CPY " + in1 + " " + addr;
	}
	
	public int execute(int lastInstruction, Memory memory) {
		addr.setWord(in1, memory);
		return ++lastInstruction;
	}
}
