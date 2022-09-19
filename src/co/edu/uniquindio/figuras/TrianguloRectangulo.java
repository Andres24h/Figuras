package co.edu.uniquindio.figuras;

public class TrianguloRectangulo extends Rectangulo 
{
	
	/**
	 * contructor de la clase TrianguloRectangulo
	 */
	public TrianguloRectangulo()
	{}
	
    /**
     * contructor de la clase TrianguloRectangulo
     * @param altura parametro que indica la altura de la clase TrianguloRectangulo
     * @param base parametro que indica la base de la clase TrianguloRectangulo
     */
	public TrianguloRectangulo( double altura,          		
			                    double base )            
	{
		super();
		this.altura   = altura;
		this.base     = base;
	}
	
	/**
	 * Metodo que permite calcular el área de la clase TrianguloRectangulo
	 */
	@Override
	public double calcularArea()
	{
		double area = ( altura * base ) / 2;
		return area;
	}
	
	/**
	 * Metodo que permite calcular el perimetro de la clase TrianguloRectangulo	
	 */
	@Override
	public double calcularPerimetro()
	{
		double  hipotenusa = Math.sqrt( ( Math.pow( altura, 2 ) ) + ( Math.pow( base, 2 ) ) );
		double cateto  = ( hipotenusa + altura + base );
		return cateto; 
		
	}
}
