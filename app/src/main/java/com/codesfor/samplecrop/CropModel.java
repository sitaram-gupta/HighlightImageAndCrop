package com.codesfor.samplecrop;

/**
 * Created by a on 12/12/2016.
 */
public class CropModel {
    float x;
    float y;

    public CropModel(float y, float x) {
        this.y = y;
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
}
