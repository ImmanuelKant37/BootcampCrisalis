package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.font.TextAttribute;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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

public class Modelo {

class BarraMenu {
	JMenuBar barraMenu;

	public BarraMenu(JFrame jframe) {
		barraMenu = new JMenuBar();
		barraMenu.setBackground(Color.white);
		jframe.setJMenuBar(barraMenu);
	}
}
class SeccionMenu {
	JMenu menu;

	public SeccionMenu(JMenuBar barra, String nombreSeccion) {
		menu = new JMenu(nombreSeccion);
		barra.add(menu);
	}
}
class ItemMenu {
	JMenuItem item;

	public ItemMenu(JMenu menu, String nombreItem) {

		item = new JMenuItem(nombreItem);
		menu.add(item);
	}
}


class Boton {
	JButton btn;

	public Boton(JFrame jframe, String texto, int posx, int posy, int ancho, int alto) {
	
			btn = new JButton(texto);
			btn.setBounds(posx, posy, ancho, alto);
			btn.addActionListener(null);
			btn.setEnabled(true);
			btn.setBorderPainted(false);
			btn.setForeground(Color.WHITE);
			btn.setBackground(Color.BLACK);
			jframe.add(btn);
		}
	}

class Label {
	Font Fuente = new Font("Agency FB", Font.BOLD, 18);
	JLabel txt;
	public Label(JFrame jframe, String texto, int posx, int posy, int ancho, int alto) {
		txt = new JLabel(texto);
		txt.setBounds(posx, posy, ancho, alto);
		txt.addMouseListener(null);
		txt.setEnabled(true);
		txt.setForeground(Color.DARK_GRAY);
		txt.setFont(Fuente);
		jframe.add(txt);

		txt.setFont(Fuente);
		boolean Subrayar = false;
		if (Subrayar) {
			Font Subrayado = txt.getFont();
			Map attributes = Subrayado.getAttributes();
			attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			txt.setFont(Subrayado.deriveFont(attributes));
		}
		;
	}
}

class Fecha {
	DateFormat df;
	JFormattedTextField txtDate;
	public Fecha(JFrame jframe, int posx,int posy, int ancho, int alto, String fecha) {
		df = new SimpleDateFormat(fecha);
		 txtDate = new JFormattedTextField(df);
		txtDate.setBounds(posx, posy, ancho, alto);
		jframe.add(txtDate);
	}
}
class CheckBox {
	Font Fuente = new Font("Agency FB", Font.BOLD, 16);
	JCheckBox check;
	public CheckBox(JFrame jframe, String texto, int posx, int posy, int ancho, int alto, boolean checkeado) {
		check = new JCheckBox(texto,checkeado);
		check.setBounds(posx, posy, ancho, alto);
		check.addMouseListener(null);
		check.setEnabled(true);
		check.setBackground(Color.WHITE);
		check.setForeground(Color.DARK_GRAY);
		check.setFont(Fuente);
		jframe.add(check);

		check.setFont(Fuente);
		boolean Subrayar = false;
		if (Subrayar) {
			Font Subrayado = check.getFont();
			Map attributes = Subrayado.getAttributes();
			attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			check.setFont(Subrayado.deriveFont(attributes));
		}
		;
	}
}
class ComboBox implements ItemListener{
	  JComboBox<String> comboBox;
	  String valor=""; 
	  int index=0;
	  public ComboBox(JFrame jframe,int posx, int posy, int ancho, int alto) {
		  comboBox = new JComboBox();
		  comboBox.setBounds(posx,posy,ancho,alto);
		  jframe.add(comboBox);
		  comboBox.addItemListener(this);
	  }
	  public void agregar(String valor) {
		  comboBox.addItem(valor);
	  }
	  public void remover(String valor) {
		  comboBox.remove(index);
	  }
	public void itemStateChanged(ItemEvent e) {
		valor=comboBox.getSelectedItem().toString();
		index = comboBox.getSelectedIndex();
		System.out.println(e.getStateChange());
		System.out.println(valor);
		
	}
}

class Input {
	JTextField campoTexto = new JTextField();
	int ancho, alto, posx, posy;
	public Input(JFrame jframe, int posx, int posy, int ancho, int alto) {
		this.posx = posx;
		this.posy = posy;
		this.ancho = ancho;
		this.alto = alto;
		campoTexto.setBounds(posx, posy, ancho, alto);
		campoTexto.addKeyListener(null);
		campoTexto.setEnabled(true);
		campoTexto.setForeground(Color.BLACK);
		campoTexto.setBackground(Color.WHITE);
		jframe.add(campoTexto);
	}
}

class Lista {
	int ancho, alto, posx, posy;
	DefaultListModel<String> lista = new DefaultListModel<String>();
	JList jlist = new JList(lista);
	JScrollPane ScrollList = new JScrollPane(jlist);
	public Lista(JFrame jframe, int posx, int posy, int ancho, int alto) {
		this.posx = posx;
		this.posy = posy;
		this.ancho = ancho;
		this.alto = alto;
		Font Fuente = new Font("Agency FB", Font.BOLD, 16);
		ScrollList.setEnabled(true);
		ScrollList.setForeground(Color.DARK_GRAY);
		ScrollList.setFont(Fuente);
		ScrollList.setViewportView(jlist);
		ScrollList.setBounds(posx, posy, ancho, alto);
		jframe.add(ScrollList);
	}
}
}


