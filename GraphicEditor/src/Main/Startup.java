/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Interfaces.IShape;
import Models.Circle;
import Models.GraphicEditor;
import Models.Rectangle;
import Models.Square;

/**
 *
 * @author zefan
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape rect = new Rectangle();
        IShape square = new Square();

            GraphicEditor editor=new GraphicEditor();
            editor.DrawShape(circle);
            editor.DrawShape(rect);
            editor.DrawShape(square);
    }
    
}
