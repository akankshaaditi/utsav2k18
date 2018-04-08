package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Game {

    private int id;
    private String gameName;

    public Game(int id, String gameName) {
        this.id = id;
        this.gameName = gameName;
    }

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public Game() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getGameName() {
        return gameName;
    }

}
