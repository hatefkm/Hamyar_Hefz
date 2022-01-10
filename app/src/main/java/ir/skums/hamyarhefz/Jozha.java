package ir.skums.hamyarhefz;

import java.sql.Blob;

public class Jozha {
    int id;
    String title;


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


}
