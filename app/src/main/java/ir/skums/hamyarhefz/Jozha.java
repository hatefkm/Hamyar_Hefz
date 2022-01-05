package ir.skums.hamyarhefz;

import java.sql.Blob;

public class Jozha {
    int id;
    String title;
    String matn;
    Blob voice;

    public Jozha(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }


    public Jozha(String matn) {
        this.matn = matn;

    }

    public String getMatn() {
        return matn;
    }

    public Jozha(Blob voice) {
        this.voice = voice;
    }

    public Blob getVoice() {
        return voice;
    }
}
