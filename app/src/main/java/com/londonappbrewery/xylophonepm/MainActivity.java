package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool soundPool;
    private int cSoundId;
    private int dSoundId;
    private int eSoundId;
    private int fSoundId;
    private int gSoundId;
    private int aSoundId;
    private int bSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.soundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        this.cSoundId = this.soundPool.load(getApplicationContext(), R.raw.note1_c, PRIORITY);
        this.dSoundId = this.soundPool.load(getApplicationContext(), R.raw.note2_d, PRIORITY);
        this.eSoundId = this.soundPool.load(getApplicationContext(), R.raw.note3_e, PRIORITY);
        this.fSoundId = this.soundPool.load(getApplicationContext(), R.raw.note4_f, PRIORITY);
        this.gSoundId = this.soundPool.load(getApplicationContext(), R.raw.note5_g, PRIORITY);
        this.aSoundId = this.soundPool.load(getApplicationContext(), R.raw.note6_a, PRIORITY);
        this.bSoundId = this.soundPool.load(getApplicationContext(), R.raw.note7_b, PRIORITY);
    }

    public void playA(View v) {
        this.soundPool.play(this.aSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playB(View v) {
        this.soundPool.play(this.bSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playC(View v) {
        this.soundPool.play(this.cSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playD(View v) {
        this.soundPool.play(this.dSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playE(View v) {
        this.soundPool.play(this.eSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playF(View v) {
        this.soundPool.play(this.fSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    public void playG(View v) {
        this.soundPool.play(this.gSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
}
