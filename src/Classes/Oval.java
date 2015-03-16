package Classes;
import java.awt.*;
public class Oval extends Ponto {

	private int raioA, raioB;

	 @Override
	public void desenhar(Color corDesenho, Graphics g) {
		g.setColor(corDesenho);
		g.drawOval(getX()-raioA, getY()-raioB,  // centro - raio
				   2*raioA,2*raioB);  // centro + raio
			
	}
	
	 /* Erro no "super()" ->  A classe ponto não tem construtor sem parâmetros
	  
	public Oval()
	{
		super();
		setRaioA(0);
		setRaioB(0);
		setCor(Color.black);
	} */
	
	public void setRaioA(int novoRaio) {
		raioA = novoRaio;
	}
	
	public void setRaioB(int novoRaio) {
		raioB = novoRaio;
	}
	
	public Oval(int xCentro, int yCentro, int novoRaioA, 
			     int novoRaioB, Color novaCor)
	{
		super(xCentro, yCentro, novaCor);  // construtor de Ponto(x,y)
		setRaioA(novoRaioA);
		setRaioB(novoRaioB);		
	}
}
