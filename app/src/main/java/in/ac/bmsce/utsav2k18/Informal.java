package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Informal {

    private int id;
    private String informalName;

    public Informal(int id, String informalName) {
        this.id = id;
        this.informalName = informalName;
    }

    public Informal(String informalName) {
        this.informalName = informalName;
    }

    public Informal() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getInformalName() {
        return informalName;
    }

}
