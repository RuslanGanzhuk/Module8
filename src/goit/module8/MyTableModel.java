package goit.module8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class MyTableModel implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private List<MusicInstrument> musicInstruments;

    public MyTableModel(List<MusicInstrument> musicInstruments) {
         this.musicInstruments = musicInstruments;
    }

    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Name";
            case 1:
                return "Size";
            case 2:
                return "Color";
        }
        return "";
    }

    public int getRowCount() {
        return musicInstruments.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        MusicInstrument musicInstrument = musicInstruments.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return musicInstrument.getName();
            case 1:
                return musicInstrument.getSize();
            case 2:
                return musicInstrument.getColor();
        }
        return "";
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    public void setValueAt(Object value, int rowIndex, int columnIndex) {

    }


}
