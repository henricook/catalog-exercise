package com.henricook.media;

import java.util.ArrayList;
import java.util.List;

/**
 * A class to represent a TV Catalog, which can contain titles
 */
public class TVCatalog {

    // Titles in this catalog
    private List<Title> titles;

    /**
     * Create a new TVCatalog containing a list of titles
     * @param titles
     */
    public TVCatalog(List<Title> titles) {
        this.titles = titles;
    }

    /**
     * Get the titles in the TVCatalog
     * @return
     */
    public List<Title> getTitles() {
        return titles;
    }

    /**
     * Set a new list of titles for the catalog
     * @param titles
     */
    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }
}
