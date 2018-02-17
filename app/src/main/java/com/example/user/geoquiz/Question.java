package com.example.user.geoquiz;

/**
 * Created by User on 28.10.2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean isCheater;

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        isCheater = false;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isCheater() { return isCheater; }

    public void setCheater(boolean cheater) { isCheater = cheater; }
}
