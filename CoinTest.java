import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class CoinTest extends JPanel implements ActionListener{
	private Coin coin;
	public CoinTest(){
		Image heads = new ImageIcon("Penny_Heads.jpeg").getImage();
		Image tails = new ImageIcon("Penny_Tails.jpeg").getImage();
		coin = new Coin(heads,tails);
		Timer clock = new Timer(500,this);
		clock.start();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int x = getWidth()/2;
		int y = getHeight()/2;
		coin.draw(g,x-100,y-100);
	}
	public void actionPerformed(ActionEvent e){
		coin.flip();
		repaint();
	}
	public static void main (String [] args){
		JFrame display = new JFrame();
		display.setSize(300,300);
		display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CoinTest panel = new CoinTest();
		panel.setBackground(Color.WHITE);
		Container c =display.getContentPane();
		c.add(panel);
		display.setVisible(true);
	}
}
