package goitOnline3.module8;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;

public class TestJFrame extends JFrame {
    static int i = 0;

    public TestJFrame (){

        super("Music Instrument");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<MusicInstrument> musicInstruments = new ArrayList<>();

        for (int i = 0; i < 30; i++){
            musicInstruments.add(new MusicInstrument("Name" + i, "Price" + i, "Color" +i, "Description" + i));
        }
        TableModel tableModel = new MyTable(musicInstruments);
        JTable table = new JTable(tableModel);
        getContentPane().add(new JScrollPane(table));

        setPreferredSize(new Dimension(500, 600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }



}
