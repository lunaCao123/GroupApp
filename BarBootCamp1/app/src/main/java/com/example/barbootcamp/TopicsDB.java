package com.example.barbootcamp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopicsDB {

    public static Topic getTopicById(int topicID) {
        return topics.get(topicID);
    }

    public static ArrayList<Topic> getAllTopics() {
        return new ArrayList<Topic>((List) Arrays.asList(topics.values().toArray()));
    }

    private static final HashMap<Integer, Topic> topics = new HashMap<>();

    static {
        topics.put(1, new Topic(
                1,
                "Beer and Wine",
                "Beginner",
                "this is where details about beer will go.",
                "this is where details about wine will go.",
                "this is where more details about wine will go.",
            R.drawable.beerandwine
        ));
        topics.put(2, new Topic(
                2,
                "Vodka, Gin and Whiskey",
                "Intermediate",
                "this is where Vodka info will go. ",
                "this is where Gin info will go. ",
                "this is where Whiskey info will go. ",
             R.drawable.vodka
        ));
        topics.put(3, new Topic(
                3,
                "Rum, Tequila and Other Festive Spirits",
                "Intermediate",
                "This is where rum info will go. ",
                "This is where tequila info will go. ",
                "This is where info about Brandy will go. ",
                R.drawable.tequila
        ));
        topics.put(4, new Topic(
                4,
                "Cocktail Equipment and Garnishes",
                "Advanced",
                "This is where equipment info will go. ",
                "This is where more equipment info will go. ",
                "This is where garnishes info will go. ",
                R.drawable.equipment
        ));
        topics.put(5, new Topic(
                5,
                "Classic Cocktails",
                "Advanced",
                "This is where first 2 cocktails will go. ",
                "This is where margaritas will go. ",
                "This is where Negronis and Old Fashioned's will go",
                R.drawable.cocktails
        ));
        topics.put(6, new Topic(
                6,
                "Cocktail Making Techniques",
                "Advanced",
                "This is where wet and dry shakes will go. ",
                "This is where muddling and stirring will go. ",
                "This is where straining will go. ",
                R.drawable.oldfashioned
        ));
    }
}
