package com.kodilla.patterns.singleton;

import com.kodiila.patterns.singleton.SettingsFileEngine;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsFileTestSuite {

//    private static SettingsFileEngine settingsFileEngine;

    @BeforeClass
    public static void openSettingsFile() {
//        settingsFileEngine = new SettingsFileEngine();
        SettingsFileEngine.getInstance().open("myapp.settings");
    }

    @AfterClass

    public static void closeSettingsFile() {
        SettingsFileEngine.getInstance().close();
    }

    @Test
    public void testGetFileName() {
//        Given
//        When
        String fileName = SettingsFileEngine.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
//        Then
        Assert.assertEquals("myapp.settings",fileName);
    }

    @Test
    public void testLoadSettings() {
//        Given
//        When
        boolean result = SettingsFileEngine.getInstance().loadSettings();
//        Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSetting() {
//        Given
//        When
        boolean result = SettingsFileEngine.getInstance().saveSettings();
//        Then
        Assert.assertTrue(result);
    }
}
