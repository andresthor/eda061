package Logik;

import Datastruktur.Memory;

public class Halt implements Instruction{
	
	public Halt() {
		
	}
	
	public int execute(int lastInstruction, Memory memory) {
		return -1;
	}

	public String string(){
		return "HLT";
	}
}
