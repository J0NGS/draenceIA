package com.jongs.br;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String[] imageSources = {
                "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/1.png",
                "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/2.png",
                "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/3.png",
                "draenceia/src/main/resources/tesseractDraence/jogador/Nabi/4.png"
        };

        ExecutorService executorService = Executors.newFixedThreadPool(imageSources.length);
        List<Future<List<String>>> futures = new ArrayList<>();

        try {
            for (int i = 0; i < imageSources.length; i++) {
                final int page = i + 1;
                String source = imageSources[i];

                futures.add(executorService.submit(() -> {
                    Reader reader = new Reader();
                    return reader.readHabilityOverral(source, page);
                }));
            }

            List<String> list1 = futures.get(0).get();
            List<String> list2 = futures.get(1).get();
            List<String> list3 = futures.get(2).get();
            List<String> list4 = futures.get(3).get();

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
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (endTime - startTime) + " milissegundos");
    }
}

