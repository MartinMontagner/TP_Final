import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Scanner;

public class ArchivoJsonGenericos<T> {

    private final Gson gson;
    private T tipo;


    public ArchivoJsonGenericos(T tipo)
    {
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.tipo = tipo;
    }

    public void escribirArchivo(T tipo) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del archivo a escribir: ");
        String archivoAEscribir = scanner.nextLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoAEscribir + ".json"));

        gson.toJson(tipo, tipo.getClass(), bufferedWriter);
        bufferedWriter.close();
    }

//    public void leerArchivo (T tipo) throws  IOException
//    {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese el nombre del archivo que quiere leer: ");
//        String archivoAEscribir = scanner.nextLine();
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(archivoAEscribir + ".json"));
//
//        T objeto =  gson.fromJson( bufferedReader, tipo.getClass());
//
//        System.out.println(objeto);
//    }todo anda mal nose como hacerlo faltaria un escribir en el archivo sin sobreescribir no me acuerdo como era
}
