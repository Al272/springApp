package ru.gridnine.burlakov;

import java.util.Collection;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public Collection<Music> getMusicCollection() {
        return musicCollection;
    }

    public void setMusicCollection(Collection<Music> musicCollection) {
        this.musicCollection = musicCollection;
    }

    private Collection<Music> musicCollection;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    //IoC инверсия упрвления
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        for(Music music:musicCollection){
            System.out.println(music.getSong());
        }
    }
}
