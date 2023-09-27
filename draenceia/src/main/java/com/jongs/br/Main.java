package com.jongs.br;

import java.io.File;

import java.awt.Rectangle;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class Main {
    public static void main(String[] args) {
        ITesseract tesseract = new Tesseract();
        tesseract.setLanguage("por");
        tesseract.setDatapath("draenceia/src/main/resources/Tesseract/tessdata");
        try {
            File image = new File("draenceia/src/main/resources/tesseractDraence/jogador/2.png");
            Rectangle rec = new Rectangle(310, 115, 30, 30);
            String result1 = tesseract.doOCR(image, rec);
            System.out.println(result1);
            rec = new Rectangle(0, 55, 210, 510);
            String result2 = tesseract.doOCR(image, rec);
            System.out.println(result2);

        } catch (Exception e) {
            e.getMessage();
        }
    }
}