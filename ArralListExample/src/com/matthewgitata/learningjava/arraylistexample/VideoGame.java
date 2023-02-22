package com.matthewgitata.learningjava.arraylistexample;

import java.util.Arrays;

public class VideoGame {
    private String title;
    private int year;
    private String rating;
    private String[] platforms;

    public VideoGame(String title, int year, String rating, String[] platforms) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return "\n" +
                "Title: " + title + "\n" +
                "Year: " + year + "\n" +
                "Rating: " + rating + "\n" +
                "Platforms: " + Arrays.toString(platforms) +
                "";
    }
}