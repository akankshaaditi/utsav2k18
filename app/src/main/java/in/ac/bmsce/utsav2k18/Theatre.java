package in.ac.bmsce.utsav2k18;

/**
 * Created by DELL on 17-03-2018.
 */

public class Theatre {
    
    private int id;
        private String theatreName;//

        public Theatre(int id, String theatreName) {//
            this.id = id;
            this.theatreName = theatreName;//
        }

        public Theatre(String theatreName) {
            this.theatreName = theatreName;
        }//

        public Theatre() {//
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getTheatreName() {
            return theatreName;
        }//

}

