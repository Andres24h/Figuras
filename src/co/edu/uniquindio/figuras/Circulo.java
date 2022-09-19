package co.edu.uniquindio.figuras;

public class Circulo extends Ovalo 
{   
	/**
	 * Constructor de la clase circulo
	 */
	public Circulo() 
	{}
    
	/**
	 * Constructor de la clase circulo
	 * @param radioMayor parametro que indica el radio mayor de la clase circulo 
	 */
	public Circulo( double radioMayor )
	{
		super( radioMayor );
		this.radioMayor = radioMayor;
	}
    /**
     * Metodo que permite calcular el área de la clase circulo
     */
	public double calcularArea() 
	{
		return ( 3.141592654 * ( Math.pow(radioMayor, 2 ) ) );
	}
	/**
	 * Metodo que permite calcular el perimetro de la circulo
	 */
	@Override
	public double calcularPerimetro()
	{
		double perimetro = ( 2 * 3.141592654 * radioMayor );
		return perimetro;
	}
}
