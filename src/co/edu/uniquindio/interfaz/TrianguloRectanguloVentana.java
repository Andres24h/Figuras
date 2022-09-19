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

import co.edu.uniquindio.figuras.Rectangulo;
import co.edu.uniquindio.figuras.TrianguloRectangulo;


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
public class TrianguloRectanguloVentana extends javax.swing.JFrame implements ActionListener
{
	private JLabel tituloAltura;
	private JTextField base;
	private JButton area;
	private JButton atras;
	private JButton perimetro;
	private JLabel tituloBase;
	private JTextField altura;
	private Ventana ventana;

	public TrianguloRectanguloVentana( Ventana ventana )
	{
		super("Triangulo Rectangulo");
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
				tituloAltura.setBounds(18, 39, 48, 16);
				tituloAltura.setFont(new java.awt.Font("Comic Sans MS",1,12));
			}
			{
				altura = new JTextField();
				getContentPane().add(altura);
				altura.setBounds(66, 36, 46, 23);
			}
			{
				tituloBase = new JLabel();
				getContentPane().add(tituloBase);
				tituloBase.setText("Base:");
				tituloBase.setBounds(18, 81, 38, 16);
				tituloBase.setFont(new java.awt.Font("Comic Sans MS",1,12));
			}
			{
				base = new JTextField();
				getContentPane().add(base);
				base.setBounds(64, 77, 44, 23);
			}
			{
				area = new JButton();
				getContentPane().add(area);
				area.setText("Area");
				area.setBounds(12, 139, 100, 23);
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
				perimetro.setBounds(12, 196, 100, 23);
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
				atras.setBounds(270, 196, 81, 23);
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
		int bas = Integer.parseInt( base.getText() );
		TrianguloRectangulo nuevoTrianguloRectangulo = new TrianguloRectangulo( alt, bas );
		ventana.getFiguras().add( nuevoTrianguloRectangulo );
		String area = String.valueOf( nuevoTrianguloRectangulo.calcularArea() );
		JOptionPane.showMessageDialog( null, "El area es: "+area );
	}
	
	private void perimetroActionPerformed(ActionEvent evt)
	{
		int alt = Integer.parseInt( altura.getText() );
		int bas = Integer.parseInt( base.getText() );
		TrianguloRectangulo nuevoTrianguloRectangulo = new TrianguloRectangulo( alt, bas );
		String perimetro = String.valueOf( nuevoTrianguloRectangulo.calcularPerimetro() );
		JOptionPane.showMessageDialog( null, "El perimetro es: "+perimetro );
		altura.setText("");
		base.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{}
}
