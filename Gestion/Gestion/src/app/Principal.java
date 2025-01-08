package app;

import java.util.Scanner;

import gestor.GestorDeTareas;
	
public class Principal {
	public static void main (String[] args) {
		GestorDeTareas gestor = new GestorDeTareas();
		Scanner teclado = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("\nGestión de Tareas:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Ver tareas pendientes");
            System.out.println("5. Ver próxima tarea");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer
            
           switch (opcion) {
           case 1:
        	   System.out.println("Ingrese la descripción de la tarea a realizar");
        	   String descripcion = teclado.nextLine();
        	   gestor.agregarTarea(descripcion);
        	   break;
           case 2:
        	   gestor.marcarComoCompletada();
        	   break;
           case 3:
        	   System.out.println("Ingrese el ID de la tarea a eliminar");
        	   int id = teclado.nextInt();
        	   gestor.eliminarTarea(id);
        	   break;
           case 4:
        	   gestor.verTareasPendientes();
        	   break;
           case 5:
        	   System.out.println("Próxima tarea: " + gestor.verProximaTarea());
        	   break;
           case 6:
        	   System.out.println("Saliendo del sistema...");
        	   break;
           default:
        		   System.out.println("Opción Inválida");
           } 
		} while (opcion != 6);
		
		teclado.close();
	}
}