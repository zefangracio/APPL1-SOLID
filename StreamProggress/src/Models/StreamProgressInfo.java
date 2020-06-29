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
public class StreamProgressInfo {
    
     private IStreamable stream;
    
        public StreamProgressInfo(IStreamable stream)
        {
            this.stream = stream;
        }

        public int CalculateCurrentPercent()
        {
            return stream.getBytesSent() * 100 / stream.getBytesSent();
        }
}
