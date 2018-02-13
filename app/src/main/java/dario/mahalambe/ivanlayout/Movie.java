package dario.mahalambe.ivanlayout;

/**
 * Created by Dario Mahalambe on 11/02/2018.
 */

 public  class Movie {

    private String title;
    private  int img_resource;


    public Movie(String title, int img_resource) {
        this.title = title;
        this.img_resource = img_resource;
    }

    public String getTitle() {
        return title;
    }

    public int getImg_resource() {
        return img_resource;
    }
}
