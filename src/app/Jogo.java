package app;

public class Jogo {

	private JanKenPon usuario;
	private JanKenPon computador;

	public Jogo(byte jogadaUsuario) {
		/* Definir jogada do usuário */
		this.usuario = new JanKenPon(jogadaUsuario);

		/* Sortear e definir a jogada do computador */
		byte sorteio = (byte) (Math.random() * 3 + 1);

		this.computador = new JanKenPon(sorteio);
	}

	public String verificarVencedor() {
		byte usu = this.usuario.getJogada();
		byte comp = this.computador.getJogada();

		if (usu == comp) {
			return "Empate!";
		} else if (usu == 1 && comp == 3 || usu == 2 && comp == 1 || usu == 3 && comp == 2) {
			return "Usuário vence!";
		} else {
			return "Computador vence!";
		}
	}

	@Override
	public String toString() {
		return "Usuário jogou " + this.usuario + "\nComputador jogou " + this.computador;
	}
}