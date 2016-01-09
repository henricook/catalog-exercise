package com.henricook.media;

import java.util.List;

/**
 * A title represents something that can be played
 */
public class Title {

    /**
     * The name of this title
     */
    protected String name;

    /**
     * The formats this title is available in
     */
    protected List<String> availableFormats;

    /**
     * Create a title with a name and a list of available formats
     * @param name The name of this title
     * @param availableFormats The formats this title is available in
     */
    public Title(String name, List<String> availableFormats) {
        this.name = name;
        this.availableFormats = availableFormats;
    }

    /**
     * Get the name of this title
     * @return Title name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the formats this title is available in
     * @return Available formats
     */
    public List<String> getAvailableFormats() {
        return availableFormats;
    }
}
