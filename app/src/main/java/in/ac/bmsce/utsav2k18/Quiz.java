package in.ac.bmsce.utsav2k18;

/**
 * Created by User on 17-Mar-18.
 */

public class Quiz {

    private int id;
    private String quizName;

    public Quiz(int id, String quizName) {
        this.id = id;
        this.quizName = quizName;
    }

    public Quiz(String quizName) {
        this.quizName = quizName;
    }

    public Quiz() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getQuizName() {
        return quizName;
    }

}
