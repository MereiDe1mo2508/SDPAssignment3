import DiscDevices.discDrive;
import DiscDevices.discPlayer;
import DiscDevices.dvdPlayer;
import DiscsFormat.Disc;
import DiscsFormat.cdDisc;
import DiscsFormat.dvdDisc;

public class Main {
    public static void main(String[] args) {
        Disc DVDdisc = new dvdDisc();
        Disc CDdisc = new cdDisc();
        discPlayer DVDplayer = new dvdPlayer();
        discPlayer DiscDrive = new discDrive();
        DVDplayer.setDisc(DVDdisc);
        DVDplayer.usePlayer();
        DiscDrive.setDisc(CDdisc);
        DiscDrive.usePlayer();
        DVDplayer.setDisc(CDdisc);
        DVDplayer.usePlayer();
        DiscDrive.setDisc(CDdisc);
        DiscDrive.usePlayer();
    }
}