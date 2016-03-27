package com.atrium.controlador;

import javax.swing.JFrame;

import java.awt.Rectangle;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.border.EtchedBorder;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.atrium.modelo.Modelo;
import java.awt.Window.Type;

public class Calculadora extends JFrame implements ActionListener {
	private JPanel panel_visor;
	private JPanel panel_teclado;
	private JLabel visor;
	private JPanel panel_numeros;
	private JButton boton_1;
	private JButton boton_2;
	private JButton boton_4;
	private JButton boton_5;
	private JButton boton_6;
	private JButton boton_7;
	private JButton boton_3;
	private JButton boton_8;
	private JButton boton_9;
	private JButton boton_ce;
	private JButton boton_0;
	private JButton boton_punto;
	private JPanel panel_operaciones;
	private JButton boton_sumar;
	private JButton boton_restar;
	private JButton boton_multiplicar;
	private JButton boton_dividir;
	private JButton boton_Igual;
	private Modelo model;

	public Calculadora() {
		setType(Type.UTILITY);
		setTitle("Calculadora");
		getContentPane().setBackground(new Color(0, 153, 255));
		setForeground(new Color(51, 51, 255));
		setBackground(new Color(51, 51, 204));

		crear_Interface();

	}

	public void crear_Interface() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(new Rectangle(100, 100, 350, 400));
		getContentPane().setLayout(null);

		panel_visor = new JPanel();
		panel_visor.setBackground(new Color(0, 153, 204));
		panel_visor.setBounds(0, 0, 334, 71);
		getContentPane().add(panel_visor);
		panel_visor.setLayout(null);

		visor = new JLabel("0");
		visor.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		visor.setOpaque(true);
		visor.setBackground(new Color(204, 255, 255));
		visor.setFont(new Font("Times New Roman", Font.BOLD, 30));
		visor.setHorizontalAlignment(SwingConstants.RIGHT);
		visor.setBounds(10, 11, 314, 49);
		panel_visor.add(visor);

		panel_teclado = new JPanel();
		panel_teclado.setBounds(0, 71, 334, 291);
		getContentPane().add(panel_teclado);
		panel_teclado.setLayout(null);

		panel_numeros = new JPanel();
		panel_numeros.setBackground(new Color(0, 153, 204));
		panel_numeros.setBounds(0, 0, 234, 291);
		panel_teclado.add(panel_numeros);
		panel_numeros.setLayout(new GridLayout(0, 3, 1, 1));

		boton_1 = new JButton("1");
		boton_1.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_1);

		boton_2 = new JButton("2");
		boton_2.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_2);

		boton_3 = new JButton("3");
		boton_3.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_3);

		boton_4 = new JButton("4");
		boton_4.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_4);

		boton_5 = new JButton("5");
		boton_5.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_5);

		boton_6 = new JButton("6");
		boton_6.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_6);

		boton_7 = new JButton("7");
		boton_7.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_7);

		boton_8 = new JButton("8");
		boton_8.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_8);

		boton_9 = new JButton("9");
		boton_9.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_9);

		boton_ce = new JButton("C");
		boton_ce.setBackground(new Color(204, 0, 0));
		boton_ce.setForeground(new Color(51, 153, 51));
		boton_ce.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_ce);

		boton_0 = new JButton("0");
		boton_0.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_0);

		boton_punto = new JButton(".");
		boton_punto.setFont(new Font("Times New Roman", Font.BOLD, 29));
		panel_numeros.add(boton_punto);

		panel_operaciones = new JPanel();
		panel_operaciones.setBackground(new Color(0, 153, 204));
		panel_operaciones.setBounds(238, 0, 96, 213);
		panel_teclado.add(panel_operaciones);
		panel_operaciones.setLayout(new GridLayout(0, 2, 1, 1));

		boton_sumar = new JButton("+");
		boton_sumar.setFont(new Font("Times New Roman",
				Font.BOLD | Font.ITALIC, 28));
		panel_operaciones.add(boton_sumar);

		boton_restar = new JButton("-");
		boton_restar.setFont(new Font("Times New Roman", Font.BOLD
				| Font.ITALIC, 28));
		panel_operaciones.add(boton_restar);

		boton_multiplicar = new JButton("*");
		boton_multiplicar.setFont(new Font("Times New Roman", Font.BOLD
				| Font.ITALIC, 28));
		panel_operaciones.add(boton_multiplicar);

		boton_dividir = new JButton("/");
		boton_dividir.setFont(new Font("Times New Roman", Font.BOLD
				| Font.ITALIC, 28));
		panel_operaciones.add(boton_dividir);

		boton_Igual = new JButton("=");
		boton_Igual.setFont(new Font("SansSerif", Font.ITALIC, 36));
		boton_Igual.setBounds(238, 213, 96, 78);
		panel_teclado.add(boton_Igual);
		setVisible(true);

		boton_0.addActionListener(this);
		boton_1.addActionListener(this);
		boton_2.addActionListener(this);
		boton_3.addActionListener(this);
		boton_4.addActionListener(this);
		boton_5.addActionListener(this);
		boton_6.addActionListener(this);
		boton_7.addActionListener(this);
		boton_8.addActionListener(this);
		boton_9.addActionListener(this);
		boton_ce.addActionListener(this);
		boton_sumar.addActionListener(this);
		boton_restar.addActionListener(this);
		boton_multiplicar.addActionListener(this);
		boton_dividir.addActionListener(this);
		boton_punto.addActionListener(this);
		boton_Igual.addActionListener(this);

		// /switch o flag son variables auxiliares
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// COMPROBACION DE COMPONENTE INVOCADO
		String opcion_seleccionada = ((JButton) evento.getSource()).getText();

		if (visor.getText().equals("0")) {
			visor.setText("");

		}

		if (opcion_seleccionada.equals("0")) {
			visor.setText(visor.getText() + "0");

		}
		if (opcion_seleccionada.equals("1")) {
			visor.setText(visor.getText() + "1");

		}
		if (opcion_seleccionada.equals("2")) {
			visor.setText(visor.getText() + "2");

		}
		if (opcion_seleccionada.equals("3")) {
			visor.setText(visor.getText() + "3");

		}
		if (opcion_seleccionada.equals("4")) {
			visor.setText(visor.getText() + "4");

		}
		if (opcion_seleccionada.equals("5")) {
			visor.setText(visor.getText() + "5");

		}
		if (opcion_seleccionada.equals("6")) {
			visor.setText(visor.getText() + "6");

		}
		if (opcion_seleccionada.equals("7")) {
			visor.setText(visor.getText() + "7");

		}
		if (opcion_seleccionada.equals("8")) {
			visor.setText(visor.getText() + "8");

		}
		if (opcion_seleccionada.equals("9")) {
			visor.setText(visor.getText() + "9");

		}
		if (opcion_seleccionada.equals(".")) {
			visor.setText(visor.getText() + ".");

		}
		if (opcion_seleccionada.equals("C")) {
			visor.setText(" ");
		}

		if (opcion_seleccionada.equals("+")) {

			model = new Modelo();
			model.setSimbolos("+");
			if(model.getOpe1() == 0 ){
				
				model.setOpe1(Double.parseDouble(visor.getText()));
				visor.setText("");
				
			}
          
		}
		if (opcion_seleccionada.equals("-")) {

			model = new Modelo();
			model.setSimbolos("-");
			if(model.getOpe1() == 0 ){
				
				model.setOpe1(Double.parseDouble(visor.getText()));
				visor.setText("");
				
			}
          
		}
		if (opcion_seleccionada.equals("*")) {

			model = new Modelo();
			model.setSimbolos("*");
			if(model.getOpe1() == 0 ){
				
				model.setOpe1(Double.parseDouble(visor.getText()));
				visor.setText("");
				
			}
          
		}
		if (opcion_seleccionada.equals("/")) {

			model = new Modelo();
			model.setSimbolos("/");
			if(model.getOpe1() == 0 ){
				
				model.setOpe1(Double.parseDouble(visor.getText()));
				visor.setText("");
				
			}
          
		}
		if (opcion_seleccionada.equals("=")){
			double resultado=0;
			model.setOpe2(Double.parseDouble(visor.getText()));
			switch(model.getSimbolos()){
			
			case "+":
				
				resultado = model.getOpe1()+model.getOpe2();
				visor.setText(String.valueOf(resultado));
			
			   break;
			   
			case "-":
				
				resultado = model.getOpe1()-model.getOpe2();
				visor.setText(String.valueOf(resultado));
				
				break;
			case "*":
				resultado = model.getOpe1()*model.getOpe2();
				visor.setText(String.valueOf(resultado));
				
				break;
				
			case "/":
				if(model.getOpe1() == 0){
					visor.setText("0");
				}else{
					resultado = model.getOpe1()/model.getOpe2();
					visor.setText(String.valueOf(resultado));
					
				}
				
				break;
			}
			
			
			
		}
	}
}