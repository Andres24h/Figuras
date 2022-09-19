package co.edu.uniquindio.figuras;

public class Rectangulo extends Poligono 
{
	/**
	 * variable que represanta el atributo altura de la clase Rectangulo
	 */
	protected double altura;
	/**
	 * variable que represanta el atributo base de la clase Rectangulo
	 */
	protected double base;
    
	/**
	 * contructor de la clase Rectangulo
	 */
	public Rectangulo() 
	{}
	
    /**
     * contructor de la clase Rectangulo
     * @param altura parametro que indica la altura de la clase Rectangulo
     */
	public Rectangulo ( double altura )
	{
		this.altura = altura;
	}
    
	/**
	 * contructor de la clase Rectangulo
	 * @param altura parametro que indica la altura de la clase Rectangulo
	 * @param base parametro que indica la base de la clase Rectangulo
	 */
	public Rectangulo( double altura, 
			           double base )
	{
		super(  );                            //super( 4? );
		this.altura = altura;
		this.base   = base;
	}
	 
	/**
	 * Metodo que permite calcular el área de la clase Rectangulo
	 */
	@Override 
	public double calcularArea()
	{
		double area = altura * base;
		return area;
	}
	
	/**
	 * Metodo que permite calcular el perimetro de la clase Rectangulo
	 */
	@Override
	public double calcularPerimetro()
	{
		double perimetro = ( base * 2 ) + ( altura * 2 );
		return perimetro;
	}
}
