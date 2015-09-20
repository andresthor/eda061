package Logik;

import Datastruktur.Operand;
import Datastruktur.Memory;

public class JumpEq extends Jump{
	Operand in1, in2;

	public JumpEq(int instruction, Operand in1, Operand in2) {
	super(instruction);	
	this.in1 = in1;
	this.in2 = in2;
	}

	public int execute(int lastInstruction, Memory memory) {
		if (in1.equals(in2, memory)) {
			return super.instruction;
		} else {
			return ++lastInstruction;
		}
	}

	public String toString(){
	return "JEQ " + super.instruction + " " + in1 + " " + in2;
	}
}
