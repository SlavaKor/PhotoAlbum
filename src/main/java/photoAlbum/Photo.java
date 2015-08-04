package photoAlbum;

public class Photo {
    private Integer id;
    private String path;
    private Integer size;

    public Photo(Integer id, Integer size) {
        this.id = id;
        this.size  = size;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}