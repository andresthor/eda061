package Logik;

import Datastruktur.Address;
import Datastruktur.Operand;
import Datastruktur.Word;
import Datastruktur.Memory;

public class Add extends BinExpr{
	
	public Add(Operand in1, Operand in2, Address addr) {
		super(in1, in2, addr);
	}
	
	protected Word op(Word op1, Word op2, Memory memory) {
		return op1.add(op2, memory);
	}

	protected String String() {
		return "ADD";
	}


	// Gamla koden
	/*
	public int execute(int lastInstruction, Memory memory) {
		Word adder = in1.getWord(memory);
		Word addable = in2.getWord(memory);
		Word sum = (Word) adder.add(addable, memory);

		addr.setWord(sum, memory);
		return ++lastInstruction;
	}

	public String toString(){
		return "ADD" + super.toString();
	}
	*/
}
