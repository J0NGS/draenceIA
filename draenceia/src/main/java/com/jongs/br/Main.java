package com.jongs.br;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        String source = "draenceia/src/main/resources/tesseractDraence/jogador/3.png";
        List<String> list3 = reader.readHabilityOverral(source, 3);
        source = "draenceia/src/main/resources/tesseractDraence/jogador/2.png";
        List<String> list2 = reader.readHabilityOverral(source, 2);
        source = "draenceia/src/main/resources/tesseractDraence/jogador/1.png";
        List<String> list1 = reader.readHabilityOverral(source, 1);
        
        for(String stg:list1){
            System.out.println(stg);
        }
        for(String stg:list2){
            System.out.println(stg);
        }
        for(String stg:list3){
            System.out.println(stg);
        }
    }
}
