package co.edu.uniquindio.interfaz;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import co.edu.uniquindio.figuras.Figura;
import co.edu.uniquindio.figuras.Ovalo;
import co.edu.uniquindio.figuras.Rectangulo;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Ventana extends javax.swing.JFrame implements ActionListener
{
	private JButton Ovalo;
	private JButton Circulo;
	private JButton TrainguloRectangulo;
	private JButton promedioAreaRectangulos;
	private JButton promedioPerimetroElipses;
	private JButton perimetroMasPequña;
	private JButton areaMasGrande;
	private JButton salir;
	private JButton Cuadrado;
	private JButton Rectangulo;
	private List < Figura > figuras;


	public Ventana() 
	{	
		super("Figuras                                                                          andres24h" );
		figuras = new ArrayList < Figura > ();
		setPreferredSize(new Dimension(500, 300));
	   	initGUI();
		
	}

	private void initGUI()
	{
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setFont(new java.awt.Font("Arial Black",0,11));
			getContentPane().setBackground(new java.awt.Color(255,128,128));
			{
				Ovalo = new JButton();
				getContentPane().add(Ovalo);
				Ovalo.setText("Ovalo");
				Ovalo.setBounds(12, 33, 103, 23);
				Ovalo.setFont(new java.awt.Font("Comic Sans MS",1,12));
				Ovalo.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt)
					{
						OvaloActionPerformed(evt);
					}
				});
			}
			{
				Circulo = new JButton();
				getContentPane().add(Circulo);
				Circulo.setText("Circulo");
				Circulo.setBounds(12, 80, 103, 23);
				Circulo.setFont(new java.awt.Font("Comic Sans MS",1,12));
				Circulo.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt)
					{
						CirculoActionPerformed(evt);
					}
				});
			}
			{
				Rectangulo = new JButton();
				getContentPane().add(Rectangulo);
				Rectangulo.setText("Rectangulo");
				Rectangulo.setBounds(12, 173, 103, 23);
				Rectangulo.setFont(new java.awt.Font("Comic Sans MS",1,12));
				Rectangulo.addActionListener(new ActionListener()
{
					public void actionPerformed(ActionEvent evt) 
					{
						RectanguloActionPerformed(evt);
					}
				});
			}
			{
				TrainguloRectangulo = new JButton();
				getContentPane().add(TrainguloRectangulo);
				TrainguloRectangulo.setText("Triangulo Rectangulo");
				TrainguloRectangulo.setBounds(12, 220, 162, 23);
				TrainguloRectangulo.setFont(new java.awt.Font("Comic Sans MS",1,12));
				TrainguloRectangulo.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt)
					{
						TrainguloRectanguloActionPerformed(evt);
					}
				});
			}
			{
				Cuadrado = new JButton();
				getContentPane().add(Cuadrado);
				Cuadrado.setText("Cuadrado");
				Cuadrado.setBounds(12, 127, 103, 23);
				Cuadrado.setFont(new java.awt.Font("Comic Sans MS",1,12));
				Cuadrado.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt)
					{
						CuadradoActionPerformed(evt);
					}
				});
			}
			{
				salir = new JButton();
				getContentPane().add(salir);
				salir.setText("Salir");
				salir.setBounds(384, 220, 66, 23);
				salir.setFont(new java.awt.Font("Comic Sans MS",1,12));
				salir.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt)
					{
						salirActionPerformed(evt);
					}
				});
			}
			{
				areaMasGrande = new JButton();
				getContentPane().add(areaMasGrande);
				areaMasGrande.setText("Area figura más grande");
				areaMasGrande.setBounds(213, 33, 207, 23);
				areaMasGrande.setFont(new java.awt.Font("Comic Sans MS",1,12));
				areaMasGrande.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt)
					{
						areaMasGrandeActionPerformed(evt);
					}
				});
			}
			{
				perimetroMasPequña = new JButton();
				getContentPane().add(perimetroMasPequña);
				perimetroMasPequña.setText("Perimetro figura más pequeña");
				perimetroMasPequña.setBounds(213, 80, 207, 23);
				perimetroMasPequña.setFont(new java.awt.Font("Comic Sans MS",1,12));
				perimetroMasPequña.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						perimetroMasPequñaActionPerformed(evt);
					}
				});
			}
			{
				promedioAreaRectangulos = new JButton();
				getContentPane().add(promedioAreaRectangulos);
				promedioAreaRectangulos.setText("Promedio de areás de rectangulos");
				promedioAreaRectangulos.setBounds(213, 127, 237, 23);
				promedioAreaRectangulos.setFont(new java.awt.Font("Comic Sans MS",1,12));
				promedioAreaRectangulos.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						promedioAreaRectangulosActionPerformed(evt);
					}
				});
			}
			{
				promedioPerimetroElipses = new JButton();
				getContentPane().add(promedioPerimetroElipses);
				promedioPerimetroElipses.setText("Promedio de perimetro de ovalos");
				promedioPerimetroElipses.setBounds(213, 173, 237, 23);
				promedioPerimetroElipses.setFont(new java.awt.Font("Comic Sans MS",1,12));
				promedioPerimetroElipses.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt) 
					{
						promedioPerimetroElipsesActionPerformed(evt);
					}
				});
			}
			pack();
			setSize(500, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void OvaloActionPerformed(ActionEvent evt) 
	{
		OvaloVentana ovaloV = new OvaloVentana( this );
		ovaloV.setVisible( true );
		ovaloV.setLocationRelativeTo( null );
	}

		
	/**
	 * @return the figuras
	 */
	public List<Figura> getFiguras() 
	{
		return figuras;
	}

	/**
	 * @param figuras the figuras to set
	 */
	public void setFiguras(List<Figura> figuras) 
	{
		this.figuras = figuras;
	}

	private void CirculoActionPerformed(ActionEvent evt) 
	{
		CirculoVentana circuloV = new CirculoVentana( this );
		circuloV.setVisible( true );
		circuloV.setLocationRelativeTo( null );
	}

	private void RectanguloActionPerformed(ActionEvent evt) 
	{
		RectanguloVentana rectanguloV = new RectanguloVentana( this );
		rectanguloV.setVisible( true );
		rectanguloV.setLocationRelativeTo( null );
	}
	
	private void TrainguloRectanguloActionPerformed(ActionEvent evt) 
	{
		TrianguloRectanguloVentana trianguloRectanguloV = new TrianguloRectanguloVentana( this );
		trianguloRectanguloV.setVisible( true );
		trianguloRectanguloV.setLocationRelativeTo( null );
	}
	
	private void CuadradoActionPerformed(ActionEvent evt)
	{
		CuadradoVentana cuadradoVentanaV = new CuadradoVentana( this );
		cuadradoVentanaV.setVisible( true );
		cuadradoVentanaV.setLocationRelativeTo( null );
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	private void salirActionPerformed(ActionEvent evt) 
	{
		System.exit(0);
	}
	
	public int tamaño()
	{
		return figuras.size();
	}
	
	public double areaMasGrande()
	{
		double area = 0;
		
		for ( Figura x : figuras )
		{
			if( x.calcularArea() > area )
			{
				area = x.calcularArea();
			}
		}
		return area;
	}
	
	private void areaMasGrandeActionPerformed(ActionEvent evt) 
	{
		if( tamaño() == 0 )
		{
			JOptionPane.showMessageDialog( null, "Lista vacia" );
		}else
		{
			JOptionPane.showMessageDialog( null, areaMasGrande() );
		}
	}
	
	public double perimetroMasPequeño()
	{
		double perimetro = 1000;
		
		for ( Figura x : figuras )
		{
			if( x.calcularPerimetro() < perimetro )
			{
				perimetro = x.calcularPerimetro();
			}
		}
			return perimetro;
	}
	
	public double promedioAreaRectangulos()
	{
		int contador    = 0;
		double promedio = 0;
		double suma     = 0;
		
		for ( Figura x : figuras ) 
		{
			if( x instanceof Rectangulo )
			{
				suma = suma + x.calcularArea();
				contador++;
			}
		}
		
		if( contador == 0 )
		{
			JOptionPane.showMessageDialog( null, "No hay rectangulos en la lista" );
		}

		promedio =  ( suma / contador );
		
		return promedio;
		
	}
	
	public double promedioPerimetroOvalos()
	{
		int contador    = 0;
		double promedio = 0;
		double suma     = 0;
		
		for (Figura  x : figuras )
		{
			if( x instanceof Ovalo )
			{	System.out.println(x.calcularPerimetro());
				suma = suma + x.calcularPerimetro();
				contador ++;
			}
		}
	promedio = ( suma/contador );
	return promedio;
	}		
			
		
	
	
	private void perimetroMasPequñaActionPerformed(ActionEvent evt) 
	{
		if( tamaño() == 0 )
		{
			JOptionPane.showMessageDialog( null, "Lista vacia" );
			
		}else
			JOptionPane.showMessageDialog( null, perimetroMasPequeño() );
	}

	 
	private void promedioAreaRectangulosActionPerformed(ActionEvent evt) 
	{
		if( tamaño() == 0 )
		{
			JOptionPane.showMessageDialog( null, "Lista vacia" );
			
		}else
			JOptionPane.showMessageDialog( null, promedioAreaRectangulos() );

	}
	
	private void promedioPerimetroElipsesActionPerformed(ActionEvent evt) 
	{
		if( tamaño() == 0 )
		{
			JOptionPane.showMessageDialog( null, "Lista vacia" );
			
		}else
			JOptionPane.showMessageDialog( null, promedioPerimetroOvalos() );
	}
}
