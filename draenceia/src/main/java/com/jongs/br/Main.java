package com.jongs.br;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String source1 = "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/1.png";
        String source2 = "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/2.png";
        String source3 = "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/3.png";
        String source4 = "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/4.png";

        Reader reader = new Reader();
        List<String> list1 = reader.readHabilityOverral(source1, 1);
        List<String> list2 = reader.readHabilityOverral(source2, 2);
        List<String> list3 = reader.readHabilityOverral(source3, 3);
        List<String> list4 = reader.readHabilityOverral(source4, 4);

        Player nabi = new Player(list1, list2, list3, list4);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String nabiStr = gson.toJson(nabi);
        System.out.println(nabiStr);

        try (FileOutputStream fos = new FileOutputStream("draenceia/src/main/resources/tesseractDraence/jogador/Nabi/Nabi.json");
             OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8)) {
            osw.write(nabiStr);
            System.out.println("JSON salvo com sucesso no arquivo Nabi.json");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Tempo de execução: " + executionTime + " milissegundos");
    }
}

