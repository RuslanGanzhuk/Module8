package goit.module8;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class TestFrame extends JFrame {

    static int i = 0;

    public TestFrame() {

        super("Тестовое окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<MusicInstrument> musicInstruments = new ArrayList<MusicInstrument>();

        for (int i = 0; i < 30; i++) {
            musicInstruments.add(new MusicInstrument("Name" + i, "Size" + i, "Color" + i));
        }

        MyTableModel model = new MyTableModel(musicInstruments);
        JTable table = new JTable(model);

        getContentPane().add(new JScrollPane(table));

        setPreferredSize(new Dimension(260, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
