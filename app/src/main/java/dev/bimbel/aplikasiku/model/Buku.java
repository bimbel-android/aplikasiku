package dev.bimbel.aplikasiku.model;

/**
 * Created by azisa on 8/19/2017.
 */

public class Buku {

    private int icon;
    private String judul;
    private String deskripsi;

    public Buku(int icon, String judul, String deskripsi) {
        this.icon = icon;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
