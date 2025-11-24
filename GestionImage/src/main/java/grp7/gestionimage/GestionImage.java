/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grp7.gestionimage;

import java.io.IOException;

/**
 *
 * @author vdufo
 */
public class GestionImage {

    public static void main(String[] args) throws IOException {
        Image img = new Image();
        String txtFilePath;
        
        txtFilePath="C:\\Users\\rapha\\Desktop\\INFOSI\\MEDEV\\ImagesTestPGM\\ImagesTestPGM\\baboon.pgm";
        img.lireImage(txtFilePath);
        System.out.println(img);
        img.ecritureImage();
    }
}
