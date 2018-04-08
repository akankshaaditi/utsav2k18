package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Literature {

    private int id;
    private String literatureName;

    public Literature(int id, String literatureName) {
        this.id = id;
        this.literatureName = literatureName;
    }

    public Literature(String literatureName) {
        this.literatureName = literatureName;
    }

    public Literature() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getLiteratureName() {
        return literatureName;
    }

}
