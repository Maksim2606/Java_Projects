package ru.mirea.practice.work1;

public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xspeed, int yspeed, int radius, MovablePoint center) {
        super(x, y, xspeed, yspeed);
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "MovableCircle: {center: " + center + ", radius = " + radius + "}";
    }

    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}
