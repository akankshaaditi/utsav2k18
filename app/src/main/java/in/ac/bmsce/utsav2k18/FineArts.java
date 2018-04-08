package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class FineArts {

    private int id;
    private String fineArtsName;

    public FineArts(int id, String fineArtsName) {
        this.id = id;
        this.fineArtsName = fineArtsName;
    }

    public FineArts(String fineArtsName) {
        this.fineArtsName = fineArtsName;
    }

    public FineArts() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getFineArtsName() {
        return fineArtsName;
    }

}
