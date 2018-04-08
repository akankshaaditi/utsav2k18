package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Dance {

    private int id;
    private String danceName;

    public Dance(int id, String danceName) {
        this.id = id;
        this.danceName = danceName;
    }

    public Dance(String danceName) {
        this.danceName = danceName;
    }

    public Dance() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDanceName() {
        return danceName;
    }

}
