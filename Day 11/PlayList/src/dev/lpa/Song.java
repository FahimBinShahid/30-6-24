package dev.lpa;

public class Song {

    private String name;
    private int duration; // duration in seconds

    public Song(String name, double duration) {
        this.name = name;
        this.duration = (int) duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.duration;
    }
}
