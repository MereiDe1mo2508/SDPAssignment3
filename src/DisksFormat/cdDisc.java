package DisksFormat;

public class cdDisc implements Disc {
    @Override
    public void setMemory() {
        System.out.println("700 MB");
    }
    @Override
    public void function() {
        System.out.println("is putting CD disk. It plays the music from popular group Beatles");
    }
}
