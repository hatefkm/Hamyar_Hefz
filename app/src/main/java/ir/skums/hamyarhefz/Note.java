package ir.skums.hamyarhefz;

import java.util.ArrayList;
import java.util.Date;

public class Note
{

   public static ArrayList<Note> noteArrayList = new ArrayList<>();

    private int id;
    private String nameSure;
    private String numberAye;
    private String aye;

    public Note(int id, String nameSure, String numberAye, String aye, Date deleted) {
        this.id = id;
        this.nameSure = nameSure;
        this.numberAye = numberAye;
        this.aye = aye;
        this.deleted = deleted;
    }

    public Note(int id, String nameSure, String numberAye, String aye) {
        this.id = id;
        this.nameSure = nameSure;
        this.numberAye = numberAye;
        this.aye = aye;
        deleted = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSure() {
        return nameSure;
    }

    public void setNameSure(String nameSure) {
        this.nameSure = nameSure;
    }

    public String getNumberAye() {
        return numberAye;
    }

    public void setNumberAye(String numberAye) {
        this.numberAye = numberAye;
    }

    public String getAye() {
        return aye;
    }

    public void setAye(String aye) {
        this.aye = aye;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    private Date deleted;
}
