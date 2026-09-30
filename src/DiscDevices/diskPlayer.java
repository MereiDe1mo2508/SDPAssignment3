package DiscDevices;

import DisksFormat.Disc;

public abstract class diskPlayer {
    protected String version;
    protected Disc disc;
    public diskPlayer(String version){
        this.version = version;
    }
    public setDisc(Disc disc) {
        this.disc = disc;
    }
    public abstract void usePlayer();
}
