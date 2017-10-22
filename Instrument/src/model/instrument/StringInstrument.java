package model.instrument;

import model.Orchestra;

public abstract class StringInstrument implements Instrument {

    private Orchestra orchestra;

    public StringInstrument(Orchestra orchestra) {
        this.orchestra = orchestra;
    }
}
