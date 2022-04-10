package entity;

public class photos {

    private int photos_id;
    private int filmid;
    private String plink;

    public photos(int photos_id, int film_id, String plink) {
        this.photos_id = photos_id;
        this.filmid = filmid;
        this.plink = plink;
    }

    public photos() {
    }

    public int getPhotos_id() {
        return photos_id;
    }

    public void setPhotos_id(int photos_id) {
        this.photos_id = photos_id;
    }

    public int getFilm_id() {
        return filmid;
    }

    public void setFilm_id(int film_id) {
        this.filmid = filmid;
    }

    public String getPlink() {
        return plink;
    }

    public void setPlink(String plink) {
        this.plink = plink;
    }

}
