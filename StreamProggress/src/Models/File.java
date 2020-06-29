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
public class File implements IStreamable {
     private String name;
     private int length;
     private int bytesSent;
     
        public File(String name, int length, int bytesSent)
        {
            this.name = name;
            this.length = length;
            this.bytesSent = bytesSent;
        }

    /**
     * @return the length
     */
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
