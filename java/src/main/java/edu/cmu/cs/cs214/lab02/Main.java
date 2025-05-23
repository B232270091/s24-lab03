package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape square = new Square(4);

        Renderer rectangleRenderer = new Renderer(rectangle);
        rectangleRenderer.draw();

        Renderer squareRenderer = new Renderer(square);
        squareRenderer.draw();
        System.out.println("Testing");
        
    }
}
