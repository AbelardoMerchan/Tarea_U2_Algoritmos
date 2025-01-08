package gestor;
import java.util.Stack;

import javax.swing.plaf.synth.SynthScrollBarUI;

import java.util.Queue;
import java.util.LinkedList;

public class GestorDeTareas {
   private Stack<Tarea> tareasPendientes = new Stack<>();
   private Queue<Tarea> tareasCompletadas = new LinkedList<>();
   private int contadorId = 1;  //Asigna un ID único a cada tarea
   
   public void agregarTarea(String descripcion) {
	   Tarea tarea = new Tarea (contadorId++, descripcion);
	   tareasPendientes.push(tarea);
	   System.out.println("Tarea agregada: " + tarea);
   }
   
   public void marcarComoCompletada() {
	   if (!tareasPendientes.isEmpty()) {
		   Tarea tareaCompletada = tareasPendientes.pop();
		   tareasCompletadas.add(tareaCompletada);
		   System.out.println("Tarea completada:" + tareaCompletada);
		   }
	   else {
		   System.out.println("No hay tareas pendientes.");
	   }
   }
   
   public void eliminarTarea(int id) {
	   boolean encontrada = false;
		   Stack<Tarea> temp = new Stack<>();
		   while (!tareasPendientes.isEmpty()) {
			   Tarea tarea = tareasPendientes.pop();
			   if (tarea.getId() == id) {
			   encontrada = true;
			   System.out.println("Tarea eliminada: " + tarea);
		       } 
			   else {
			   temp.push(tarea);
		   }
   }
   while (!temp.isEmpty()) {
	   tareasPendientes.push(temp.pop());
   }
   if (!encontrada) {
	System.out.println("Tarea no encontrada.");   
      }
   }
   
   public void verTareasPendientes() {
	   if (tareasPendientes.isEmpty()) {
		   System.out.println("No hay tareas pendientes.");
	   } 
	   else {
		   System.out.println("Tareas pendientes:");
		   for (Tarea tarea : tareasPendientes) {
			   System.out.println(tarea);
		   }
	   }
   }
   
   public String verProximaTarea() {
	    if (!tareasPendientes.isEmpty()) {
	        return tareasPendientes.peek().getDescripcion(); // Devuelve la descripción de la tarea en la cima
	    } else {
	        return null; // Si no hay tareas pendientes, devuelve null
	    }
	}
}
