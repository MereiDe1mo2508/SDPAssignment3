package DiscDevices;

public class dvdPlayer extends discPlayer {
    public dvdPlayer() {
        super("Windows 10");
    }
    @Override
    public void usePlayer() {
        System.out.print(version);
        this.disc.setMemory();
        this.disc.play();
    }
}
