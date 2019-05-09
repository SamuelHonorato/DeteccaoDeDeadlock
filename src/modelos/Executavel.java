package modelos;

public class Executavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int VERIFICA_DEADLOCK_EM_SEGUNDOS = 10;
		SistemaOperacional so = new SistemaOperacional(VERIFICA_DEADLOCK_EM_SEGUNDOS);
		
		so.run();

	}

}
