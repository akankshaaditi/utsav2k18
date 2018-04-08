package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Event {

    private int id;

    private int event_pic_id;


    public Event(int event_pic_id) {

        this.event_pic_id = event_pic_id;
    }

    public Event() {
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }


    public int getProfile_pic_id() {
        return event_pic_id;
    }
    
}
