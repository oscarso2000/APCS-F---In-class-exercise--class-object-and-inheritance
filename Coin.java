import java.awt.Image;
import java.awt.Graphics;
public class Coin {
	private Image heads;
	private Image tails;
	private int Face=0;
	public Coin (Image ImageHeads, Image ImageTails){
		heads = ImageHeads;
		tails = ImageTails;
	}
	public void flip(){
		if (Face == 0){
			Face = 1; 
		}else {
			Face = 0;
		}
	}
	public void draw (Graphics g, int x, int y){
		if (Face ==0){
			g.drawImage(heads,x,y,null);
		}else{
			g.drawImage(tails,x,y,null);
		}
	}
}
