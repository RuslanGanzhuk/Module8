package goit;

import goit.module8.TestFrame;

import javax.swing.JFrame;

public class Runner {
    public static void main (String[] arg) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TestFrame();
            }
        });
    }
}





