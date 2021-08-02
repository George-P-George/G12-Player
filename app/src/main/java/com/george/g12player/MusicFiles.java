package com.george.g12player;

public class MusicFiles {
    private String path;
    private String title;
    private String artist;
    private String duration;
    private String id;

    public MusicFiles(String path, String title, String artist,  String duration, String id) {
        this.path = path;
        this.title = title;
        this.artist = artist;

        this.duration = duration;
        this.id = id;
    }

    public MusicFiles() {

    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }


    public String getArtist() {
        return artist;
    }



    public String getDuration() {
        return duration;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
