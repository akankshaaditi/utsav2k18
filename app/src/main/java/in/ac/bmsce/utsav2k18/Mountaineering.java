package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Mountaineering {

    private int id;
    private String mountaineeringName;

    public Mountaineering(int id, String mountaineeringName) {
        this.id = id;
        this.mountaineeringName = mountaineeringName;
    }

    public Mountaineering(String mountaineeringName) {
        this.mountaineeringName = mountaineeringName;
    }

    public Mountaineering() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getMountaineeringName() {
        return mountaineeringName;
    }

}
