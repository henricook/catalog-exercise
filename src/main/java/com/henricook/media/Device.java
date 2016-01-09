package com.henricook.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * A device can play certain formats of video, and will select titles from a catalog
 */
public class Device {

    /**
     * The type of this device e.g. Android, iPhone or 'other'
     */
    protected String deviceType;

    /**
     * The formats this device supports
     */
    protected List<String> supportedVideoFormats;

    /**
     * Create a device of a particular type with some supported video formats
     * @param deviceType The type of this device
     * @param supportedVideoFormats The video formats this device supports
     */
    public Device(String deviceType, List<String> supportedVideoFormats) {
        this.deviceType = deviceType;
        this.supportedVideoFormats = supportedVideoFormats;
    }

    /**
     * Get the device's type
     * @return The device's type
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * Get the video formats this device supports
     * @return Supported Video Formats for this device
     */
    public List<String> getSupportedVideoFormats() {
        return supportedVideoFormats;
    }

    /**
     * Given a catalog, find titles that this device can play
     * @param catalog a TVCatalog
     * @return A list of the title names from the TVCatalog that are playable
     */
    public List<String> getPlayableTitleNames(TVCatalog catalog) {
        // Find all titles that are available in a supported format and return their names
        return catalog.getTitles().stream()
                .filter(title -> title.availableFormats.stream().anyMatch(this.supportedVideoFormats::contains))
                .map(title -> title.name)
                .collect(Collectors.toList());
    }
}
