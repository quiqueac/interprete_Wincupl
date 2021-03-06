package com.miorganizacion.simple.interprete.graficos;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class JPanelVistaDeChip extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int contador_de_pines;
	
	private int [] pines_de_entrada;
	private int [] pines_de_salida;
	private int numero = 0;
	private int entrada = 0;
	
	private String [] nombre_de_pines_de_entrada;
	private String [] nombre_de_pines_de_salida;
	
	private String [] operacion_de_pines_de_salida;
	private String [] nombre_operacion_de_pines_de_salida;
	
	private final JButton btn1;
	private final JButton btn2;
	private final JButton btn3;
	private final JButton btn4;
	private final JButton btn5;
	private final JButton btn6;
	private final JButton btn7;
	private final JButton btn8;
	private final JButton btn9;
	private final JButton btn11;
	private final JButton btn12;
	private final JButton btn13;
	private final JButton btn14;
	private final JButton btn15;
	private final JButton btn16;
	private final JButton btn17;
	private final JButton btn18;
	private final JButton btn19;
	
	private enum Colorear {
	    BLANCO, AZUL, AMARILLO, VERDE, ROJO;
	}
	
	private Colorear color;
	
	private JButton [] botones = new JButton[20];

	/**
	 * Create the panel.
	 */
	public JPanelVistaDeChip(int contador_de_pines, int [] pines_de_entrada, int [] pines_de_salida, String [] nombre_de_pines_de_entrada, String [] nombre_de_pines_de_salida, final String [] operacion_de_pines_de_salida, final String [] nombre_operacion_de_pines_de_salida) {
		/**
		 * Datos inicializados
		 */
		this.contador_de_pines = contador_de_pines;
		
		this.pines_de_entrada = Arrays.copyOf(pines_de_entrada, contador_de_pines);
		this.pines_de_salida = Arrays.copyOf(pines_de_salida, pines_de_salida.length);
		
		this.nombre_de_pines_de_entrada = Arrays.copyOf(nombre_de_pines_de_entrada, contador_de_pines);
		this.nombre_de_pines_de_salida = Arrays.copyOf(nombre_de_pines_de_salida, nombre_de_pines_de_salida.length);
		
		this.operacion_de_pines_de_salida = Arrays.copyOf(operacion_de_pines_de_salida, operacion_de_pines_de_salida.length);
		this.nombre_operacion_de_pines_de_salida = Arrays.copyOf(nombre_operacion_de_pines_de_salida, nombre_operacion_de_pines_de_salida.length);
		
		/**
		 * Layout
		 */
		setLayout(null);
		
		/**
		 * Inicializacion de botones
		 */
		color = Colorear.BLANCO;
		
		btn1 = new JButton("1");
		btn1.setVisible(false);
		btn1.setFocusable(false);
		btn1.setBounds(23, 181, 45, 23);
		colorearBoton(btn1, color);
		add(btn1);
		botones[1] = btn1;
		
		btn2 = new JButton("2");
		btn2.setVisible(false);
		btn2.setFocusable(false);
		btn2.setBounds(49, 215, 45, 23);
		colorearBoton(btn2, color);
		add(btn2);
		botones[2] = btn2;
		
		btn3 = new JButton("3");
		btn3.setVisible(false);
		btn3.setFocusable(false);
		btn3.setBounds(49, 244, 45, 23);
		colorearBoton(btn3, color);
		add(btn3);
		botones[3] = btn3;
		
		btn4 = new JButton("4");
		btn4.setVisible(false);
		btn4.setFocusable(false);
		btn4.setBounds(49, 275, 45, 23);
		colorearBoton(btn4, color);
		add(btn4);
		botones[4] = btn4;
		
		btn5 = new JButton("5");
		btn5.setVisible(false);
		btn5.setFocusable(false);
		btn5.setBounds(49, 304, 45, 23);
		colorearBoton(btn5, color);
		add(btn5);
		botones[5] = btn5;
		
		btn6 = new JButton("6");
		btn6.setVisible(false);
		btn6.setFocusable(false);
		btn6.setBounds(49, 336, 45, 23);
		colorearBoton(btn6, color);
		add(btn6);
		botones[6] = btn6;
		
		btn7 = new JButton("7");
		btn7.setVisible(false);
		btn7.setFocusable(false);
		btn7.setBounds(49, 369, 45, 23);
		colorearBoton(btn7, color);
		add(btn7);
		botones[7] = btn7;
		
		btn8 = new JButton("8");
		btn8.setVisible(false);
		btn8.setFocusable(false);
		btn8.setBounds(49, 399, 45, 23);
		colorearBoton(btn8, color);
		add(btn8);
		botones[8] = btn8;
		
		btn9 = new JButton("9");
		btn9.setVisible(false);
		btn9.setFocusable(false);
		btn9.setBounds(49, 429, 45, 23);
		colorearBoton(btn9, color);
		add(btn9);
		botones[9] = btn9;
		
		btn11 = new JButton("11");
		btn11.setVisible(false);
		btn11.setFocusable(false);
		btn11.setBounds(354, 463, 52, 23);
		colorearBoton(btn11, color);
		add(btn11);
		botones[11] = btn11;
		
		btn12 = new JButton("12");
		btn12.setVisible(false);
		btn12.setFocusable(false);
		btn12.setBounds(354, 430, 52, 23);
		colorearBoton(btn12, color);
		add(btn12);
		botones[12] = btn12;
		
		btn13 = new JButton("13");
		btn13.setVisible(false);
		btn13.setFocusable(false);
		btn13.setBounds(354, 399, 52, 23);
		colorearBoton(btn13, color);
		add(btn13);
		botones[13] = btn13;
		
		btn14 = new JButton("14");
		btn14.setVisible(false);
		btn14.setFocusable(false);
		btn14.setBounds(354, 369, 52, 23);
		colorearBoton(btn14, color);
		add(btn14);
		botones[14] = btn14;
		
		btn15 = new JButton("15");
		btn15.setVisible(false);
		btn15.setFocusable(false);
		btn15.setBounds(354, 336, 52, 23);
		colorearBoton(btn15, color);
		add(btn15);
		botones[15] = btn15;
		
		btn16 = new JButton("16");
		btn16.setVisible(false);
		btn16.setFocusable(false);
		btn16.setBounds(354, 306, 52, 23);
		colorearBoton(btn16, color);
		add(btn16);
		botones[16] = btn16;
		
		btn17 = new JButton("17");
		btn17.setVisible(false);
		btn17.setFocusable(false);
		btn17.setBounds(354, 275, 52, 23);
		colorearBoton(btn17, color);
		add(btn17);
		botones[17] = btn17;
		
		btn18 = new JButton("18");
		btn18.setVisible(false);
		btn18.setFocusable(false);
		btn18.setBounds(354, 244, 52, 23);
		colorearBoton(btn18, color);
		add(btn18);
		botones[18] = btn18;
		
		btn19 = new JButton("19");
		btn19.setVisible(false);
		btn19.setFocusable(false);
		btn19.setBounds(354, 215, 52, 23);
		colorearBoton(btn19, color);
		add(btn19);
		botones[19] = btn19;
		
		/**
		 * Imagen de GAL16V8
		 */
		JLabel lblGAL16V8 = new JLabel("");
		lblGAL16V8.setBounds(10, 109, 418, 393);
		lblGAL16V8.setHorizontalAlignment(SwingConstants.CENTER);
		lblGAL16V8.setIcon(new ImageIcon(JPanelVistaDeChip.class.getResource("/com/miorganizacion/simple/interprete/graficos/img/GAL16V8.jpeg")));
		add(lblGAL16V8);
		
		/**
		 * Etiqueta de combo box de pines de entrada
		 */
		JLabel lblPinesDeEntradaConNombre = new JLabel("Pines de entrada");
		lblPinesDeEntradaConNombre.setBounds(10, 60, 100, 14);
		add(lblPinesDeEntradaConNombre);
		
		/**
		 * Combo box de pines de entrada
		 */
		final JComboBox comboBoxPinesDeEntradaConNombre = new JComboBox();
		comboBoxPinesDeEntradaConNombre.setEnabled(false);
		comboBoxPinesDeEntradaConNombre.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un pin de entrada"}));
		comboBoxPinesDeEntradaConNombre.setBounds(10, 76, 418, 22);
		comboBoxPinesDeEntradaConNombre.setMaximumRowCount(17);
		add(comboBoxPinesDeEntradaConNombre);
		
		/**
		 * Etiqueta de combo box de pines de salida
		 */
		JLabel lblPinesDeSalidaConEcuacionesDeSalida = new JLabel("Pines de salida");
		lblPinesDeSalidaConEcuacionesDeSalida.setBounds(10, 11, 100, 14);
		add(lblPinesDeSalidaConEcuacionesDeSalida);
		
		/**
		 * Combo box de pines de salida
		 */
		final JComboBox comboBoxPinesDeSalidaConEcuacionesDeSalida = new JComboBox();
		comboBoxPinesDeSalidaConEcuacionesDeSalida.addItemListener(new ItemListener() {
			/**
			 * Si fue modificado
			 */
			public void itemStateChanged(ItemEvent e) {
				String cadena_numero;
				String cadena_recortada;
				
				/**
				 * Si un elemento fue seleccionado
				 */
				if(e.getStateChange() == ItemEvent.SELECTED) {
					int indice = comboBoxPinesDeSalidaConEcuacionesDeSalida.getSelectedIndex();
					
					/**
					 * Si es la segunda opcion seleccionada en adelante
					 */
					if(indice > 0) {
						if(comboBoxPinesDeEntradaConNombre.getItemCount() > 1) {
							comboBoxPinesDeEntradaConNombre.removeItemAt(1);
							
							color = Colorear.BLANCO;
							
							encontrarBotonSalida(numero, color);
							encontrarBotonEntrada(entrada, color);
						}
						
						/**
						 * Anadir las entradas correspondientes al combo box de pines de entrada
						 */
						comboBoxPinesDeEntradaConNombre.addItem(operacion_de_pines_de_salida[indice - 1] + ". " + nombre_operacion_de_pines_de_salida[indice - 1]);
						comboBoxPinesDeEntradaConNombre.setEnabled(true);
						
						cadena_numero = (String) comboBoxPinesDeSalidaConEcuacionesDeSalida.getItemAt(indice);
						cadena_recortada = cadena_numero.substring(0, 2);
						
						/**
						 * Amarillo para los pines de salida sin probar
						 */
						numero = Integer.parseInt(cadena_recortada);
						color = Colorear.AMARILLO;
						encontrarBotonSalida(numero, color);
						
						/**
						 * Azul para los pines de entrada sin probar
						 */
						entrada = Integer.parseInt(operacion_de_pines_de_salida[indice - 1]);
						color = Colorear.AZUL;
						encontrarBotonEntrada(entrada, color);
					} else {
						/**
						 * Si se selecciona otra salida, se resetea el color de los botones y se vacia el combo box de pines de entrada
						 */
						comboBoxPinesDeEntradaConNombre.removeItemAt(1);
						comboBoxPinesDeEntradaConNombre.setEnabled(false);
						
						color = Colorear.BLANCO;
						encontrarBotonSalida(numero, color);
						encontrarBotonEntrada(entrada, color);
					}
				}
			}
		});
		
		/**
		 * Inicializacion de combo box de pines de salida
		 */
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setMaximumRowCount(9);
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setModel(new DefaultComboBoxModel(new String[] {"Selecciona un pin de salida"}));
		comboBoxPinesDeSalidaConEcuacionesDeSalida.setBounds(10, 27, 418, 22);
		add(comboBoxPinesDeSalidaConEcuacionesDeSalida);
		
		/**
		 * Boton para realizar prueba
		 */
		JButton btnRealizarPrueba = new JButton("Realizar prueba");
		btnRealizarPrueba.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnRealizarPrueba.setBounds(291, 513, 137, 23);
		add(btnRealizarPrueba);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, lblGAL16V8, lblPinesDeEntradaConNombre, comboBoxPinesDeEntradaConNombre, lblPinesDeSalidaConEcuacionesDeSalida, comboBoxPinesDeSalidaConEcuacionesDeSalida, btnRealizarPrueba}));
		
		/**
		 * Etiqueta de informacion de color de pin
		 */
		JLabel lblPinDeEntradaSinComprobar = new JLabel("Pin de entrada sin comprobar");
		lblPinDeEntradaSinComprobar.setForeground(Color.BLUE);
		lblPinDeEntradaSinComprobar.setBounds(10, 513, 203, 14);
		add(lblPinDeEntradaSinComprobar);
		
		/**
		 * Etiqueta de informacion de color de pin
		 */
		JLabel lblPinDeSalidaSinComprobar = new JLabel("Pin de salida sin comprobar");
		lblPinDeSalidaSinComprobar.setForeground(new Color(210, 105, 30));
		lblPinDeSalidaSinComprobar.setBounds(10, 527, 174, 14);
		add(lblPinDeSalidaSinComprobar);
		
		/**
		 * Etiqueta de informacion de color de pin
		 */
		JLabel lblPinFuncionando = new JLabel("Pin funcionando");
		lblPinFuncionando.setForeground(new Color(0, 128, 0));
		lblPinFuncionando.setBounds(10, 540, 137, 14);
		add(lblPinFuncionando);
		
		/**
		 * Etiqueta de informacion de color de pin
		 */
		JLabel lblPinSinFuncionar = new JLabel("Pin sin funcionar");
		lblPinSinFuncionar.setForeground(new Color(128, 0, 0));
		lblPinSinFuncionar.setBounds(10, 552, 137, 14);
		add(lblPinSinFuncionar);
		
		/**
		 * Hacer visibles los botones de salida
		 */
		for(int contador = 0; contador < this.nombre_de_pines_de_salida.length; contador++) {
			comboBoxPinesDeSalidaConEcuacionesDeSalida.addItem(this.pines_de_salida[contador] + ". " + this.nombre_de_pines_de_salida[contador] + " = " + this.operacion_de_pines_de_salida[contador]);
			
			switch(this.pines_de_salida[contador]) {
				case 12:
					btn12.setVisible(true);
					break;
				case 13:
					btn13.setVisible(true);
					break;
				case 14:
					btn14.setVisible(true);
					break;
				case 15:
					btn15.setVisible(true);
					break;
				case 16:
					btn16.setVisible(true);
					break;
				case 17:
					btn17.setVisible(true);
					break;
				case 18:
					btn18.setVisible(true);
					break;
				case 19:
					btn19.setVisible(true);
					break;
			}
		}
		
		/**
		 * Hacer visibles los botones de entrada
		 */
		for(int contador = 0; contador < this.contador_de_pines; contador++) {
			switch(this.pines_de_entrada[contador]) {
				case 1:
					btn1.setVisible(true);
					break;
				case 2:
					btn2.setVisible(true);
					break;
				case 3:
					btn3.setVisible(true);
					break;
				case 4:
					btn4.setVisible(true);
					break;
				case 5:
					btn5.setVisible(true);
					break;
				case 6:
					btn6.setVisible(true);
					break;
				case 7:
					btn7.setVisible(true);
					break;
				case 8:
					btn8.setVisible(true);
					break;
				case 9:
					btn9.setVisible(true);
					break;
				case 11:
					btn11.setVisible(true);
					break;
				case 13:
					btn13.setVisible(true);
					break;
				case 14:
					btn14.setVisible(true);
					break;
				case 15:
					btn15.setVisible(true);
					break;
				case 16:
					btn16.setVisible(true);
					break;
				case 17:
					btn17.setVisible(true);
					break;
				case 18:
					btn18.setVisible(true);
					break;
			}
		}
	}
	
	/**
	 * Funcion para colocar colores de botones
	 * @param btn
	 * @param color
	 */
	private void colorearBoton(JButton btn, Colorear color) {
		switch(color) {
			case BLANCO:
				btn.setForeground(new Color(0, 0, 0));
				btn.setFont(new Font("Tahoma", Font.PLAIN, 11));
				btn.setBackground(new Color(240, 240, 240));
				break;
			case AZUL:
				btn.setForeground(new Color(255, 255, 255));
				btn.setFont(new Font("Tahoma", Font.BOLD, 14));
				btn.setBackground(new Color(0, 0, 255));
				break;
			case AMARILLO:
				btn.setForeground(new Color(0, 0, 0));
				btn.setFont(new Font("Tahoma", Font.BOLD, 14));
				btn.setBackground(new Color(229, 190, 1));
				break;
			case VERDE:
				break;
			case ROJO:
				break;
		}
	}
	
	/**
	 * Funcion para encontrar un boton de salida
	 * @param numero
	 * @param color
	 */
	private void encontrarBotonSalida(int numero, Colorear color) {
		switch(numero) {
			case 12:
				colorearBoton(btn12, color);
				break;
			case 13:
				colorearBoton(btn13, color);
				break;
			case 14:
				colorearBoton(btn14, color);
				break;
			case 15:
				colorearBoton(btn15, color);
				break;
			case 16:
				colorearBoton(btn16, color);
				break;
			case 17:
				colorearBoton(btn17, color);
				break;
			case 18:
				colorearBoton(btn18, color);
				break;
			case 19:
				colorearBoton(btn19, color);
				break;
		}
	}
	
	/**
	 * Funcion para encontrar un boton de entrada
	 * @param numero
	 * @param color
	 */
	private void encontrarBotonEntrada(int numero, Colorear color) {
		switch(numero) {
			case 1:
				colorearBoton(btn1, color);
				break;
			case 2:
				colorearBoton(btn2, color);
				break;
			case 3:
				colorearBoton(btn3, color);
				break;
			case 4:
				colorearBoton(btn4, color);
				break;
			case 5:
				colorearBoton(btn5, color);
				break;
			case 6:
				colorearBoton(btn6, color);
				break;
			case 7:
				colorearBoton(btn7, color);
				break;
			case 8:
				colorearBoton(btn8, color);
				break;
			case 9:
				colorearBoton(btn9, color);
				break;
			case 11:
				colorearBoton(btn1, color);
				break;
			case 13:
				colorearBoton(btn13, color);
				break;
			case 14:
				colorearBoton(btn14, color);
				break;
			case 15:
				colorearBoton(btn15, color);
				break;
			case 16:
				colorearBoton(btn16, color);
				break;
			case 17:
				colorearBoton(btn17, color);
				break;
			case 18:
				colorearBoton(btn18, color);
				break;
		}
	}
}
