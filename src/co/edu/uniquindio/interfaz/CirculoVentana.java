package co.edu.uniquindio.interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import co.edu.uniquindio.figuras.Circulo;
import java.awt.Dimension;



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
public class CirculoVentana extends javax.swing.JFrame implements ActionListener
{
	private JLabel tituloRadio;
	private JTextField radioMayor;
	private JButton atras;
	private JLabel jLabelArea;
	private JButton perimetro;
	private JButton area;
	private Ventana ventana;
	
	public CirculoVentana( Ventana ventana )
	{
		super("Circulo");
		setResizable(false);
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
				tituloRadio = new JLabel();
				getContentPane().add(tituloRadio);
				tituloRadio.setText("Radio:");
				tituloRadio.setBounds(19, 38, 53, 16);
				tituloRadio.setFont(new java.awt.Font("Comic Sans MS",1,12));
			}
			{
				radioMayor = new JTextField();
				getContentPane().add(radioMayor);
				radioMayor.setBounds(60, 35, 55, 23);
			}
			{
				area = new JButton();
				getContentPane().add(area);
				area.setText("Area");
				area.setBounds(12, 117, 102, 23);
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
				perimetro.setBounds(12, 188, 102, 23);
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
				jLabelArea = new JLabel();
				getContentPane().add(jLabelArea);
				jLabelArea.setBounds(143, 120, 24, 13);
			}
			{
				atras = new JButton();
				getContentPane().add(atras);
				atras.setText("Atras");
				atras.setBounds(269, 188, 81, 23);
				atras.setFont(new java.awt.Font("Comic Sans MS",1,12));
				atras.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent evt)
					{
						atrasActionPerformed(evt);
					}
				});
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void areaActionPerformed(ActionEvent evt)
	{
		int radio = Integer.parseInt(radioMayor.getText());
		Circulo nuevoCirculo = new Circulo( radio );
		ventana.getFiguras().add( nuevoCirculo );
		String area = String.valueOf( nuevoCirculo.calcularArea() );
		JOptionPane.showMessageDialog( null, "El Area es: "+area );
	}
		
	private void perimetroActionPerformed(ActionEvent evt) 
	{
		int radio = Integer.parseInt( radioMayor.getText() );
		Circulo nuevociCirculo = new Circulo( radio );
		String perimetro = String.valueOf( nuevociCirculo.calcularPerimetro() );
		JOptionPane.showMessageDialog( null, "El perimetro es: "+perimetro );
		radioMayor.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		atrasActionPerformed(e);
	}
	
	private void atrasActionPerformed(ActionEvent evt) 
	{
		System.exit(0);  // instrucción que reinicia el programa
	}
}
