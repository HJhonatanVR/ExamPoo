package entities;

public class Items {
    int id;
    String nombre;
    String categoria;
    int precio;
    String familia;


    public Items() {
    }
    public Items(String nombre) {
        this.nombre=nombre;
    }
    public Items(String nombre, int precio) {
        this.nombre=nombre;
        this.precio=precio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    
    
}
