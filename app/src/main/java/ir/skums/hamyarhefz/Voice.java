package ir.skums.hamyarhefz;

import java.sql.Blob;

public class Voice {
    int id;

    Blob voice;

    public Voice(int id, Blob voice) {
        this.id = id;
        this.voice = voice;

    }

    public int getId() {
        return id;
    }

    public Blob getVoice() {
        return voice;
    }
}
