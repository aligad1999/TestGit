/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs13_demo;

import java.util.*;
import java.io.*;

import java.util.ArrayList;

public class Page {

    int pageID;
    String pageName;
    String followerName;

    boolean state;

    ArrayList<User> follower = new ArrayList<User>();

    public void createPage(String pageName) {
        this.pageName = pageName;
    }

    public void deletePage(int pageID) {
        this.pageID = pageID;
    }

    public void addFollower(String followerName) {
        this.followerName = this.followerName;

    }

    public void removeFollower() {

    }

    public void notifyAllFollowers() {
    }
}
