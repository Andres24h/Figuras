package co.edu.uniquindio.figuras;

public class Cuadrado extends Rectangulo
{
    /**
     * Constructor de la clase Cuadrado
     */
	public Cuadrado()
	{}                                      			
    
	/**
	 * Constructor de la clase Cuadrado
	 * @param altura parametro que indica la altura de la clase Cuadrado
	 */
	public Cuadrado( double altura )
	{                                                             
		super( altura );
		this.altura   = altura;
	}
    /**
     * Metodo que permite calcular el area de la clase Cuadrado
     */
	@Override
	public double calcularArea() 
	{
		double area = ( Math.pow( altura, 2 ) );
		return area;
	}
    /**
     * Metodo que permite clacular el perimetro de la clase Cuadrado
     */
	@Override
	public double calcularPerimetro() 
	{
		double perimetro = ( altura * 4 );
		return perimetro;
	}
}


