package DiscDevices;

public class discDrive extends discPlayer {
    public discDrive(){
        super("1.02 disc player");
    }
    @Override
    public void usePlayer() {
        System.out.print(version);
        this.disc.setMemory();
        this.disc.play();
    }
}
