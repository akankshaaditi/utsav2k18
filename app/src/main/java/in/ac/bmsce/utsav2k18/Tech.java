package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Tech {

    private int id;
    private String techName;

    public Tech(int id, String techName) {
        this.id = id;
        this.techName = techName;
    }

    public Tech(String techName) {
        this.techName = techName;
    }

    public Tech() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTechName() {
        return techName;
    }

}
