package DiscDevices;

public abstract class dvdPlayer extends diskPlayer {
    public dvdPlayer() {
        super("Windows 10");
    }
    @Override
    public void usePlayer() {
        System.out.print(version);
        this.disc.setMemory();
        this.disc.function();
    }
}
