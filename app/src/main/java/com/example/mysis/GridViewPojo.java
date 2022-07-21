package com.example.mysis;

public class GridViewPojo {
    private int images;
    private String title;

    public  GridViewPojo(int images, String title){
        this.images = images;
        this.title = title;
    }
    public  int getImages(){

        return images;
    }

   /* public void setimages(int images) {
        this.images = images;
    }*/

    public String getTitle(){

        return title;
    }
    /*public void settitle(String title) {
        this.title = title;
    }*/
}
