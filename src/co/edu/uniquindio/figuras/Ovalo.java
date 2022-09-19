package co.edu.uniquindio.figuras;

public class Ovalo extends Figura
{  
	/**
	 * 	variable que represanta el atributo radioMayor de la clase Ovalo 
	 */
	protected double radioMayor; 
	
	/**
	 * variable que represanta el atributo radioMenor de la clase Ovalo
	 */
	protected double radioMenor;
    
	/**
	 * Constructor de la clase Ovalo
	 */
	public Ovalo()
	{}
	
	/**
	 * Constructor de la clase Ovalo
	 * @param: radioMayor parametro que indica el radioMayor de la clase Ovalo
	 */
	public Ovalo( double radioMayor )
	{
		this.radioMayor = radioMayor;
	}
	
	/**
	 * Constructor de la clase Ovalo
	 * @param: radioMayor parametro que indica el radioMayor de la clase Ovalo
	 * @param: radioMenor parametro que indica el radioMenor de la clase Ovalo
	 */
	public Ovalo ( double radioMayor,
			       double radioMenor )
	{
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}
    
	/**
	 * Metodo que obtiene el radioMayor de la clase Ovalo
	 * @return: retorna el radioMayor de la clase Ovalo
	 */
	public double getRadioMayor() 
	{
		return radioMayor;
	}
    
	/**
	 * Metodo que permite asignar un valor al atributo radioMayor
	 * @param radioMayor valor a ser asignado al atributo radioMayor
	 */
	public void setRadioMayor(int radioMayor) 
	{
		this.radioMayor = radioMayor;
	}
    
	/**
	 * Metodo que obtiene el radioMenor de la clase Ovalo
	 * @return retorna el radioMenor de la clase Ovalo
	 */
	public double getRadioMenor() 
	{
		return radioMenor;
	}
    /**
     * Metodo que permite asignar un valor al atributo radioMenor
     * @param radioMenor valor a ser asignado al atributo radioMenor
     */
	public void setRadioMenor(int radioMenor) 
	{
		this.radioMenor = radioMenor;
	}
    /**
     * Metodo que permite calcular el área de la clase Ovalo
     */
	@Override
	public double calcularArea()
	{
		double area = ( 3.141592654 * radioMayor * radioMenor );
		return area;
	}
    /**
     * Metodo que permite calcular el perimetro de la clase Ovalo
     */
	@Override
	public double calcularPerimetro() 
	{
		double perimetro = 3.141592654 * ( radioMayor + radioMenor ) / 2;
		return perimetro;
	}

	
}