package Model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String apellido;
    private Integer idCliente;
    private static Integer totalClientes=1;

    private Integer turnosAcumulados=40;

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

    public Integer getTotalClientes() {
        return totalClientes;
    }

    public Integer getTurnosAcumulados() {
        return turnosAcumulados;
    }

    public void setTurnosAcumulados(Integer turnosAcumulados) {
        this.turnosAcumulados = turnosAcumulados;
    }

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.idCliente = totalClientes;
        totalClientes++;
    }

//    @Override
//    public String toString() {
//        return "Model.Cliente{" +
//                "nombre='" + nombre + '\'' +
//                ", apellido='" + apellido + '\'' +
//                ", idCliente=" + idCliente +
//                ", telefono='" + telefono + '\'' +
//                '}';
//    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("╔══════════════════════════════════╗\n");
        sb.append("║      Información del Model.Cliente     ║\n");
        sb.append("╟──────────────────────────────────╢\n");
        sb.append("║ Nombre: ").append(nombre).append(formatSpaces(nombre, 25)).append("║\n");
        sb.append("║ Apellido: ").append(apellido).append(formatSpaces(apellido, 23)).append("║\n");
        sb.append("║ ID Model.Cliente:").append(idCliente).append(formatSpaces(idCliente.toString(), 22)).append("║\n");
        sb.append("╚══════════════════════════════════╝\n");
        return sb.toString();
    }

    private String formatSpaces(String text, int spaces) {
        StringBuilder sb = new StringBuilder();
        int remainingSpaces = spaces - text.length();
        for (int i = 0; i < remainingSpaces; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }


}
