package com.example.dsantiago.geoquiz;

/**
 * Created by dsantiago on 6/11/2015.
 */

    public class TrueFalse {

    private int mQuestion;

    public int getmQuestion() {
        return mQuestion;
    }

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }


    public boolean ismTrueQuestion() {
        return mTrueQuestion;
    }

    private boolean mTrueQuestion;

    public void setmTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }



    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

}
