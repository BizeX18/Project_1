package com.example.project_1;
public class TrackList {
    private int id;
    private String Trackname;
    private String Albumname;
    private String Direction;
    private String Executor;
    private String Released;
    private String Genre;
    private String Duration;

    public TrackList(int id, String Trackname, String Albumname, String Direction, String Executor, String Released, String Genre, String Duration) {
        this.id = id;
        this.Trackname = Trackname;
        this.Direction = Direction;
        this.Albumname = Albumname;
        this.Executor = Executor;
        this.Released = Released;
        this.Genre = Genre;
        this.Duration = Duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrackname() {
        return Trackname;
    }

    public void setTrackname(String Trackname) {
        this.Trackname = Trackname;
    }

    public String getAlbumname() {
        return Albumname;
    }

    public void setAlbumname(String Albumname) {
        this.Albumname = Albumname;
    }

    public String getExecutor() {
        return Executor;
    }

    public void setExecutor(String Executor) {
        this.Executor = Executor;
    }

    public String setDirection() {
        return Direction;
    }

    public void setDirection(String Direction) {
        String direction = this.Direction;
    }

    public String getGenre () {
        return Genre;
    }

    public void setGenre (String Genre){
        this.Genre = Genre;
    }

    public String getDuration () {
        return Duration;
    }

    public void setDuration (String Duration){
        this.Duration = Duration;
    }

    public String getReleased () {
        return Released;
    }
    public void setReleased (String Released){
        this.Released = Released;

    }
}

