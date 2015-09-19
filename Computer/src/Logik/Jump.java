package Logik;

import Datastruktur.Memory;

public class Jump implements Instruction{
	protected int instruction;
	
	public Jump(int instruction) {
		this.instruction = instruction;
	}
	
	public int execute(int lastInstruction, Memory memory) {
		System.out.println("Jump kallat");
		return instruction;
	}

	public String string(){
		return "JMP " + instruction;
	}
}
