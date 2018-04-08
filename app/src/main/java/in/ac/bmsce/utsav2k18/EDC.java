package in.ac.bmsce.utsav2k18;

public class EDC {

    private int id;
    private String edcName;//

    public EDC(int id, String edcName) {
        this.id = id;
        this.edcName = edcName;
    }

    public EDC(String edcName) {
        this.edcName = edcName;
    }

    public EDC() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getEDCName() {
        return edcName;
    }//

}

