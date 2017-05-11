package com.xlong.dbsitem.DBSItemViewParameter;

import java.util.List;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleSheetMainTitle {
    private List<String> listText;
    private Integer textColor;
    private Integer textSize;
    private Integer marginLeft;
    private Integer marginTop;
    private Integer marginBottom;
    private Integer marginRight;

    public DBSItemStyleSheetMainTitle() {
    }

    public DBSItemStyleSheetMainTitle(Integer textColor, Integer textSize) {
        this.textColor = textColor;
        this.textSize = textSize;
    }

    public DBSItemStyleSheetMainTitle(Integer textColor, Integer textSize, Integer marginLeft, Integer marginTop, Integer marginBottom, Integer marginRight) {
        this.textColor = textColor;
        this.textSize = textSize;
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        this.marginBottom = marginBottom;
        this.marginRight = marginRight;
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

    public Integer getMarginTop() {
        return marginTop;
    }

    public void setMarginTop(Integer marginTop) {
        this.marginTop = marginTop;
    }

    public Integer getMarginBottom() {
        return marginBottom;
    }

    public void setMarginBottom(Integer marginBottom) {
        this.marginBottom = marginBottom;
    }

    public Integer getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(Integer marginRight) {
        this.marginRight = marginRight;
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
}
