package practico1;
import java.awt.*;
import javax.swing.*;
public class miVentana extends JFrame {
		
	
	public miVentana() {
		
		this.setTitle("Ventana de Prueba - RAMIRO SOSA"); 
		this.setSize(480,320); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false); 
		this.setLayout(new FlowLayout());
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		
		
		panel2.setLayout(new GridLayout(1,2));
		panel4.setLayout(new BorderLayout());
			
		JLabel texto1lbl = new JLabel("Bienvenido a mi programa");
		JLabel texto2lbl = new JLabel("Nombre:");
		JTextField nombretxtF = new JTextField(10);
		JButton iniciarbtn = new JButton("Aceptar");
		
		panel1.add(texto1lbl);
		
		panel2.add(texto2lbl);
		panel2.add(nombretxtF);
		
		panel3.add(iniciarbtn);
		
		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.CENTER);
		panel4.add(panel3, BorderLayout.SOUTH);

		this.add(panel4);
		
	}
	
	
}
