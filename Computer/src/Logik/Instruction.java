package Logik;

import Datastruktur.Memory;

public interface Instruction{

//Command method used to call instructions
public int execute(int lastInstruction, Memory memory);

//Strategy method used to print instructions
public String toString();

}
