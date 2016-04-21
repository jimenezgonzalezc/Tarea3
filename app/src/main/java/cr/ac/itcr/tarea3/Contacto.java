package cr.ac.itcr.tarea3;

/**
 * Created by car_e on 4/20/2016.
 */
public class Contacto {

    private String id;
    private String numero;
    private String nombre;
    private String tipo;

    public Contacto() {}

    public Contacto(String id, String nombre, String numero, String tipo) {
        this.id = id;
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}
