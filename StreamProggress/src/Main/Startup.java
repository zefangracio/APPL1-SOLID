/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Interfaces.IStreamable;
import Models.File;
import Models.Music;
import Models.StreamProgressInfo;

/**
 *
 * @author zefan
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IStreamable stream = new File("Test",12,12);
        IStreamable stream2 = new Music("Some name","Cool",15,2222);
        
        StreamProgressInfo info1 = new  StreamProgressInfo(stream);
        StreamProgressInfo info2 = new  StreamProgressInfo(stream2);
        
        System.out.println("Percent = " + info1.CalculateCurrentPercent());
        System.out.println("Percent = " + info2.CalculateCurrentPercent());
    }
    
}
