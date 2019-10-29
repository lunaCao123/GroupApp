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

   // static {
     //   quizzes.put(1, new Quiz(
       //         1,
         //       "Beer and Wine Quiz",
                //TODO: make questions for quizzes
                //TODO: figure out how to refernce questionDB within the QuizDB class
               // BeerQuestion1,
                //BeerQuestion2,
               // BeerQuestion3,
               // WineQuestion4,
               // WineQuestion5
     //   ));
    }
}
