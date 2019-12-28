/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srs13_demo;

import java.util.Date;

/**
 *
 * @author ALI FCI
 */
public class Message {

    String messageTitle;
    String messageDate;
    String messageContent;

    public String displayMessage(String message) {
        return message;
    }

    public Date showTime(Date time) {
        return time;
    }

    public String deleteMessage(String messageTitle) {
        return null;
    }

    public void sendMessage(String message) {
    }

}
