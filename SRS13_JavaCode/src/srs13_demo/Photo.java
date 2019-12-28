/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs13_demo;

public class Photo implements Iphoto{

    Double photoSize;
    String photoName;
    Enum photoType;
    int photoID;

    public void deletePhoto() {
    }

    public void addPhoto() {
    }

    public boolean searchPhoto() {
        return true;
    }

    public void viewPhoto(int photoID) {
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
