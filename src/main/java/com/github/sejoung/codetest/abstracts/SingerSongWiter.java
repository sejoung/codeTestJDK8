package com.github.sejoung.codetest.abstracts;

import com.github.sejoung.codetest.interfaces.Singer;
import com.github.sejoung.codetest.interfaces.Song;
import com.github.sejoung.codetest.interfaces.SongWiter;

import java.applet.AudioClip;

public abstract class SingerSongWiter {
    abstract AudioClip sing(Song song);
    abstract Song compose(int chartPosition);
    abstract AudioClip strum();
    abstract void actSensitive();
}
