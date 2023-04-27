package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		byte escolha;

		do {
			System.out.println("1 - Jogar");
			System.out.println("0 - Sair");
			escolha = ler.nextByte();

			switch (escolha) {

			case 1:

				System.out.println("ESCOLHA SUA JOGADA");
				System.out.println("(1) Pedra");
				System.out.println("(2) Papel");
				System.out.println("(3) Tesoura");
				byte jogadaUsuario = ler.nextByte();
			
				
				Jogo j1 = new Jogo(jogadaUsuario);
				System.out.println(j1);
				System.out.println("Resultado: "+ j1.verificarVencedor());
				break;
				
			case 0:
				System.out.println("JOGO ENCERRADO");
			}
		} while (escolha != 0);

		ler.close();
	}

}
