package practico1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		
		panel2.setLayout(new GridLayout(2,2));
		panel3.setLayout(new GridLayout(2,1));
		panel4.setLayout(new BorderLayout());
			
		JLabel texto1lbl = new JLabel("Bienvenido a mi programa");
		JLabel texto2lbl = new JLabel("Nombre:");
		JLabel texto3lbl = new JLabel("Contraseña:");
		JLabel lblTexto = new JLabel ("Esperando...");
		
		JTextField nombretxtF = new JTextField(10);
		JTextField contraseñatxtF = new JTextField(10);

		JButton iniciarbtn = new JButton("Aceptar");
		
		panel1.add(texto1lbl);
		
		panel2.add(texto2lbl);
		panel2.add(nombretxtF);
		panel2.add(texto3lbl);
		panel2.add(contraseñatxtF);
		
		panel3.add(lblTexto);
		panel3.add(iniciarbtn);
		
		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.CENTER);
		panel4.add(panel3, BorderLayout.SOUTH);
		
		
		iniciarbtn.addActionListener(new ActionListener() {
			//@Override	
			public void actionPerformed(ActionEvent e) {
								
				String PrivNombre = "JEREMIAS";
				String PrivContraseña = "12345678";

				String nombre = nombretxtF.getText();
				String contraseña = contraseñatxtF.getText();
				
				if (nombre.equals(PrivNombre) && contraseña.equals(PrivContraseña)){
					
					lblTexto.setText("Sesión iniciada correctamente");
					lblTexto.setForeground(Color.GREEN);

				}else if (nombre.equals(PrivNombre) && !contraseña.equals(PrivContraseña)) {
					
					lblTexto.setText("Contraseña incorrecta");
					lblTexto.setForeground(Color.ORANGE);
					
				}else {
					
					lblTexto.setForeground(Color.RED);
					lblTexto.setText("Usuario no Ingresado");

				}
				

			}			
		});
		
		this.add(panel4);
		
	}
	
	
}
