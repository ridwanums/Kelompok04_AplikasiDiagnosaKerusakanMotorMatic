package com.kampus.diagnosa.model;

import android.widget.ImageView;

public class WalktroughItem {
    String Title, Subtitle;
    int Image;

    public WalktroughItem (String title, String subtitle, int image){
        Title = title;
        Subtitle = subtitle;
        Image = image;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubtitle() {
        return Subtitle;
    }

    public void setSubtitle(String subtitle) {
        Subtitle = subtitle;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
