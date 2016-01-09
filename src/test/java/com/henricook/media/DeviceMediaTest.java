package com.henricook.media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Tests for a device. A device can play titles from a catalog.
 */
public class DeviceMediaTest {

    /* Fixture Data */

    // List of sample titles
    final protected List<Title> sampleTitles = new ArrayList<Title>(Arrays.asList(
        new Title("Sherlock", new ArrayList<>(Arrays.asList("WebM"))),
        new Title("Breaking Bad", new ArrayList<>(Arrays.asList("MPG"))),
        new Title("Homeland", new ArrayList<>(Arrays.asList("MP4")))
    ));

    // Sample Catalog
    final protected TVCatalog testCatalog = new TVCatalog(sampleTitles);

    /* End Fixture Data */

    protected Device androidDevice;
    protected Device iPhoneDevice;
    protected Device otherDevice;

    @Before
    public void setUp() {
        // Setup devices, put initialisation here so it's setup before each test
        androidDevice = new Device("Android", Arrays.asList("WebM"));
        iPhoneDevice = new Device("iPhone", Arrays.asList("MP4"));
        otherDevice = new Device("KindleFire", Arrays.asList("MPG"));
    }

    /**
     * Android devices should only playback WebM videos
     */
    @Test
    public void androidDeviceShouldPlayWebM() {
        Assert.assertEquals(new ArrayList<>(Arrays.asList("Sherlock")), androidDevice.getPlayableTitleNames(testCatalog));
    }

    /**
     * iPhone devices should only playback MP4 videos
     */
    @Test
    public void iPhoneDeviceShouldPlayMP4() {
        Assert.assertEquals(new ArrayList<>(Arrays.asList("Homeland")), iPhoneDevice.getPlayableTitleNames(testCatalog));
    }

    /**
     * 'Other' devices should only playback MPG videos
     */
    @Test
    public void otherDeviceShouldPlayMPG() {
        Assert.assertEquals(new ArrayList<>(Arrays.asList("Breaking Bad")), otherDevice.getPlayableTitleNames(testCatalog));
    }
}