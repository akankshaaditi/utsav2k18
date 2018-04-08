package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class WesternMusic {

    private int id;
    private String westernMusicName;

    public WesternMusic(int id, String westernMusicName) {
        this.id = id;
        this.westernMusicName = westernMusicName;
    }

    public WesternMusic(String westernMusicName) {
        this.westernMusicName = westernMusicName;
    }

    public WesternMusic() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getWesternMusicName() {
        return westernMusicName;
    }

}
