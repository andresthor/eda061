package Datastruktur;

import Logik.Program;

public class Computer {
	private Memory memory;
	private Program prg;

	public Computer(Memory memory) {
		this.memory = memory;
	}

	public void load(Program prg) {
		this.prg = prg;
		Address.setMemory(memory);
	}
	
	public void run() {
		prg.run();
	}

}
