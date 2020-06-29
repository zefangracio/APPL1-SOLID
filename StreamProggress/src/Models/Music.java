/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.IStreamable;

/**
 *
 * @author zefan
 */
public class Music implements IStreamable {
    private String artist;
        private String album;
        private int length;
        private int bytesSent;
        
        public Music(String artist, String album, int length, int bytesSent)
        {
            this.artist = artist;
            this.album = album;
            this.length = length;
            this.bytesSent = bytesSent;
        }

    @Override
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getBytesSent() {
        return bytesSent;
    }

    
    public void setBytesSent(int bytesSent) {
        this.bytesSent = bytesSent;
    }

        
}
