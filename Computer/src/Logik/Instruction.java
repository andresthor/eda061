package Logik;

import Datastruktur.Memory;

public interface Instruction{

public int execute(int lastInstruction, Memory memory);
public String string();

}
