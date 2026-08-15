package ejercicioClase2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class miVentana extends JFrame {

	public miVentana() {

		this.setTitle("Calculadora");
		this.setSize(480, 320);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setLayout(new FlowLayout());

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		panel1.setLayout(new GridLayout(2, 2));
		panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
		panel4.setLayout(new BorderLayout());

		JLabel num1lbl = new JLabel("Nro 1: ");
		JLabel num2lbl = new JLabel("Nro 2: ");
		JLabel reslbl = new JLabel("Resultado: ");

		JTextField num1txtF = new JTextField();
		JTextField num2txtF = new JTextField();

		JButton suma = new JButton("+");
		JButton resta = new JButton("-");
		JButton multi = new JButton("*");
		JButton div = new JButton("/");

		reslbl.setBackground(Color.green);
		reslbl.setOpaque(true);

		panel1.add(num1lbl);
		panel1.add(num1txtF);
		panel1.add(num2lbl);
		panel1.add(num2txtF);

		panel2.add(reslbl);

		panel3.add(suma);
		panel3.add(resta);
		panel3.add(multi);
		panel3.add(div);

		panel4.add(panel1, BorderLayout.NORTH);
		panel4.add(panel2, BorderLayout.CENTER);
		panel4.add(panel3, BorderLayout.SOUTH);

		suma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (num1txtF.getText().equals("") || num2txtF.getText().equals("")) {

					reslbl.setText("Debe ingresar un número");
					return;
				}

				double nro1 = Double.parseDouble(num1txtF.getText());
				double nro2 = Double.parseDouble(num2txtF.getText());

				reslbl.setText("Resultado: " + Suma(nro1, nro2));

			}
		});

		resta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (num1txtF.getText().equals("") || num2txtF.getText().equals("")) {

					reslbl.setText("Debe ingresar un número");
					return;
				}

				double nro1 = Double.parseDouble(num1txtF.getText());
				double nro2 = Double.parseDouble(num2txtF.getText());

				reslbl.setText("Resultado: " + Resta(nro1, nro2));

			}
		});

		multi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (num1txtF.getText().equals("") || num2txtF.getText().equals("")) {

					reslbl.setText("Debe ingresar un número");
					return;
				}

				double nro1 = Double.parseDouble(num1txtF.getText());
				double nro2 = Double.parseDouble(num2txtF.getText());

				reslbl.setText("Resultado: " + Multi(nro1, nro2));
			}
		});

		div.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (num1txtF.getText().equals("") || num2txtF.getText().equals("")) {

					reslbl.setText("Debe ingresar un número");
					return;
				}

				double nro1 = Double.parseDouble(num1txtF.getText());
				double nro2 = Double.parseDouble(num2txtF.getText());

				reslbl.setText("Resultado: " + Div(nro1, nro2));
			}
		});

		this.add(panel4);

		System.out.println("EL TEXTO DEL BOTÓN ES: " + multi.getText());
	}

	public Double Suma(double nro1, double nro2) {

		double res = nro1 + nro2;

		return res;
	}

	public Double Resta(double nro1, double nro2) {

		double res = nro1 - nro2;

		return res;
	}

	public Double Multi(double nro1, double nro2) {

		double res = nro1 * nro2;

		return res;

	}

	public Double Div(double nro1, double nro2) {

		double res = nro1 / nro2;

		return res;
	}
}
