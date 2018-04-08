package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Fashion {

    private int id;
    private String fashionName;

    public Fashion(int id, String fashionName) {
        this.id = id;
        this.fashionName = fashionName;
    }

    public Fashion(String fashionName) {
        this.fashionName = fashionName;
    }

    public Fashion() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFashionName() {
        return fashionName;
    }

}
