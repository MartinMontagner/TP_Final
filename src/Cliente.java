public class Cliente {
    private String nombre;
    private String apellido;
    private Integer idCliente;

    private String telefono;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, String apellido, Integer idCliente, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCliente = idCliente;
        this.telefono = telefono;
    }
    
}
