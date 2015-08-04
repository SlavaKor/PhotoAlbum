import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import photoAlbum.Album;
import photoAlbum.Photo;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

/**
 * Created by Slava on 7/22/15.
 */
public class TestAlbum {
    Album a = new Album();
    Photo p1 = new Photo(1, 2);
    Photo p2 = new Photo(2, 22);
    Photo p3 = new Photo(3, 222);
    Photo p4 = new Photo(4, 23);
    Photo p5 = new Photo(5, 233);

    @Test(groups = {"add"})
    public void testAlbumAdd() {
        a.addPhoto(p1);
        a.addPhoto(p2);
        a.addPhoto(p3);
        a.addPhoto(p4);
        a.addPhoto(p5);

        System.out.println("Album size: " + a.getAlbum().size());
        System.out.println("-------------------1-------------------");
        System.out.println("Start testing adding... ");
        assertEquals(5, a.getAlbum().size());
        System.out.println("Test Success! End of testing adding... ");
        System.out.println("----------------------------------------");
    }

    @Test(groups = {"change"})
    public void testAlbumChangeSize() {
        a.addPhoto(p1);
        a.addPhoto(p2);
        a.addPhoto(p3);
        a.addPhoto(p4);
        a.addPhoto(p5);
        a.changePhoto(p1.getId());

        System.out.println("Photo id: " + p1.getId());
        System.out.println("Photo size: " + p1.getSize());
        System.out.println("Album size: " + a.getAlbum().size());
        System.out.println("-------------------2-------------------");
        System.out.println("Start testing changing...");
        assertEquals((int) p1.getSize(), 101);
        System.out.println("Test Success! End of testing changing...");
        System.out.println("----------------------------------------");
    }

    @Test(groups = {"remove"})
    public void testAlbumRemove() {
        a.addPhoto(p1);
        a.addPhoto(p2);
        a.addPhoto(p3);
        a.addPhoto(p4);
        a.addPhoto(p5);
        System.out.println("Album size: " + a.getAlbum().size());

        a.getAlbum().remove(p1);

        System.out.println("New Album size: " + a.getAlbum().size());
        System.out.println("--------------------3-------------------");
        System.out.println("Start testing removing");
        assertEquals(4, a.getAlbum().size());
        System.out.println("Test Success! End of testing removing");
        System.out.println("-----------------------------------------");
    }

    @AfterTest
    public void testAlbumAfterTest() {
        System.out.println("--------------------4--------------------");
        a.getAlbum().clear();
        System.out.println("Cleaning album... The end!!!!!");
        System.out.println("-----------------------------------------");
    }
}
