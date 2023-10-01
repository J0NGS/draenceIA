package com.jongs.br;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        String source = "draenceia/src/main/resources/tesseractDraence/jogador/3.png";
        List<String> list = reader.readHabilityOverral(source, 3);
        for(String stg:list){
            System.out.println(stg);
        }
    }
}
