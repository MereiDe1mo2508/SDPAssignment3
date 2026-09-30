package DiscsFormat;

public class dvdDisc implements Disc {
    @Override
    public void setMemory() {
        System.out.println("8.5 GB");
    }
    @Override
    public void play() {
        System.out.println("is putting DVD disc. It plays a documentary video about cosmos");
    }
}
