package ua.opnu.model;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;

public abstract class DrawShape {

    public static final int SHAPE_RECTANGLE = 0;
    public static final int SHAPE_ROUNDED_RECT = 1;
    public static final int SHAPE_ELLIPSE = 2;

    private Point startPoint;
    private Point endPoint;

    public DrawShape() {
        this(new Point(0, 0), new Point(0, 0));
    }

    public DrawShape(Point startPoint, Point endPoint) {
        this.startPoint = new Point(startPoint);
        this.endPoint = new Point(endPoint);
    }

    public abstract Shape getShape(Point startPoint, Point endPoint);

    public Shape getShape() {
        return getShape(startPoint, endPoint);
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = new Point(startPoint);
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = new Point(endPoint);
    }

    public static DrawShape newInstance(int shapeType) {
        return switch (shapeType) {
            case SHAPE_RECTANGLE -> new Rectangle();
            case SHAPE_ROUNDED_RECT -> new RoundedRectangle();
            case SHAPE_ELLIPSE -> new Ellipse();
            default -> null;
        };
    }
}