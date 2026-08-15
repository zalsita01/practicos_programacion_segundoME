package terceraImplementacion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class registroLibros extends JFrame {

	int libro = 0;
	String[] isbn = new String[10];
	String[] titulo = new String[10];
	String[] autor = new String[10];
	
	public registroLibros() {
		
		this.setTitle("Gestor de Libros");
		this.setSize(480, 320);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		panel1.setLayout(new GridLayout(3,2));
		panel2.setLayout(new GridLayout(1,2));
		panel4.setLayout(new BorderLayout());
		
		JLabel isbnlbl = new JLabel("ISBN: ");
		JLabel autorlbl = new JLabel("Autor: ");
		JLabel titulolbl = new JLabel("Título: ");
		JLabel mensaje = new JLabel("Registre un Libro");
		
		JTextField isbntxtF = new JTextField();
		JTextField autortxtF = new JTextField();
		JTextField titulotxtF = new JTextField();
		
		JButton registrar = new JButton("Registrar Libro");
		JButton listar = new JButton("Listar Libros");
		
		panel1.add(isbnlbl);
		panel1.add(isbntxtF);
		panel1.add(autorlbl);
		panel1.add(autortxtF);
		panel1.add(titulolbl);
		panel1.add(titulotxtF);
		
		panel2.add(registrar);
		panel2.add(listar);
		
		panel3.add(mensaje);
		
		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel3, BorderLayout.CENTER);
		panel4.add(panel2, BorderLayout.SOUTH);
		
		registrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				String isbn = isbntxtF.getText();
				String titulo = titulotxtF.getText();
				String autor = autortxtF.getText();
			
				mensaje.setText(altarLibro(isbn, titulo, autor));

				
			}
		});
		
		listar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				ListarLibro();
			}
		});
		
		this.add(panel4);
		
		
	}
	
	public String altarLibro(String isbn, String titulo, String autor) {
		
		String resultado = "Registrado Exitosamente";
		

		if (this.libro != 0) {

			for (int i = 0; i < this.isbn.length; i++) {
				
				if (this.isbn[i] == null) {
					
					this.isbn[i] = isbn;
					this.autor[i] = autor;
					this.titulo[i] = titulo;	
										
					break;

				}
			}
		}else {
			
			this.isbn[0] = isbn;
			this.autor[0] = autor;
			this.titulo[0] = titulo;	
			this.libro++;
		}
		
		
		
		return resultado;
	}
	
	public void ListarLibro() {
		

		if (libro != 0) {
			
			for (int i = 0; i < this.isbn.length; i++) {
				
				if (this.isbn[i] != null) {
					
					System.out.println("El título del Libro es: "+this.titulo[i]+", escrito por "+ this.autor[i]+". Su ISBN es: "+this.isbn[i]);

				}

			}
		}
		
		
	}
	
}

