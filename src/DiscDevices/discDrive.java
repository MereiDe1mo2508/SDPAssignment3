package DiscDevices;

public abstract class discDrive extends diskPlayer {
    public discDrive(){
        super("1.02 disc player");
    }
    @Override
    public void usePlayer() {
        System.out.print(version);
        this.disc.setMemory();
        this.disc.function();
    }
}
