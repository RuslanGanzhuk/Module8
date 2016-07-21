import goitOnline3.module8.TestJFrame;

import javax.swing.*;

public class Runner {

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    new TestJFrame();
                }
            });
        }
    }

