package DiscDevices;

import DiscsFormat.Disc;

public abstract class discPlayer {
    protected String version;
    protected Disc disc;
    public discPlayer(String version){
        this.version = version;
    }
    public void setDisc(Disc disc) {
        this.disc = disc;
    }
    public abstract void usePlayer();
}
