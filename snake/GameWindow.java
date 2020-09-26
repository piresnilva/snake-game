package snake;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GameWindow extends JFrame {
	
	private Rect rect;
	 
	public GameWindow();
	 rect = new Rect();
	 rect.setX(100);
	 rect.setY(100);
	 rect.setWidth(200);
	 rect.setHeight(200);
	 
	

	public GameWindow() {
		// definindo o tamanho da janela setSize(500, 500);
		// janela fixa setResizable(false);
		// titulo setTitle("Snake Game!");
		// encerrar a janela clicando no x setDefaultCloseOperation(EXIT_ON_CLOSE);
		// centralizar a janela setLocationRelativeTo(null);
		// para visualizar a janela do jogo setVisible(true);
	}
	
	 @override
	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(200, 200, 250, 100);
		}
}


