package model;

import model.instrument.BrassInstrument;
import model.instrument.StringInstrument;
import java.util.ArrayList;


public class Orchestra {

    private ArrayList<BrassInstrument> brassInstruments = new ArrayList<>();
    private ArrayList<StringInstrument> stringInstruments = new ArrayList<>();

    public Orchestra(ArrayList<BrassInstrument> brassInstruments, ArrayList<StringInstrument> stringInstruments) {
        this.brassInstruments = brassInstruments;
        this.stringInstruments = stringInstruments;
    }
}
