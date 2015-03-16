package Classes;
import java.awt.*;

public class Circulo extends Ponto {
	
	private int raio;
	
	public Circulo(int xCentro, int yCentro, int novoRaio, Color novaCor)
	{
		super(xCentro, yCentro, novaCor);  // construtor de Ponto(x,y)
		setRaio(novoRaio);
	}

	public void setRaio(int novoRaio) {
		raio = novoRaio;
	}
	
	@Override
	public void desenhar(Color corDesenho, Graphics g) {
		g.setColor(corDesenho);
		g.drawOval(getX()-raio, getY()-raio,  	// centro - raio
				   2*raio,2*raio);  		// centro + raio
	}

}
