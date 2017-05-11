package com.xlong.dbsitem.DBSItemViewParameter;

import java.util.List;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleSheetMainImage {
    private List<String> listUrl;
    private Integer localDrawable;
    private Integer cornerRadius;
    private Integer marginLeft;
    private Integer marginTop;
    private Integer marginBottom;
    private Integer marginRight;
    private Integer width;
    private Integer height;
    private Integer type;

    public DBSItemStyleSheetMainImage() {
    }


    public DBSItemStyleSheetMainImage(Integer cornerRadius, Integer marginRight, Integer marginLeft, Integer margIntegerop, Integer marginBottom) {
        this.cornerRadius = cornerRadius;
        this.marginRight = marginRight;
        this.marginLeft = marginLeft;
        this.marginTop = margIntegerop;
        this.marginBottom = marginBottom;
    }

    public List<String> getListUrl() {
        return listUrl;
    }

    public Integer getlocalDrawable() {
        return localDrawable;
    }

    public void setlocalDrawable(Integer localDrawable) {
        this.localDrawable = localDrawable;
    }

    public void setListUrl(List<String> listUrl) {
        this.listUrl = listUrl;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(Integer marginRight) {
        this.marginRight = marginRight;
    }

    public Integer getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(Integer marginLeft) {
        this.marginLeft = marginLeft;
    }

    public Integer getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(Integer margIntegerop) {
        this.marginTop = margIntegerop;
    }

    public Integer getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(Integer marginBottom) {
        this.marginBottom = marginBottom;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }
}
