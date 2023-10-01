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
        switch (page) {
            case 1:
                
                break;
            case 2:
                x = 310;
                y = 55;
                width = 30;
                height = 30;
                for(int i = 0; i < 17; i++){
                    Rectangle rec = new Rectangle(x, y, width, height);
                    String result = tesseract.doOCR(image, rec);
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
                String result;
                Rectangle rec = new Rectangle(x, y, width, height);
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
            case 4:
                
                break;
            default:
                break;
        }
        return list;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

}