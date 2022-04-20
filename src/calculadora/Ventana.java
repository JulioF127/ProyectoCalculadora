package calculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Ventana extends JFrame {
	//CREACION DE MARCO
	public Ventana() {
		Lamina miLamina = new Lamina();
		add(miLamina);
		miLamina.setLayout(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(770, 300, 365, 490);
		setResizable(false);
		setTitle("Calculadora u.u");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image icono = mipantalla.getImage("src/calculadora/Doge.png");
		setIconImage(icono);

	}
}

class Lamina extends JPanel {
	//CREAR AREA DE TEXTO
	JTextField pantalla = new JTextField();
	
	//CREAR BOTONES
	JButton botonUno = new JButton("1");
	JButton botonDos = new JButton("2");
	JButton botonTres = new JButton("3");
	JButton botonCuatro = new JButton("4");
	JButton botonSinko = new JButton("5");
	JButton botonSeis = new JButton("6");
	JButton botonSiete = new JButton("7");
	JButton botonOcho = new JButton("8");
	JButton botonNueve = new JButton("9");
	JButton botonCero = new JButton("0");
	JButton botonPosNeg = new JButton("+/-");
	JButton botonPunto = new JButton(".");

	JButton bBorrar = new JButton("Borrar");
	JButton bC = new JButton("C");
	JButton bCE = new JButton("CE");

	JButton bPorcentaje = new JButton("*%");
	JButton bPorcentaje2 = new JButton("/%");
	JButton bRad = new JButton("Rad");
	JButton bMult = new JButton("*");
	JButton bDiv = new JButton("/");
	JButton bRes = new JButton("-");
	JButton bSum = new JButton("+");
	JButton bIgual = new JButton("=");
	JButton bAut = new JButton("?");
	
	JButton bClOs = new JButton();

	public Lamina() {
		// PROPIEDADES PANTALLA
		add(pantalla);
		pantalla.setBounds(20, 30, 321, 40);
		pantalla.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		pantalla.setBorder(null);

		// ANADIR BOTONES
		add(botonUno);
		add(botonDos);
		add(botonTres);
		add(botonCuatro);
		add(botonSinko);
		add(botonSeis);
		add(botonSiete);
		add(botonOcho);
		add(botonNueve);
		add(botonCero);

		add(botonPosNeg);
		add(botonPunto);

		add(bBorrar);
		add(bC);
		add(bCE);
		add(bAut);

		add(bPorcentaje);
		add(bPorcentaje2);
		add(bRad);
		add(bMult);
		add(bDiv);
		add(bRes);
		add(bSum);
		add(bIgual);
		
		add(bClOs);
		
		Color color1 = new Color(32, 139, 168);
		Color color2 = new Color(32, 150, 133);
		Color color3 = new Color(224, 158, 36);
		Color color4 = new Color(153, 6, 121);
		Color color5 = new Color(201, 134, 0);
		
		
		// PROPIEDADES BOTONES NUMERICOS
		botonUno.setBounds(20, 260, 50, 50);
		botonDos.setBounds(80, 260, 50, 50);
		botonTres.setBounds(140, 260, 50, 50);
		botonCuatro.setBounds(20, 200, 50, 50);
		botonSinko.setBounds(80, 200, 50, 50);
		botonSeis.setBounds(140, 200, 50, 50);
		botonSiete.setBounds(20, 140, 50, 50);
		botonOcho.setBounds(80, 140, 50, 50);
		botonNueve.setBounds(140, 140, 50, 50);
		botonCero.setBounds(20, 320, 50, 50);
		
		botonUno.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonDos.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonTres.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonCuatro.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonSinko.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonSeis.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonSiete.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonOcho.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonNueve.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		botonCero.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		
		botonUno.setForeground(Color.WHITE);
		botonDos.setForeground(Color.WHITE);
		botonTres.setForeground(Color.WHITE);
		botonCuatro.setForeground(Color.WHITE);
		botonSinko.setForeground(Color.WHITE);
		botonSeis.setForeground(Color.WHITE);
		botonSiete.setForeground(Color.WHITE);
		botonOcho.setForeground(Color.WHITE);
		botonNueve.setForeground(Color.WHITE);
		botonCero.setForeground(Color.WHITE);
		
		botonUno.setBackground(color1);
		botonDos.setBackground(color2);
		botonTres.setBackground(color1);
		botonCuatro.setBackground(color2);
		botonSinko.setBackground(color1);
		botonSeis.setBackground(color3); 
		botonSiete.setBackground(color1);
		botonOcho.setBackground(color1);
		botonNueve.setBackground(color3);
		botonCero.setBackground(color2);
		
		botonUno.setBorderPainted(false);
		botonDos.setBorderPainted(false);
		botonTres.setBorderPainted(false);
		botonCuatro.setBorderPainted(false);
		botonSinko.setBorderPainted(false);
		botonSeis.setBorderPainted(false);
		botonSiete.setBorderPainted(false);
		botonOcho.setBorderPainted(false);
		botonNueve.setBorderPainted(false);
		botonCero.setBorderPainted(false);
		
		

		// PROPIEDADES BOTONES DE ACCIONES
		botonPosNeg.setBounds(80, 320, 50, 50);
		botonPunto.setBounds(140, 320, 50, 50);

		bBorrar.setBounds(20, 80, 100, 50);
		bC.setBounds(130, 80, 100, 50);
		bCE.setBounds(240, 80, 100, 50);
		bAut.setBounds(290, 380, 50, 50);
		
		
		
		botonPosNeg.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		botonPunto.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		
		bBorrar.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bC.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bCE.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bAut.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		
		
		
		botonPosNeg.setForeground(Color.WHITE);
		botonPunto.setForeground(Color.WHITE);
		
		bBorrar.setForeground(Color.WHITE);
		bC.setForeground(Color.WHITE);
		bCE.setForeground(Color.WHITE);
		bAut.setForeground(Color.WHITE);
		
		
		
		botonPosNeg.setBackground(color1);
		botonPunto.setBackground(color1);
		
		bBorrar.setBackground(color1);//32, 150, 133
		bC.setBackground(color1);
		bCE.setBackground(color1);
		bAut.setBackground(color1);
		
		botonPosNeg.setBorderPainted(false);
		botonPunto.setBorderPainted(false);
		
		bBorrar.setBorderPainted(false);
		bC.setBorderPainted(false);
		bCE.setBorderPainted(false);
		bAut.setBorderPainted(false);

		// PROPIEDADES BOTONES OPERACIONES
		bPorcentaje.setBounds(230, 140, 50, 50);
		bPorcentaje2.setBounds(290,140,50,50);
		bRad.setBounds(230, 200, 110, 50);
		bMult.setBounds(230, 260, 50, 50);
		bDiv.setBounds(290, 260, 50, 50);
		bRes.setBounds(230, 320, 50, 50);
		bSum.setBounds(290, 320, 50, 50);
		bIgual.setBounds(230, 380, 50, 50);
		
		bPorcentaje.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		bPorcentaje2.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		bRad.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bMult.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bDiv.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bRes.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bSum.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		bIgual.setFont(new Font ("HP Simplified", Font.BOLD, 18));
		
		bPorcentaje.setForeground(Color.WHITE);
		bPorcentaje2.setForeground(Color.WHITE);
		bRad.setForeground(Color.WHITE);
		bMult.setForeground(Color.WHITE);
		bDiv.setForeground(Color.WHITE);
		bRes.setForeground(Color.WHITE);
		bSum.setForeground(Color.WHITE);
		bIgual.setForeground(Color.WHITE);
		
		bPorcentaje.setBackground(color1);
		bPorcentaje2.setBackground(color1);
		bRad.setBackground(color1);
		bMult.setBackground(color1);
		bDiv.setBackground(color1);
		bRes.setBackground(color1);
		bSum.setBackground(color1);
		bIgual.setBackground(color1);
		
		bPorcentaje.setBorderPainted(false);
		bPorcentaje2.setBorderPainted(false);
		bRad.setBorderPainted(false);
		bMult.setBorderPainted(false);
		bDiv.setBorderPainted(false);
		bRes.setBorderPainted(false);
		bSum.setBorderPainted(false);
		bIgual.setBorderPainted(false);
		
		//BOTON MODO OSCURO
		bClOs.setBounds(20, 380, 170, 50);
		ImageIcon clOs = new ImageIcon("src/calculadora/Modo.png");
		bClOs.setIcon(new ImageIcon (clOs.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		bClOs.setBackground(color1);
		bClOs.setBorderPainted(false);
		bClOs.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	
            	if (contadorCO%2==0) {
            		 setBackground(new Color (59, 59, 59));
            		 botonNueve.setBackground(color5);
            		 botonSeis.setBackground(color5);
            		 botonCuatro.setBackground(color4);
            		 botonDos.setBackground(color4);
            		 botonCero.setBackground(color4);
            		 
            		 pantalla.setBackground(new Color(189, 189, 189));
            		 pantalla.setForeground(Color.white);
            		 
            		 contadorCO++;
				}else {
					setBackground(new Color(240, 240, 240));
					contadorCO++;
					 botonNueve.setBackground(color3);
            		 botonSeis.setBackground(color3);
            		 botonCuatro.setBackground(color2);
            		 botonDos.setBackground(color2);
            		 botonCero.setBackground(color2);
            		
            		 pantalla.setBackground(Color.white);
            		 pantalla.setForeground(Color.black);
            		 
				}
              
        }
});
		
		bIgual.setBorderPainted(false);
		//INSTANCIAS METODOS PARA CADA BOTON
		Operaciones uno = new Operaciones("1");
		Operaciones dos = new Operaciones("2");
		Operaciones tres = new Operaciones("3");
		Operaciones cuatro = new Operaciones("4");
		Operaciones sinko = new Operaciones("5");
		Operaciones seis = new Operaciones("6");
		Operaciones siete = new Operaciones("7");
		Operaciones ocho = new Operaciones("8");
		Operaciones nueve = new Operaciones("9");
		Operaciones cero = new Operaciones("0");

		Operaciones sum = new Operaciones("+");
		Operaciones res = new Operaciones("-");
		Operaciones igual = new Operaciones("=");
		Operaciones mult = new Operaciones("*");
		Operaciones div = new Operaciones("/");
		Operaciones rad = new Operaciones("rad");
		Operaciones prcen = new Operaciones("*%");
		Operaciones prcen2 = new Operaciones("/%");
		
		Operaciones posneg = new Operaciones("+/-");
		Operaciones punto = new Operaciones(".");
		Operaciones aut = new Operaciones("?");
		
		Operaciones borrar = new Operaciones("b");
		Operaciones c = new Operaciones("c");
		Operaciones ce = new Operaciones("ce");
		
		
		
		//ANADIR EVENTO DE BOTON A CADA INSTANCIA CORRESPONDIENTE
		botonUno.addActionListener(uno);
		botonDos.addActionListener(dos);
		botonTres.addActionListener(tres);
		botonCuatro.addActionListener(cuatro);
		botonSinko.addActionListener(sinko);
		botonSeis.addActionListener(seis);
		botonSiete.addActionListener(siete);
		botonOcho.addActionListener(ocho);
		botonNueve.addActionListener(nueve);
		botonCero.addActionListener(cero);

		bSum.addActionListener(sum);
		bRes.addActionListener(res);
		bIgual.addActionListener(igual);
		bMult.addActionListener(mult);
		bDiv.addActionListener(div);
		bRad.addActionListener(rad);
		bPorcentaje.addActionListener(prcen);
		bPorcentaje2.addActionListener(prcen2);
		
		botonPosNeg.addActionListener(posneg);
		botonPunto.addActionListener(punto);
		bAut.addActionListener(aut);
		
		bBorrar.addActionListener(borrar);
		bC.addActionListener(c);
		bCE.addActionListener(ce);
	}

	public static String cadena = "";
	public static int contador = 0;
	public static int contador2 = 0;
	public static int contadorPoN = 0;
	public static int evaluadorPunto = 0;
	public static int contadorCO=0;
	public static double resultados = 0;
	public ArrayList<Double> arrayNumeros = new ArrayList<Double>();
	public ArrayList<String> listOp = new ArrayList<String>();

	private class Operaciones implements ActionListener {

		public Operaciones(String s) {

			letra = s;

		}

		public void actionPerformed(ActionEvent e) {
			if (letra == "+") {
				pantalla.setText("+");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);

			}

			else if (letra == "-") {
				pantalla.setText("-");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);

			}
			else if (letra== "*") {
				pantalla.setText("*");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);
			}
			else if (letra== "/") {
				pantalla.setText("/");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);
			}
			else if(letra == "rad") {
				
				Dventana1 dv = new Dventana1();
				dv.setVisible(true);
				pantalla.setText("Rad");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);
			}
			else if (letra=="*%") {
				Dventana2 dv = new Dventana2();
				dv.setVisible(true);
				pantalla.setText("*%");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);
			}
			else if (letra=="/%") {
				Dventana4 dv = new Dventana4();
				dv.setVisible(true);
				pantalla.setText("/%");
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				cadena = "";
				contador++;
				evaluadorPunto=0;
				listOp.add(letra);
			}
			else if(letra=="+/-") {
				if (contadorPoN%2==0) {
					Double numero = Double.valueOf(cadena);
					Double restante = numero;
					numero= numero - restante*2;
					cadena=numero.toString();
					pantalla.setText(cadena);
				}else {
					Double numero = Double.valueOf(cadena);
					Double restante = numero;
					numero= numero - restante*2;
					cadena=numero.toString();
					pantalla.setText(cadena);
					contadorPoN=0;
				}
				evaluadorPunto=0;
			}
			else if (letra == ".") {
				if(evaluadorPunto==0) {
					cadena = cadena + ".";
					evaluadorPunto++;
					pantalla.setText(cadena);
				}
				
			}
			else if (letra=="?") {
				Dventana3 dv = new Dventana3();
				dv.setVisible(true);
				
			}
			else if(letra=="b") {
				int cortador = cadena.length()-1;
				String subcadena = cadena.substring(0, cortador);
				cadena= subcadena;
				pantalla.setText(cadena);
			}
			else if (letra=="c") {
				cadena="";
				pantalla.setText(cadena);
			}
			else if(letra=="ce") {
				cadena ="";
				arrayNumeros.clear();
				listOp.clear();
				contador=0;
				contador2=0;
				contadorPoN=0;
				evaluadorPunto=0;
				resultados=0;
				pantalla.setText("0");
			}
			else if (letra == "=") {
				evaluadorPunto=0;
				Double numero = Double.valueOf(cadena);
				arrayNumeros.add(numero);
				for (int i = 1; i < arrayNumeros.size(); i++) {

					if (listOp.get(contador2) == "+") {

						resultados = arrayNumeros.get(i - 1) + arrayNumeros.get(i);
						arrayNumeros.set(i, resultados);

					} else if (listOp.get(contador2) == "-") {

						resultados = arrayNumeros.get(i - 1) - arrayNumeros.get(i);
						arrayNumeros.set(i, resultados);

					}else if (listOp.get(contador2) == "*") {
						resultados = arrayNumeros.get(i - 1) * arrayNumeros.get(i);
						arrayNumeros.set(i, resultados);
					}else if (listOp.get(contador2) == "/") {
						resultados = arrayNumeros.get(i - 1) / arrayNumeros.get(i);
						arrayNumeros.set(i, resultados);
					}else if(listOp.get(contador2)== "rad") {
						resultados = Math.pow(arrayNumeros.get(i-1), 1/arrayNumeros.get(i));
						arrayNumeros.set(i, resultados);
					}else if (listOp.get(contador2)== "*%") {
						resultados = arrayNumeros.get(i)/100 * arrayNumeros.get(i-1);
						arrayNumeros.set(i, resultados);
					}else if (listOp.get(contador2)== "/%") {
						resultados = arrayNumeros.get(i-1)*100 / arrayNumeros.get(i);
						arrayNumeros.set(i, resultados);
					}
					contador2++;
				}

				pantalla.setText(arrayNumeros.get(contador).toString());
				contador2=0;
				listOp.clear();
				cadena=arrayNumeros.get(contador).toString();
				contador=0;
				arrayNumeros.clear();
			} else {
				cadena = cadena + letra;
				pantalla.setText(cadena);
			}

		}

		private String letra;

	}

}

class Dventana1 extends JDialog{
	public Dventana1 () {
		JLabel aviso = new JLabel("Ingrese el Indice para la Radicacion");
		JButton aceptar = new JButton("Aceptar");
		setLayout(null);
		setBounds(400, 400, 300, 150);
		setResizable(false);
		setTitle("Primer Avizo");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image icono = mipantalla.getImage("src/calculadora/Doge5.png");
		setIconImage(icono);
		
		add(aviso);//LABEL
		aviso.setBounds(30, 20, 240, 15);
		Color color = new Color(36, 149, 150);
		aviso.setForeground(color);
		aviso.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(aceptar);//BOTON
		aceptar.setBounds(105, 60, 90, 25);
		aceptar.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		aceptar.setForeground(Color.WHITE);
		aceptar.setBackground(new Color(32, 150, 133));
		aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dispose();
        }
});
		
	}
}

class Dventana2 extends JDialog{
	public Dventana2 () {
		JLabel aviso = new JLabel("Ingrese el porcentaje que desea extraer");
		JButton aceptar = new JButton("Aceptar");
		setLayout(null);
		setBounds(400, 600, 300, 150);
		setResizable(false);
		setTitle("Segundo Avizo");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image icono = mipantalla.getImage("src/calculadora/Walter.png");
		setIconImage(icono);
		
		add(aviso);//LABEL
		aviso.setBounds(15, 20, 290, 15);
		Color color = new Color(36, 149, 150);
		aviso.setForeground(color);
		aviso.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(aceptar);//BOTON
		aceptar.setBounds(105, 60, 90, 25);
		aceptar.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		aceptar.setForeground(Color.WHITE);
		aceptar.setBackground(new Color(32, 150, 133));
		aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dispose();
        }
});
		
	}
}
class Dventana4 extends JDialog{
	public Dventana4 () {
		JLabel aviso = new JLabel("Ingrese el total del cual se extraera el");
		JLabel aviso2 = new JLabel("porcentaje que representa el numero anterior");
		JButton aceptar = new JButton("Aceptar");
		setLayout(null);
		setBounds(1200, 400, 375, 150);
		setResizable(false);
		setTitle("Tercer Avizo");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image icono = mipantalla.getImage("src/calculadora/Chabo.png");
		setIconImage(icono);
		
		add(aviso);//LABEL
		aviso.setBounds(54, 20, 320, 15);
		Color color = new Color(36, 149, 150);
		aviso.setForeground(color);
		aviso.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(aviso2);//LABEL
		aviso2.setBounds(35, 40, 320, 15);
		
		aviso2.setForeground(color);
		aviso2.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(aceptar);//BOTON
		aceptar.setBounds(145, 70, 90, 25);
		aceptar.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		aceptar.setForeground(Color.WHITE);
		aceptar.setBackground(new Color(32, 150, 133));
		aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dispose();
        }
});
		
	}
}
class Dventana3 extends JDialog{
	public Dventana3 () {
		JLabel curso = new JLabel("");
		JLabel nombre1 = new JLabel("Julio Fernando Fuentes Bocanegra 0907-19-10520");
		JLabel nombre2 = new JLabel("Yessenia Elizabeth Mateo López 0907-19-16095");
		JLabel nombre3 = new JLabel("Rafael de Jesús Sandoval González 0907-19-14119");
		JButton aceptar = new JButton("Aceptar");
		
		
			
		
		
		setLayout(null);
		setBounds(1200, 600, 380, 200);
		setResizable(false);
		setTitle("Cuarto Avizo");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Image icono = mipantalla.getImage("src/calculadora/Cheems.png");
		setIconImage(icono);
		
		add(nombre1);//LABEL 
		nombre1.setBounds(15, 20, 500, 15);
		nombre1.setForeground(new Color(36, 149, 150));
		nombre1.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(nombre2);//LABEL 
		nombre2.setBounds(23, 40, 500, 15);
		nombre2.setForeground(new Color(36, 149, 150));
		nombre2.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(nombre3);//LABEL 
		nombre3.setBounds(13, 60, 500, 15);
		nombre3.setForeground(new Color(36, 149, 150));
		nombre3.setFont(new Font ("verdana", Font.BOLD, 12));
		
		add(aceptar);//BOTON
		aceptar.setBounds(143, 120, 90, 25);
		aceptar.setFont(new Font ("HP Simplified", Font.BOLD, 12));
		aceptar.setForeground(Color.WHITE);
		aceptar.setBackground(new Color(32, 150, 133));
		aceptar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dispose();
        }
});
		
	}
}