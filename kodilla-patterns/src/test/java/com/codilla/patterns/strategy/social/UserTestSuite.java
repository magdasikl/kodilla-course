package com.codilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
//        Given
        User Kalina = new Millenials(" Kalina A.");
        User Adam = new YGeneration("Adam S.");
        User Maja = new ZGeneration("Maja G.");

//        When
        String kalinaUse = Kalina.sharePost();
        System.out.println("Kalina use: " + kalinaUse);

        String adamUse = Adam.sharePost();
        System.out.println("Adam use: " + adamUse);

        String majaUse = Maja.sharePost();
        System.out.println("Maja use: " + majaUse);

//        Then
        Assert.assertEquals("Facebook",kalinaUse );
        Assert.assertEquals("Twitter", adamUse);
        Assert.assertEquals("Snapchat",majaUse);

    }

    @Test
    public void testIndividualSharingStrategy() {
//        Given
        User kalina = new Millenials("Kalina A.");

//        When
        String kalinaUse = kalina.sharePost();
        System.out.println("Kalina use "+ kalinaUse);

        kalina.setSocialPublisher(new TwitterPublisher());
        kalinaUse = kalina.sharePost();
        System.out.println("Kalina user new " + kalinaUse);

//        Then
        Assert.assertEquals("Twitter", kalinaUse);
    }
}
