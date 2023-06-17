package Model;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class ClientesDatabase {

    private ArrayList<Cliente> listaClientes;

    public ClientesDatabase() {
        listaClientes = new ArrayList<>();
    }

    // agrega cliente a collection
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    // guarda cliente a database
    public void guardarCliente(File file) {
        try {
            // modelo cliente
            Cliente cliente;
            String save_data = "";

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            int i = 0;
            while( i < listaClientes.size()) {
                cliente = listaClientes.get(i);
                Gson gson = new Gson();
                save_data = gson.toJson(cliente);
                i++;
            }
            bufferedWriter.write(save_data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // lee cliente de database
    public Object[] cargaCliente(File file) {
        Object[] objects;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            // each lines to array
            objects = bufferedReader.lines().toArray();
            bufferedReader.close();
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}