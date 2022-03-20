package main;

public class Controlador {
	Vista vista= new Vista();
	
public Controlador()  {
	seteaLogicaChecks();
	vista.nuevoCliente.item.addActionListener(e->habilitaCliente());
	vista.nuevoProducto.item.addActionListener(e->habilitaProducto());
	vista.nuevoServicio.item.addActionListener(e->habilitaServicio());
	
	}
public void habilitaCliente() {
	Cliente cliente = new Cliente(true);
}

public void habilitaServicio() {
	Servicio servicio = new Servicio(true);
}

public void habilitaProducto() {
	Producto producto = new Producto(true);
}
public void seteaLogicaChecks() {
	vista.check1.check.addActionListener(e->cambiaCheck());
	vista.check2.check.addActionListener(e->cambiaCheck2());
}
public void cambiaCheck() {
	
	if(vista.check2.check.isSelected()) {		
	vista.check2.check.setSelected(false);
	vista.check1.check.setSelected(true);
	cambiaModo();

	}
	else {
		vista.check2.check.setSelected(true);
		vista.check1.check.setSelected(false);
		cambiaModo2();

	}
}

public void cambiaCheck2() {
	
	if(vista.check1.check.isSelected()) {		
	vista.check2.check.setSelected(true);
	vista.check1.check.setSelected(false);

	cambiaModo2();

	}
	else {
		vista.check2.check.setSelected(false);
	vista.check1.check.setSelected(true);
	
	cambiaModo();

	}}

public void cambiaModo2() {
	
	vista.txtNombre.txt.setText("Razon Social");
	vista.txtApellido.txt.setText("CUIT");
	vista.DNI.txt.setText("Fecha inicio de actividad");
	
	vista.inputNombre.campoTexto.setText("");
	vista.inputApellido.campoTexto.setText("");
	vista.inputDni.campoTexto.setText("");
	
	vista.inputDni.campoTexto.setVisible(false);
	vista.fecha.txtDate.setVisible(true);
	vista.fecha.txtDate.setText("20/3/2022");
	vista.txtNombre.txt.setBounds(10, 50, 90, 35);
	vista.txtApellido.txt.setBounds(100, 50, 70, 35);
}
public void cambiaModo() {

	vista.txtNombre.txt.setText("Nombre");
	vista.txtApellido.txt.setText("Apellido");
	vista.DNI.txt.setText("DNI");
	
	vista.inputNombre.campoTexto.setText("");
	vista.inputApellido.campoTexto.setText("");
	vista.inputDni.campoTexto.setText("");	
	vista.fecha.txtDate.setText("");
	vista.inputDni.campoTexto.setVisible(true);
	vista.fecha.txtDate.setVisible(false);
	
	vista.txtNombre.txt.setBounds(10, 50, 70, 35);
	vista.txtApellido.txt.setBounds(80, 50, 70, 35);


}
	public static void main(String[] args){
		Controlador c = new Controlador();
	}
}
