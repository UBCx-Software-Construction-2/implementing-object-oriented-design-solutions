package model.instrument;

import model.Orchestra;

public abstract class BrassInstrument implements Instrument {

    private Orchestra orchestra;

    public BrassInstrument(Orchestra orchestra) {
        this.orchestra = orchestra;
    }
}
