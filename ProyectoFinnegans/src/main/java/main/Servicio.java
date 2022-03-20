package main;

import java.awt.Color;

import javax.swing.JFrame;

import main.Modelo.Boton;
import main.Modelo.Input;
import main.Modelo.Label;
import main.Modelo.Lista;

public class Servicio extends Modelo{
JFrame jframe;
	
	Lista productos;
	Lista precioProductos;
	
	Boton agregar;
	Boton modificar;
	Boton remover;
	
	Input input;
	Input inputPrecio;
	
	Label txtProducto;
	Label txtPrecio;
	
	public Servicio(boolean activo) {
		jframe = new JFrame();
		 
		productos = new Lista(jframe, 10,100,100,150);
	    precioProductos = new Lista(jframe, 120,100,35,150);
	    
	    agregar = new Boton(jframe, "Agregar", 10, 0, 100, 35);
	    remover = new Boton(jframe,"Remover",220,0,100,35);
		modificar = new Boton(jframe,"Modificar",115,0,100,35);
		
		input = new Input(jframe,10,70,100,25);
		inputPrecio = new Input(jframe,120,70,35,25);
		
		txtProducto = new Label(jframe,"Servicio", 10,30,100,55);
		txtPrecio = new Label(jframe,"Precio", 120,30,100,55);
		
		jframe.getContentPane().setBackground(Color.WHITE);
		jframe.setBounds(0, 0, 340, 300);
		jframe.setLayout(null);
		jframe.setVisible(activo);
		jframe.setTitle("Productos");
		jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jframe.setResizable(true);
	}
}
