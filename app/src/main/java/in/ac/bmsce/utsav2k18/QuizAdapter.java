package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class QuizAdapter extends BaseAdapter {

    private ArrayList<Quiz> quizList;
    private Context context;
    private LayoutInflater inflater;

    public QuizAdapter(Context context, ArrayList<Quiz> quizList){
        this.context = context;
        this.quizList = quizList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return quizList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.quiz_r, parent, false);

        TextView tvQuiz = convertView.findViewById(R.id.tvQuiz);

        Quiz quiz = quizList.get(position);

        tvQuiz.setText(quiz.getQuizName());

        return convertView;
    }

}