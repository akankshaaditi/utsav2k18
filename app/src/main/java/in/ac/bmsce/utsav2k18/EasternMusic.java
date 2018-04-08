package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class EasternMusic {

    private int id;
    private String easternMusicName;

    public EasternMusic(int id, String easternMusicName) {
        this.id = id;
        this.easternMusicName = easternMusicName;
    }

    public EasternMusic(String easternMusicName) {
        this.easternMusicName = easternMusicName;
    }

    public EasternMusic() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEasternMusicName() {
        return easternMusicName;
    }

}
