package src;



public class BolaHilo implements Runnable {

	private Board board;
	private Ball bola;

	public BolaHilo(Board board, Ball bola) {
		// TODO Auto-generated constructor stub
		this.board = board;
		this.bola = bola;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Mientras el hilo no se interrumpe y la bola tiene mayor velocidad de 0 se ejecuta.
		while (!Thread.currentThread().isInterrupted() && bola.getV() > 0.0) { 

			try {
				bola.move();
				board.repaint();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
	
}