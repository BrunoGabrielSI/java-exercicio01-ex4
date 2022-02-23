package br.fai.ex4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main app = new Main();
		app.start();

	}

	private void start() {
		iterarUsandoWhile();
		iterarUsandoDoWhile();
		iterarUsandoFor();
	}

	private void iterarUsandoFor() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 20; j++) {
			System.out.println("j: " + j);
		}
	}

	private void iterarUsandoDoWhile() {
		// TODO Auto-generated method stub
		int k = 0;
		do {
			System.out.println("k: " + k);
			k += 1;
		} while (k < 20);
		System.out.println("---------------");
	}

	private void iterarUsandoWhile() {
		int i = 0;

		while (i < 20) {
			System.out.println("i: " + 1);
			i += 1;
		}
		

	}

}
