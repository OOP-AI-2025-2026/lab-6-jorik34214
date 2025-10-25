package ua.opnu.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ellipse extends DrawShape {

    @Override
    public Shape getShape(Point startPoint, Point endPoint) {
        int x = Math.min(startPoint.x, endPoint.x);
        int y = Math.min(startPoint.y, endPoint.y);
        int width = Math.abs(endPoint.x - startPoint.x);
        int height = Math.abs(endPoint.y - startPoint.y);

        return new Ellipse2D.Double(x, y, width, height);
    }
}
