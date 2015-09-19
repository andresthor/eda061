package Datastruktur;

import Logik.Program;

public class Computer {
	private Memory memory;
	private Program prg;
	private int prgCounter;

	public Computer(Memory memory) {
		this.memory = memory;
	}

	public void load(Program prg) {
		this.prg = prg;
		prgCounter = 0;
	}
	
	public void run() {
		while (true) {
			prgCounter = prg.get(prgCounter).execute(prgCounter, memory);
			if (prgCounter == -1) {
			break;
			}
		}
	}

}
