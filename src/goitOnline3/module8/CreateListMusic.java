package goitOnline3.module8;

import java.util.ArrayList;

public class CreateListMusic {

    public  ArrayList createInstrument() {

        ArrayList<MusicInstrument> musicInstruments = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            musicInstruments.add(new Guitar());
            musicInstruments.add(new Trumpet());
            musicInstruments.add(new Piano());
        }

        return musicInstruments;
    }
}
