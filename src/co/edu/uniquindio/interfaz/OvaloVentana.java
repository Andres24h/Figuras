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
import co.edu.uniquindio.figuras.Ovalo;


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
public class OvaloVentana extends javax.swing.JFrame implements ActionListener
{
	private JButton perimetro;
	private JButton area;
	private JTextField radioMayor;
	private JButton atras;
	private JTextField radioMenor;
	private JLabel tituloRadioMenor;
	private JLabel tituloRadioMayor;
	private Ventana ventana;

	public OvaloVentana(Ventana ventana) 
	{
		super("Ovalo");
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
				area = new JButton();
				getContentPane().add(area);
				area.setText("Area");
				area.setBounds(26, 135, 72, 23);
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
				perimetro.setBounds(26, 195, 95, 23);
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
				tituloRadioMayor = new JLabel();
				getContentPane().add(tituloRadioMayor);
				tituloRadioMayor.setText("Radio mayor:");
				tituloRadioMayor.setBounds(21, 37, 83, 16);
				tituloRadioMayor.setFont(new java.awt.Font("Comic Sans MS",1,12));
			}
			{
				tituloRadioMenor = new JLabel();
				getContentPane().add(tituloRadioMenor);
				tituloRadioMenor.setText("Radio menor:");
				tituloRadioMenor.setBounds(21, 75, 88, 16);
				tituloRadioMenor.setFont(new java.awt.Font("Comic Sans MS",1,12));				
			}
			{
				radioMayor = new JTextField();
				getContentPane().add(radioMayor);
				radioMayor.setBounds(99, 34, 48, 23);
			}
			{
				radioMenor = new JTextField();
				getContentPane().add(radioMenor);
				radioMenor.setBounds(99, 72, 47, 23);
			}
			{
				atras = new JButton();
				getContentPane().add(atras);
				atras.setText("Atras");
				atras.setBounds(272, 195, 81, 23);
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
		int radioMay = Integer.parseInt( radioMayor.getText() );
		int radioMen = Integer.parseInt( radioMenor.getText());
		Ovalo nuevoOvalo = new Ovalo( radioMay, radioMen );
		ventana.getFiguras().add( nuevoOvalo );
		String area = String.valueOf( nuevoOvalo.calcularArea() );
		JOptionPane.showMessageDialog( null, "El area es: "+area );
	}
	
	private void perimetroActionPerformed(ActionEvent evt)
	{
		int radioMay = Integer.parseInt( radioMayor.getText() );
		int radioMen = Integer.parseInt( radioMenor.getText() );
		Ovalo nuevoOvalo = new Ovalo( radioMay, radioMen );
		String perimetro = String.valueOf(nuevoOvalo.calcularPerimetro() );
		JOptionPane.showMessageDialog( null, "El perimetro es: "+perimetro );
		radioMayor.setText("");
		radioMenor.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{}
}
	
