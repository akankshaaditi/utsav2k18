package in.ac.bmsce.utsav2k18;

public class Photography {

    private int id;
    private String photographyName;//

    public Photography(int id, String photographyName) {//
        this.id = id;
        this.photographyName = photographyName;//
    }

    public Photography(String photographyName) {
        this.photographyName = photographyName;
    }//

    public Photography() {//
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPhotographyName() {
        return photographyName;
    }//

}