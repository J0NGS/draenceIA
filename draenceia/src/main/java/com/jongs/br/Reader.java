package com.jongs.br;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


import java.awt.Rectangle;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Reader {
    private ITesseract tesseract;
    
    public Reader(){
        this.tesseract = new Tesseract();
        tesseract.setLanguage("por");
        tesseract.setDatapath("draenceia/src/main/resources/Tesseract/tessdata");
    }

    public List<String> readHabilityOverral(String source, Integer page){
        try {
        File image = new File(source);
        List<String> list = new ArrayList<>();
        int x, y, width, height;
        String result;
        Rectangle rec = new Rectangle();
        switch (page) {
            case 1:
                tesseract.setLanguage("por");
                //Lendo o nome do  jogador
                x = 810;
                y = 215;
                width = 300;    
                height = 35;
                rec = new Rectangle(x, y, width, height);

                // Realize a leitura usando o Tesseract na nova imagem recortada
                result = tesseract.doOCR(image, rec);

                result = result.replaceAll("\\s+", "");
                list.add(result);
                
                
                // Lendo a posição do jogador
                x = 905;
                y = 280;
                width = 60;
                height = 25;   
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                result = result.replaceAll("[^a-zA-Z]", "");
                list.add(result);
                
                // Lendo over
                x = 890;
                y = 310;
                width = 100;
                height = 65;   
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                list.add(result);
                
                //Lendo informações básicas da primeira página
                x = 1200;
                y = 565;
                width = 150;
                height = 45;
                for(int i = 0; i < 3; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("[^a-zA-Z0-9áéíóúÁÉÍÓÚâêôîûÂÊÎÔÛãõÃÕàÀ]", "");
                    result = result.replaceAll("[?!]", "");
                    list.add(result);
                    y+=45;     
                }
                break;
            case 2:
                tesseract.setLanguage("por");
                x = 1260;
                y = 205;
                width = 52;
                height = 45;
                for(int i = 0; i < 17; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("\\D+", "");
                    list.add(result);
                    y += 45;
                }
                break;
            case 3:
                tesseract.setLanguage("eng");
                x = 1260;
                y = 205;
                width = 52;
                height = 45;
                for(int i = 0; i < 13; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("\\D+", "");
                    list.add(result);
                    y += 45;
                }
                tesseract.setLanguage("por");
                x = 1240;   
                width = 90;
                for(int i = 0; i < 2; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("\\s+", "");
                    result = result.replaceAll("\\D", "");
                    list.add(result);
                    y += 45;
                }
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                list.add(result);
                break;
            case 4:
                tesseract.setLanguage("por");
                x = 820;
                y = 250;
                width = 500;
                height = 45;
                for(int i = 0; i < 11; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    if(result.equals("")){
                        result = result.replaceAll("", "-");
                    }
                    result = result.replaceAll("\\n", "");
                    list.add(result);
                    y+=45;
                }
                y = 745;
                for(int i = 0; i < 5; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    if(result.equals(""))
                        result = result.replaceAll("", "-");
                    result = result.replaceAll("\\n", "");
                    list.add(result);
                    y+=45;
                }
                break;
        }
        return list;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

}