package com.example.mrpassword.drawer02;

/**
 * Created by TnKstudio on 4/11/2560.
 */

public class Food {
    private String FID,Name,Pic,Price ;

    public Food() {
    }
//    public Food(String price) {
//
//    }

    public Food(String FID, String name, String pic, String price) {
        this.FID = FID;
        Name = name;
        Pic = pic;
        Price = price;
    }

    public String getFID() {
        return FID;
    }

    public void setFID(String FID) {
        this.FID = FID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String pic) {
        Pic = pic;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

}
