package com.gd.pm.ui.property;

public class Position {
    private int x;
    private int y;
    private HorizontalPosition horizontalPosition;
    private VerticalPosition verticalPosition;
    private boolean isHorizontallyPositioned;
    private boolean isVerticallyPositioned;
    private Offset offset;

    public Position() {
        offset = new Offset(0, 0);
    }

    public Position offsetXBy(int x) {
        offset.setX(x);

        return this;
    }

    public Position offsetYBy(int y) {
        offset.setY(y);

        return this;
    }

    public int getX() {
        return x;
    }

    public Position setX(int x) {
        this.x = x;
        isHorizontallyPositioned = false;

        return this;
    }

    public int getY() {
        return y;
    }

    public Position setY(int y) {
        this.y = y;
        isVerticallyPositioned = false;

        return this;
    }

    public HorizontalPosition getHorizontalPosition() {
        return horizontalPosition;
    }

    public Position setHorizontalPosition(HorizontalPosition horizontalPosition) {
        this.horizontalPosition = horizontalPosition;
        isHorizontallyPositioned = true;

        return this;
    }

    public VerticalPosition getVerticalPosition() {
        return verticalPosition;
    }

    public Position setVerticalPosition(VerticalPosition verticalPosition) {
        this.verticalPosition = verticalPosition;
        isVerticallyPositioned = true;

        return this;
    }

    public Position setPositions(HorizontalPosition horizontalPosition, VerticalPosition verticalPosition) {
        return setHorizontalPosition(horizontalPosition).setVerticalPosition(verticalPosition);
    }

    public boolean isHorizontallyPositioned() {
        return isHorizontallyPositioned;
    }

    public boolean isVerticallyPositioned() {
        return isVerticallyPositioned;
    }

    public Offset getOffset() {
        return offset;
    }
}
