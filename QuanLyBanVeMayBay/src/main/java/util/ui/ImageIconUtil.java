/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.ui;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author HAO
 */
public class ImageIconUtil {
    public static ImageIcon ResizeImage(String imgPath, int width, int height) {
        ImageIcon myIcon = new ImageIcon(imgPath);
        Image img = myIcon.getImage();
        Image newImg;

        newImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newImg);
        return imageIcon;
    }
}
