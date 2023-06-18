package Model;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

public class TurnosDatabase {

    private ArrayList<Turno> listaTurnos;

    public TurnosDatabase() {
        listaTurnos = new ArrayList<>();
    }

    public void agregarTurno(Turno turno) {
        listaTurnos.add(turno);
    }

    // guarda cliente a database
    public void guardarTurno(File file) {
        try {

            Turno turno;
            String save_data = "";

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            int i = 0;
            while( i < listaTurnos.size()) {
                turno = listaTurnos.get(i);
                save_data=turno.toString();
                i++;
            }
            bufferedWriter.write(save_data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Object[] cargaTurno(File file) {
        Object[] objects;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            objects = bufferedReader.lines().toArray();
            bufferedReader.close();
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}