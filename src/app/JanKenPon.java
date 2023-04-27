package app;

public class JanKenPon {

	private byte jogada;

	public byte getJogada() {
		return jogada;
	}

	public JanKenPon(byte jogada) {
		this.jogada = jogada;

	}

	@Override
	public String toString() {
		switch (this.jogada) {
		case 1:
			return "Pedra";
		case 2:
			return "Papel";
		default:
			return "Tesoura";
		}
	}
}