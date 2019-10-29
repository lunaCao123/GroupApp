package com.example.barbootcamp;

public class Quiz {

    private long quizID;
    private String quizName;
    private Question question1;
    private Question question2;
    private Question question3;
    private Question question4;
    private Question question5;

    public Quiz(long quizID,
                String quizName,
                Question question1,
                Question question2,
                Question question3,
                Question question4,
                Question question5) {
        this.quizID = quizID;
        this.quizName = quizName;
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
        this.question4 = question4;
        this.question5 = question5;
    }

    public long getQuizID() { return quizID; }

    public void setQuizID(long quizID) { this.quizID = quizID; }

    public String getQuizName() { return quizName; }

    public void setQuizName(String quizName) { this.quizName = quizName; }

    public Question getQuestion1() { return question1; }

    public void setQuestion1(Question question1) { this.question1 = question1; }

    public Question getQuestion2() { return question2; }

    public void setQuestion2(Question question2) { this.question2 = question2; }

    public Question getQuestion3() { return question3; }

    public void setQuestion3(Question question3) { this.question3 = question3; }

    public Question getQuestion4() { return question4; }

    public void setQuestion4(Question question4) { this.question4 = question4; }

    public Question getQuestion5() { return question5; }

    public void setQuestion5(Question question5) { this.question5 = question5; }
}
