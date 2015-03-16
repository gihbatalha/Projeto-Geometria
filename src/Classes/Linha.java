package Classes;
import java.awt.*;

public class Linha extends Ponto{
	
	private Ponto pontoFinal;
	
	public Linha(int x1, int y1, int x2, int y2, Color novaCor)
	{
	  super(x1,y1, novaCor);
	  pontoFinal = new Ponto(x2,y2, novaCor);
	}
	
	public void desenhar(Color corDesenho, Graphics g)
	{
		g.setColor(corDesenho);
		g.drawLine(super.getX(),super.getY(),   // ponto inicial
				   pontoFinal.getX(), pontoFinal.getY());
	}

}
