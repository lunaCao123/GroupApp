package com.example.barbootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class QuizDB {

    public static Quiz getQuizById(int quizID) {
        return quizzes.get(quizID);
    }

    public static ArrayList<Quiz> getAllQuizzes() {
        return new ArrayList<Quiz>((List) Arrays.asList(quizzes.values().toArray()));
    }

    private static final HashMap<Integer, Quiz> quizzes = new HashMap<>();
}
