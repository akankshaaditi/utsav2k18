package in.ac.bmsce.utsav2k18;

/**
 * Created by DELL on 17-03-2018.
 */

public class KannadaSangha {

        private int id;
        private String kannadaSanghaName;//

        public KannadaSangha(int id, String kannadaSanghaName) {//
            this.id = id;
            this.kannadaSanghaName = kannadaSanghaName;//
        }

        public KannadaSangha(String kannadaSanghaName) {
            this.kannadaSanghaName = kannadaSanghaName;
        }//

        public KannadaSangha() {//
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public String getkannadaSanghaName() {
            return kannadaSanghaName;
        }//

    }


