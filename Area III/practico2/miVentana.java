package practico2;
import java.awt.*;
import javax.swing.*;

public class miVentana extends JFrame {
	
	public miVentana() {
		
		this.setTitle("Registrar Usuario"); 
		this.setSize(360,270); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(true); 
		this.setLayout(new FlowLayout());
		String[] rol = {"Empleado", "Gerente", "Dueño"};
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		panel1.setLayout(new GridLayout(5,2));
		panel2.setLayout(new FlowLayout());
		panel3.setLayout(new GridLayout(2,1));
		
		JLabel nombrelbl = new JLabel("Nombre: ");
		JLabel apellidolbl = new JLabel("Apellido: ");
		JLabel cedulalbl = new JLabel("Cédula: ");
		JLabel edadlbl = new JLabel("Edad: ");
		JLabel rollbl = new JLabel("Rol: ");
		
		JTextField nombretxtF = new JTextField();
		JTextField apellidotxtF = new JTextField();
		JTextField cedulatxtF = new JTextField();
		JTextField edadtxtF = new JTextField();
		JComboBox rolCombo = new JComboBox(rol);
		
		JButton registrarbtn = new JButton("Registrar");
		
		panel1.add(nombrelbl);
		panel1.add(nombretxtF);
		panel1.add(apellidolbl);
		panel1.add(apellidotxtF);
		panel1.add(cedulalbl);
		panel1.add(cedulatxtF);
		panel1.add(edadlbl);
		panel1.add(edadtxtF);
		panel1.add(rollbl);
		panel1.add(rolCombo);
		
		panel2.add(registrarbtn);
		
		panel3.add(panel1);
		panel3.add(panel2);
		
		this.add(panel3);
		
	}
}
		

	
	

