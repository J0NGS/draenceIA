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
                x = 0;
                y = 0;
                width = 260;
                height = 35;
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                list.add(result);
                x = 71;
                y = 53;
                width = 30;
                height = 20;   
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                result = result.replaceAll("[^a-zA-Z]", "");
                list.add(result);
                x = 65;
                y = 75;
                width = 55;
                height = 45;   
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                list.add(result);
                x = 280;
                y = 215;
                width = 140;
                height = 30;
                for(int i = 0; i < 4; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("[^a-zA-Z0-9áéíóúÁÉÍÓÚâêôîûÂÊÎÔÛãõÃÕàÀ]", "");
                    result = result.replaceAll("[?!]", "");
                    list.add(result);
                    y+=30;     
                }
                break;
            case 2:
                x = 310;
                y = 55;
                width = 30;
                height = 30;
                for(int i = 0; i < 17; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("\\D+", "");
                    list.add(result);
                    y += 30;
                }
                break;
            case 3:
                //int x = 0;
                x = 310;
                y = 55;
                //int width = 270;
                width = 30;
                height = 30;
                rec = new Rectangle(x, y, width, height);
                for(int i = 0; i < 13; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("\\D+", "");
                    list.add(result);
                    y += 30;
                }
                x = 300;
                for(int i = 0; i < 2; i++){
                    rec = new Rectangle(x, y, width, height);
                    result = tesseract.doOCR(image, rec);
                    result = result.replaceAll("\\s+", "");
                    list.add(result);
                    y += 30;
                }
                x  = 310;
                rec = new Rectangle(x, y, width, height);
                result = tesseract.doOCR(image, rec);
                result = result.replaceAll("\\s+", "");
                list.add(result);
                break;
        }
        return list;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

}