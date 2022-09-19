package co.edu.uniquindio.interfaz;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import co.edu.uniquindio.figuras.Circulo;
import co.edu.uniquindio.figuras.Cuadrado;



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
public class CuadradoVentana extends javax.swing.JFrame implements ActionListener
{
	private JLabel tituloAltura;
	private JButton area;
	private JButton atras;
	private JButton perimetro;
	private JTextField altura;
    private Ventana ventana;
    
	public CuadradoVentana( Ventana ventana )
	{
		super("Cuadrado");
		setPreferredSize(new Dimension(500, 300));
		initGUI();
		this.ventana = ventana;
	}
	
	private void initGUI() 
	{
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			getContentPane().setBackground(new java.awt.Color(255,128,128));
			{
				tituloAltura = new JLabel();
				getContentPane().add(tituloAltura);
				tituloAltura.setText("Altura:");
				tituloAltura.setBounds(31, 46, 60, 16);
				tituloAltura.setFont(new java.awt.Font("Comic Sans MS",1,12));
			}
			{
				altura = new JTextField();
				getContentPane().add(altura);
				altura.setBounds(79, 43, 49, 23);
			}
			{
				area = new JButton();
				getContentPane().add(area);
				area.setText("Area");
				area.setBounds(20, 140, 99, 23);
				area.setFont(new java.awt.Font("Comic Sans MS",1,12));
				area.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						areaActionPerformed(evt);
					}
				});
			}
			{
				perimetro = new JButton();
				getContentPane().add(perimetro);
				perimetro.setText("Perimetro");
				perimetro.setBounds(20, 203, 99, 23);
				perimetro.setFont(new java.awt.Font("Comic Sans MS",1,12));
				perimetro.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt)
					{
						perimetroActionPerformed(evt);
					}
				});
			}
			{
				atras = new JButton();
				getContentPane().add(atras);
				atras.setText("Atras");
				atras.setBounds(268, 203, 81, 23);
				atras.setFont(new java.awt.Font("Comic Sans MS",1,12));
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void areaActionPerformed(ActionEvent evt) 
	{
		int alt = Integer.parseInt( altura.getText() );
		Cuadrado nuevoCuadrado = new Cuadrado( alt );
		ventana.getFiguras().add( nuevoCuadrado );
		String area = String.valueOf( nuevoCuadrado.calcularArea() );
		JOptionPane.showMessageDialog( null, "El area es: "+area );
		}
	
	private void perimetroActionPerformed(ActionEvent evt) 
	{
		int alt = Integer.parseInt( altura.getText() );
		Cuadrado nuevoCuadrado = new Cuadrado( alt );
		String perimetro = String.valueOf( nuevoCuadrado.calcularPerimetro() );
		JOptionPane.showMessageDialog( null,"El perimetro es: "+perimetro );
		altura.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{}
}
