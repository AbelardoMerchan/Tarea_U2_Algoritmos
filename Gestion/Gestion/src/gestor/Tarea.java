package gestor;

public class Tarea {
private int id;
private String descripcion;

public Tarea (int id, String descripcion) {
	this.id = id;
	this.descripcion = descripcion;
}

public int getId() {
	return id;
}

public String getDescripcion() {
	return descripcion;
}

@Override
public String toString() {
	return "Tarea [ID= " + id + ", Descripcion= " + descripcion + "]";
   }	
}
