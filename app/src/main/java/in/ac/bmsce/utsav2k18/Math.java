package in.ac.bmsce.utsav2k18;

/**
 * Created by DELL on 17-03-2018.
 */

public class Math {
    
    private int id;
        private String mathName;//

        public Math(int id, String mathName) {//
            this.id = id;
            this.mathName = mathName;//
        }

        public Math(String mathName) {
            this.mathName = mathName;
        }//

        public Math() {//
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getMathName() {
            return mathName;
        }//

}
