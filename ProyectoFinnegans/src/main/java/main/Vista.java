package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
public class Vista extends Modelo{
	JFrame jframe = new JFrame();
	Lista lista1= new Lista(jframe, 10,140,100,100);
	Lista lista2= new Lista(jframe, 110,140,40,100);
	Lista lista3= new Lista(jframe, 150,140,65,100);
	
	Lista lista4= new Lista(jframe, 10,270,100,100);
	Lista lista5= new Lista(jframe, 110,270,40,100);
	Lista lista6= new Lista(jframe, 150,270,65,100);
	
	Lista lista7= new Lista(jframe, 295,140,80,231);
	
	Lista lista8= new Lista(jframe, 375,140,55,231);
	
	
	Input inputNombre = new Input(jframe,10,80,60,25);
	Input inputApellido = new Input(jframe,80,80,60,25);
	Input inputDni = new Input(jframe,150,80,80,25);
	
	
	LocalDate FechaActual = LocalDate.now(); 
	Fecha fecha = new Fecha(jframe,150,80,80,25,"dd/mm/yyyy");
	
	Label txtFecha = new Label(jframe, FechaActual.toString(),360,50,80,30);
	Label txtNombre= new Label(jframe, "Nombre: ", 10, 50, 70, 35);
	Label txtApellido= new Label(jframe, "Apellido: ", 80, 50, 70, 35);
	Label  DNI = new Label(jframe, "DNI: ", 150, 50, 150, 35);
	Label  txtProducto = new Label(jframe, "Producto: ", 10, 110, 100, 35);
	Label  txtServicio = new Label(jframe, "Servicio: ", 10, 240, 100, 35);
	
	Label  precioProducto = new Label(jframe, "$", 120, 110, 30, 35);
	Label  precioServicio = new Label(jframe, "$", 120, 240, 30, 35);
	
	Label txtGarantia = new Label(jframe, "Garantia", 150, 110, 100, 35);
	Label  txtServicioExtra = new Label(jframe, "Extra", 150, 240, 100, 35);
	
	Label servicioActivo = new Label(jframe,"Usuario sin servicio activo",10,380,200,30);
	
	Label txtPedidos = new Label(jframe, "Pedidos", 300, 110, 100, 35);
	Label  txtTotal = new Label(jframe, "Total", 380, 110, 100, 35);
	
	
	BarraMenu menu = new BarraMenu(jframe);
	SeccionMenu archivo= new SeccionMenu(menu.barraMenu,"Cliente");
	ItemMenu nuevoCliente = new ItemMenu(archivo.menu, "Nuevo Cliente");
	ItemMenu buscarCliente = new ItemMenu(archivo.menu, "Buscar Cliente");
	ItemMenu removerCliente = new ItemMenu(archivo.menu, "Remover Cliente");
	
	SeccionMenu seccionProducto= new SeccionMenu(menu.barraMenu,"Producto");
	ItemMenu nuevoProducto = new ItemMenu(seccionProducto.menu, "Nuevo producto");
	ItemMenu removerProducto = new ItemMenu(seccionProducto.menu, "Buscar producto");
	ItemMenu modificarProducto = new ItemMenu(seccionProducto.menu, "Remover producto");
	
	SeccionMenu seccionServicio= new SeccionMenu(menu.barraMenu,"Servicio");
	ItemMenu nuevoServicio = new ItemMenu(seccionServicio.menu, "Nuevo servicio");
	ItemMenu removerServicio = new ItemMenu(seccionServicio.menu, "Buscar servicio");
	ItemMenu modificarServicio = new ItemMenu(seccionServicio.menu, "Remover servicio");
	
	Boton Agregar = new Boton(jframe, "Enviar", 10, 0, 100, 35);
	Boton Modificar = new Boton(jframe,"Modificar",115,0,100,35);
	Boton Remover = new Boton(jframe,"Actualizar",220,0,100,35);
	Boton Actualizar = new Boton(jframe,"Remover",325,0,100,35);
	
	Boton enviarProducto = new Boton(jframe,"=>",230,140,50,35);
	Boton enviarServicio = new Boton(jframe,"=>",230,270,50,35);
	
	
	CheckBox check1 = new CheckBox(jframe,"Persona Fisica",230,80,100,25,true);
	
	CheckBox check2 = new CheckBox(jframe,"Persona Juridica",330,80,120,25,false);

	

	public Vista(){
		
		jframe.getContentPane().setBackground(Color.WHITE);
		jframe.setBounds(0, 0, 465, 500);
		jframe.setLayout(null);
		jframe.setVisible(true);
		jframe.setTitle("Controlador de Querys");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(true);
		
	}}
	
	


	