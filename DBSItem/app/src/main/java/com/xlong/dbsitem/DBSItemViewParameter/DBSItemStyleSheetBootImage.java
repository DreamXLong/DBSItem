package com.xlong.dbsitem.DBSItemViewParameter;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleSheetBootImage {
    private Integer cornerRadius;
    private Integer marginLeft;
    private Integer marginRight;
    private Integer marginTop;
    private Integer marginBottom;
    private Integer height;
    private Integer weight;

    public DBSItemStyleSheetBootImage() {
    }

    public DBSItemStyleSheetBootImage(Integer cornerRadius, Integer marginLeft, Integer marginRight, Integer marginTop, Integer marginBottom) {
        this.cornerRadius = cornerRadius;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
        this.marginTop = marginTop;
        this.marginBottom = marginBottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public DBSItemStyleSheetBootImage(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(Integer marginLeft) {
        this.marginLeft = marginLeft;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(Integer marginRight) {
        this.marginRight = marginRight;
    }

    public int getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(Integer marginTop) {
        this.marginTop = marginTop;
    }

    public int getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(Integer marginBottom) {
        this.marginBottom = marginBottom;
    }

    public int getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
}
