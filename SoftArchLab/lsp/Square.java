//package com.solid.lsp;

public class Square extends Shape {

    Square(int side) {
        this.setSide(side);
    }

    @Override
    public void setWidth(int width) {
        this.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSide(height);
    }

    @Override
    public int getWidth() {
        return super.getWidth();
    }
    
    public void setSide(int side) {
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public int getArea() {
        return super.getWidth() *super.getHeight();
    }

}
