import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pila pilaObjeto = new Pila(2);

        String menu = " ";
		String[] optionsMenu = {"Insertar un dato", "Quitar un dato", "Verificar si esta vacia", "Verificar si esta llena","Mostrar cima", "Vaciar", "Ver tamano"};
		
		while(menu != "Salir") {
            menu = (String) JOptionPane.showInputDialog(null, "Elige una opcion del menu",
			        "Menu", JOptionPane.QUESTION_MESSAGE, null, optionsMenu, optionsMenu[0]);
			
			if(menu == null)
				menu = "Salir";
			
			switch(menu) {
			
			case "Insertar un dato":
                int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Escribe el dato a ingresar a la pila"));
                pilaObjeto.insertar(dato);
				break;
			
			case "Quitar un dato":
                int datoBorrado = pilaObjeto.quitar();
				if (datoBorrado == 0)
					JOptionPane.showMessageDialog(null, "No se logro borrar ningun dato, porque esta vacia");
                else
                    JOptionPane.showMessageDialog(null, "El dato borrado fue: "+datoBorrado);
				break;
				
			case "Verificar si esta vacia":
                pilaObjeto.vacia();
				break;

			case "Verificar si esta llena":
                pilaObjeto.llena();
				break;
				
			case "Mostrar cima":
				int cimaPila = pilaObjeto.mostrarCima();
                if (cimaPila == 0)
				JOptionPane.showMessageDialog(null, "No hay ningun dato");
                else
                    JOptionPane.showMessageDialog(null, "La cima de la pila es: "+cimaPila);
				break;
				
			case "Vaciar":
				pilaObjeto.vaciar();
				break;
				
			case "Ver tamano":
				JOptionPane.showMessageDialog(null, "El tamano de la pila es: "+pilaObjeto.tamano());
				break;
				
			case "Salir": // Mensaje despedida
				System.out.println("Decidiste salir del programa, hasta pronto!.");
				break;
			}
        }
    }
}
