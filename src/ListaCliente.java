import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCliente {

    private List<Cliente> listaDeClientes;

    public ListaCliente() {
        this.listaDeClientes = new ArrayList<>();
    }


    public ListaCliente(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    public List<Cliente> getListaDeClientes() {
        return listaDeClientes;
    }

    public void setListaDeClientes(List<Cliente> listaDeClientes) {
        this.listaDeClientes = listaDeClientes;
    }

    @Override
    public String toString() {
        return "ListaCliente{" +
                "listaDeClientes=" + listaDeClientes +
                '}';
    }

    public void agregarClientesALaLista() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while(flag)
        {
            System.out.print("Ingrese el nombre del cliente: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el apellido del cliente: ");
            String apellido = scanner.nextLine();
            System.out.print("Ingrese el telofono del cliente: ");
            String telefono = scanner.nextLine();

            Cliente x = new Cliente(nombre,apellido,telefono);

            this.listaDeClientes.add(x);

            System.out.print("¿Desea agregar otro cliente? (Si / No): ");
            String respuesta = scanner.nextLine();
            flag = respuesta.equalsIgnoreCase("Si");
        }
    }

    public Boolean eliminaClientesDeLaLista()
    {
        Scanner scanner = new Scanner(System.in);
        boolean flagSeguir = true;
        boolean flagEliminar = true;

        while(flagSeguir)
        {
            Cliente x = buscarCliente();

            if (this.listaDeClientes.remove(x))
            {
                flagEliminar = true;

            }else {flagEliminar=false;}

            System.out.print("¿Desea eliminar otro cliente? (Si / No): ");
            String respuesta = scanner.nextLine();
            flagSeguir = respuesta.equalsIgnoreCase("Si");
        }
        return flagEliminar;
    }

    public Cliente buscarCliente() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente a buscar: ");
        String nombre = scanner.nextLine();

        for (Cliente cliente : listaDeClientes)
        {
            if (cliente.getNombre().equalsIgnoreCase(nombre))
            {
                return cliente;
            }
        }
        return null;
    }

    public void mostrarListaClientes() {
        for (Cliente i : listaDeClientes) {
            System.out.println(i.toString());
        }
    }


}
