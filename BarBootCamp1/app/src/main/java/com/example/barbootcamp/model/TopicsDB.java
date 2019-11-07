package com.example.barbootcamp.model;

import com.example.barbootcamp.R;
import com.example.barbootcamp.model.Topic;

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
                "Beer is one of the oldest and most widely consumed alcoholic drinks in the world. It is also the third most popular drink overall after water and tea. Beer is brewed from ceral grains - mostly from malted barley, though wheat, maize, and rice are also used. Most modern beer is brewed with hops, which adds bitterness and other flavours and act as a natural preservative and stabilizing agent. Other flavouring agents such as gruit, herbs, or fruits may be included or used instead of hops. \n " +
                        "\n" +
                        "When talking about beer, there are two main categories: Lager and Ale. The big difference between is the strain of yeast used in each. When wort (the sugary liquid of water and malts) is turned into beer it uses yeast to essentially eat the sugars and in turn burp out carbonation bubbles and alcohol. For ales this activity (fermentation) takes place at the top of the fermentation tank, in warm conditions (18-22ºC) using an ale yeast which loves the warm temperatures. For lagers the same activity takes place at the bottom of the tank, in cool conditions (less than 12ºC) using a lager yeast which prefers the cool temperatures to eat the sugars. \n " +
                        "\n" +
                        "Ales typically have much greater flavour profiles than lagers so it does make sense that in the craft beer category, where more flavoursome beers are sought, that ales are the more common style brewed. \n",
                "There are many beers that are popular and attract a certain type of drinker. \n" +
                        "\n" +
                        "Indian Pale Ales, better known as IPAs, are one of the most popular styles of beer in the craft brewing scene today. Typically, IPAs have a medium amber colour and feature a very bitter flavour. To make the bitterness more palatable, many brewers add citrus or herbal tones to the beer. Because of the sheer variety of IPAs on the market, there are no hard and fast rules when it comes to food pairings. But generally, they go well with smoky flavours, such as steak, mexican foods and barbequed food. \n" +
                        "\n" +
                        "Wheat beers are brewed with a mixture of wheat and barley grains, which gives the beer smoother texture and lighter carbonation than other styles. The wheat itself doesn't add much flavor, so many brewers add citrus and other fruity flavourings to the beer. Wheat beers are very versatile, and you can pair them with a number of foods, such as spicy noodles, salads and even fruit tarts. \n" +
                        "\n" +
                        "Amber ales are characterized by medium mouthfeel and colours that range from amber to a deep reddish-gold. These beers have strong flavours of malt, and there are notes of sweet caramel that complement the roasted malt taste. But, these beers do not have an overpoweringly sweet flavour, and many amber ales have a dry and crisp finish. Due to this, they are excellent for cleansing the palate after foods such as pizza, brisket and even jerk chicken. \n" +
                        "\n" +
                        "Porters originated in London, and the original variety were dark and strong. They are milder now and come in a veriety of styles and flavours, but they kept their signature dark colour, toasty aroma and roasted flavour. They have a rich, deep flavour and pair best with foods that have a similar texture, such as lobster, crab, and game meats. \n" +
                        "\n" +
                        "Stouts are best known for their black colour and dark, roasted flavour similar to porters. However they are not necessarily high in alcohol content, butterness or flavour, and tend to be milder than a porter. Because stouts have a chocolatey flavour, they are perfect for pairing with desserts such as truffles, chocolate mousse and coffee-flavoured desserts. ",
                "Wine is made from fermented grape juice. Grapes are picked, crushed and placed in buckets or vats to ferment. The process of fermentation turns the natural sugars in the grape juice into alcohol. Fermentation can occur naturally, but sometimes winemakers add yeast to help control the process. The crushed grapes are put through a press, which removes the skins and other sediment. \n" +
                        "\n" +
                        "To make white wine, grapes are pressed before fermentation, and the skins, seeds and stems are removed prior. Red wine is usually pressed after fermentation, with the stems, skin and seeds still in tact. The grape skins lend the wine its pigment, as well as many of the distinctive health compounds found in red wine. After this step, teh wine is aged in stainless steel or oak barrels until it's ready to be bottled. \n" +
                        "\n" +
                        "While red varietals are used to make red wine, white wine can actually be made from red or white grapes. For instance, traditional French Champagne is made with the red Pinot Noir grape. " +
                        "\n" +
                        "Many countries produce wine. Some of the main wine-growing regions are in France, Italy, Spain, Chile, South Africa, Australia and California in the US. \n" +
                        "\n" +
                        "While most regions grow several types of grape varietals, some places are particularly known for one or two, such as Napa Valley Chardonnay, Spanish Tempranillo and South African Chenin Blanc. \n" +
                        "\n" +
                        "Research has found that drinking red wine may have a protective effect on the cardiovascular system. In fact, it has been linked to a 30% lower risk of dying from heart disease. This is important to know if you will be drinking a lot of it, or trying to sell it!",
            R.drawable.beerandwine,
                "Beer and Wine Quiz"
        ));
        topics.put(2, new Topic(
                2,
                "Vodka, Gin and Whiskey",
                "Intermediate",
                "Vodka, the crystal clear spirit, is simply a distilled spirit that's made from water and ethanol. Vodka is fermented, distilled and filtered, and can be made form pretty much anything that is able to go through that process and end up making alcohol. \n " +
                "\n" +
                "This includes grains, grapes, sugar, fruits, corn, potatoes and even roots. The liquid is distilled to 90% or more alcohol by volume in order to remove all the potential smell and taste of whatever ingredients were used to produce it, before diluting the spirit to the much more palatable 40% alcohol. \n" +
                "\n" +
                "Although it's quite popular in the United States, vodka has been a staple in European countries like Russian, Ukraine, Belarus, Estonia, Latvia, Finalnd, Iceland, Norway, Poland and the Czech Republic for centuries now. \n" +
                "\n" +
                "Vodka is an extremely versatile spirit, with many different uses. Vodka can be applied to the preferences of the wide range of customer's palattes. Thus, it is known as the water of spirits. \n" +
                "\n" +
                "The Moscow Mule (ginger beer, vodka and lime juice) is by far one of the most requested vodka cocktails by bartenders. ",
                "Most of us love a good Gin & Tonic, but there's so much to learn about this historic spirit. It's traditionally made in Europe, and it's characterized by the use of juniper as a flavouring; also known as a botanical. Juniper is supported by other botanical characters; traditionally coriander, cassia, licorice, orris and other herbs. \n " +
                "\n" +
                "Gin comes from the combination of alcohol typically fermented grian and a specific set of botanicals. The base spirit for gin is mostly grain, but some gin distillers use wheat=based spirit and others use barley, grape, sugar and various other bases. It is made in the same way as vodka, but with the addition of the botanicals. Distilling gin is a process of extracting essential oils - not dissimilar to perfume making - and creating a clean, pure spirit. \n" +
                "\n" +
                "There are four main types of gin: London dry gin, Bathtub gin, Genever and Old Tom. London Dry has strict regulations about the way it is made. It cannot have any sugar added, has to be flavoured prevalently with juniper berries, and has to be at least 140 Proof after distillation. Only water can be added to bring down the alcohol content. Bathtub gin is a homemade gin made by simply infusing the grain spirit with spices, and is often made in bathtubs as the name suggests. Genever is teh father of gin, made by distilling malt wine and then redistilling it with spices and sweetening it. Old Tom is Genever's successor, and was made sweeter and psicier to cover the bad taste of the poor-quality alcohol that was used to make it. \n" +
                "\n" +
                "Gin has always been a key cocktail ingredient since the birth of mixing drinks. Some famous favourites are the Vesper, Bees Knees, Negroni and the classic Martini. ",
                "Whisky ks a distilled spirit made from fermented grain mash, including corn rye, barley and wheat. After fermentation, the whisky is matured in barrels for several years. The most popular whisky producing countries are Canada, Scotland, Japan and the United States. \n" +
                "\n" +
                "The difference between whisky and whiskey is actually dependent on which part of the world the whisky is from. In the United States and Ireland, it's spelled with the e, and in Scotland, Japan and pretty much the rest of the world, it is spelled whisky. \n" +
                "\n" +
                "Single malt whisky accounts for most of the Scotch whisky produced and is made of one single type of malted grain, hence the name. Blended whisky, on the other hand, is created by mixing single malt whiskies form different distilleries to create one whisky. It's very common in Scotch, but can also be found in every other whisky-producing nation. The most well-known American style is bourbon. To count as bourbon, the whisky must be made from at least 51% corn. It also needs to be matured in first-use charred American oak casks. It doens't have to be made in Kentucky. \n" +
                "\n" +
                        "Ageing matters because much of the flavours associated with whisky comes form the caramelized, charred wood it's aged in. Most whiskies are aged for a minimum of three years, giving them its colour. Others can sit in a cask for decades, taking in more and more flavour the whole time. \n" +
                        "\n" +
                        "Most whiskies are distilled in a way that lend them to be enjoyed on their own, but bourbons pair very well with different colas and soda water and scotch mixes well with ginger ale and seltzers.",
             R.drawable.vodka,
                "Vodka, Gin and Whiskey Quiz"
        ));
        topics.put(3, new Topic(
                3,
                "Rum, Tequila and Other Festive Spirits",
                "Intermediate",
                "This is where rum info will go. ",
                "This is where tequila info will go. ",
                "This is where info about Brandy will go. ",
                R.drawable.tequila,
                "Rum, Tequila and Other Festive Spirits Quiz"
        ));
        topics.put(4, new Topic(
                4,
                "Cocktail Equipment and Garnishes",
                "Advanced",
                "This is where equipment info will go. ",
                "This is where more equipment info will go. ",
                "This is where garnishes info will go. ",
                R.drawable.equipment,
                "Cocktail Equipment and Garnishes Quiz"
        ));
        topics.put(5, new Topic(
                5,
                "Classic Cocktails",
                "Advanced",
                "This is where first 2 cocktails will go. ",
                "This is where margaritas will go. ",
                "This is where Negronis and Old Fashioned's will go",
                R.drawable.cocktails,
                "Classic Cocktails Quiz"
        ));
        topics.put(6, new Topic(
                6,
                "Cocktail Making Techniques",
                "Advanced",
                "This is where wet and dry shakes will go. ",
                "This is where muddling and stirring will go. ",
                "This is where straining will go. ",
                R.drawable.oldfashioned,
                "Cocktail Making Techniques Quiz"
        ));
    }
}
