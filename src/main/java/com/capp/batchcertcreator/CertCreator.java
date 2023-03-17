package com.capp.batchcertcreator;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author mucahit.yilmaz
 */
public class CertCreator {

    public static void main(String[] args) {
        FlatLightLaf.setUseNativeWindowDecorations(true);
        FlatLightLaf.setup();

        var frame = new JFrame("Çoklu Sertifika Oluşturma Arayüzü");
        frame.setLocationByPlatform(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(6, 6));
        var panel = new BatchCertificateCreatePanel();
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(600, 550);
        frame.setVisible(true);
    }
}
