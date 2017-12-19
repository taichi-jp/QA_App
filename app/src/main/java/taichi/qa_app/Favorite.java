package taichi.qa_app;

import java.io.Serializable;
import java.util.ArrayList;

public class Favorite implements Serializable {
    private String mUid;
    private ArrayList<Question> mQuestionArrayList;

    public String getUid() {
        return mUid;
    }

    public ArrayList<Question> getQuestions() {
        return mQuestionArrayList;
    }

    public Favorite(String uid, ArrayList<Question> questions) {
        mUid = uid;
        mQuestionArrayList = questions;
    }
}
