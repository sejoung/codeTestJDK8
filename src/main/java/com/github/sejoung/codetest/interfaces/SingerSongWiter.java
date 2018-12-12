package com.github.sejoung.codetest.interfaces;

import java.applet.AudioClip;

public interface SingerSongWiter extends Singer, SongWiter {
    AudioClip strum();
    void actSensitive();
}
