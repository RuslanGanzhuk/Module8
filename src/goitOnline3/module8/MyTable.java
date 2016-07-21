package goitOnline3.module8;


import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyTable implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();
    private final ArrayList<MusicInstrument> musicInstruments;

    public MyTable(ArrayList<MusicInstrument> musicInstruments) {
        this.musicInstruments = musicInstruments;
    }

    @Override
    public void addTableModelListener(TableModelListener listener) {
        listeners.add(listener);
    }

    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    @Override
    public int getRowCount() {
        return musicInstruments.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Name";
            case 1:
                return "Price";
            case 2:
                return "Color";
            case 3:
                return "Description";
        }

        return " ";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MusicInstrument musicInstrument = musicInstruments.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return musicInstrument.getName();
            case 1:
                return musicInstrument.getPrice();
            case 2:
                return musicInstrument.getColor();
            case 3:
                return musicInstrument.getDescription();
        }
        return " ";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }
}
