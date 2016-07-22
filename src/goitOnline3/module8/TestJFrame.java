package goitOnline3.module8;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;

public class TestJFrame extends JFrame {

    public TestJFrame (){

        super("Music Instrument");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CreateListMusic createListMusic = new CreateListMusic();

        TableModel tableModel = new MyTable(createListMusic.createInstrument());
        JTable table = new JTable(tableModel);
        getContentPane().add(new JScrollPane(table));

        setPreferredSize(new Dimension(500, 600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
