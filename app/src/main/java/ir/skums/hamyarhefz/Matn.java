package ir.skums.hamyarhefz;

import java.sql.Blob;

public class Matn {
    int id;
    String matn;


    public Matn(int id, String matn) {
        this.id = id;
        this.matn = matn;

    }

    public int getId() {
        return id;
    }
    public String getMatn() {
        return matn;
    }


}