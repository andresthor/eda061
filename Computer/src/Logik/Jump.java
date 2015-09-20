package Logik;

import Datastruktur.Memory;

public class Jump implements Instruction{
	protected int instruction;
	
	public Jump(int instruction) {
		this.instruction = instruction;
	}
	
	public int execute(int lastInstruction, Memory memory) {
		return instruction;
	}

	public String toString(){
		return "JMP " + instruction;
	}
}
