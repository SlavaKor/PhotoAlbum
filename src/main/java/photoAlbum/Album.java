package photoAlbum;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private List<Photo> album = new ArrayList<Photo>();

    public void addPhoto(Photo photo){
        album.add(photo);
    }

    public void changePhoto(Integer id){
        for(Photo photo : album){
            if(photo.getId() == id)
                photo.setSize(id + 100);
        }
    }

    public void removePhoto(Integer id){
        for(Photo photo : album){
            if(photo.getId() == id)
                album.remove(photo);
        }
        System.out.println(album.size());
    }

    public List<Photo> getAlbum() {
        return album;
    }

    public void setAlbum(List<Photo> album) {
        this.album = album;
    }
}