package com.xlong.dbsitem.DBSItemViewParameter;

import java.util.List;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleSheetButton {
    private List<String> listText;
    private Integer textColor;
    private Integer textSize;
    private Integer bg;
    private Integer width;
    private Integer height;
    private Integer marginLeft;
    private Integer marginRight;
    private Integer margIntegerop;
    private Integer marginBottom;

    public DBSItemStyleSheetButton() {
    }

    public DBSItemStyleSheetButton(Integer bg, Integer height, Integer width) {
        this.bg = bg;
        this.height = height;
        this.width = width;
    }

    public DBSItemStyleSheetButton(Integer bg, Integer width, Integer height, Integer marginLeft, Integer marginRight, Integer margIntegerop, Integer marginBottom) {
        this.bg = bg;
        this.width = width;
        this.height = height;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
        this.margIntegerop = margIntegerop;
        this.marginBottom = marginBottom;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public void setTextColor(Integer textColor) {
        this.textColor = textColor;
    }

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public List<String> getListText() {
        return listText;
    }

    public void setListText(List<String> listText) {
        this.listText = listText;
    }

    public Integer getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(Integer marginLeft) {
        this.marginLeft = marginLeft;
    }

    public Integer getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(Integer marginRight) {
        this.marginRight = marginRight;
    }

    public Integer getMargIntegerop() {
        return margIntegerop;
    }

    public void setMargIntegerop(Integer margIntegerop) {
        this.margIntegerop = margIntegerop;
    }

    public Integer getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(Integer marginBottom) {
        this.marginBottom = marginBottom;
    }

    public Integer getBg() {
        return bg;
    }

    public void setBg(Integer bg) {
        this.bg = bg;
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
}
