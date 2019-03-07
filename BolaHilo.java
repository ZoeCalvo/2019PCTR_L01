import practica2.Ball;
import practica2.Billiards;
import practica2.Board;

public class BallThread implements Runnable {

	private Board board;
	private Ball ball;

	public BallThread(Board board, Ball ball) {
		// TODO Auto-generated constructor stub
		this.board = board;
		this.ball = ball;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Mientras el hilo no se interrumpe y la bola tienemayor velocidad de 0 se ejecuta.
		while (!Thread.currentThread().isInterrupted() && ball.getV() > 0.0) { 

			try {
				ball.move();
				board.paint();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}
	}
	
}