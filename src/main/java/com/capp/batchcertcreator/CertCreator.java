package com.capp.batchcertcreator;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Dialog;
import javax.swing.JDialog;
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
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(6, 6));
        var panel = new BatchCertificateCreatePanel();
        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(panel.getPreferredSize().width, panel.getPreferredSize().height+50);
        frame.setVisible(true);
    }
    
    private static void openDNCreatorPanel() {
        var panel = new DNCreatorPanel();
        var dialog = new JDialog();
        dialog.setTitle("Create User Subject");
        dialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        dialog.setLayout(new BorderLayout(6, 6));
        dialog.setModal(true);
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.setSize(600, 550);
        dialog.add(panel, BorderLayout.CENTER);
        dialog.setResizable(false);
        dialog.setVisible(true);
        
        System.out.println(panel.getSubject());
    }
}
