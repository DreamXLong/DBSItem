package com.xlong.dbsitem.DBSItemViewParameter;

import android.graphics.drawable.Drawable;

import java.util.List;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleSheetSubTitle {
    private List<String> listText;
    private Integer textColor;
    private Integer textSize;
    private Integer marginLeft;
    private Integer marginTop;
    private Integer marginBottom;
    private Integer marginRight;
    private Drawable drawable;
    private Integer drawablePadding;

    public DBSItemStyleSheetSubTitle() {
    }

    public DBSItemStyleSheetSubTitle(Integer textColor, Integer textSize, Drawable drawable) {
        this.textColor = textColor;
        this.textSize = textSize;
        this.drawable = drawable;
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());

    }

    public DBSItemStyleSheetSubTitle(Integer textColor, Integer textSize, Integer marginLeft, Integer margIntegerop, Integer marginBottom, int marginRight) {
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

    public Integer getDrawablePadding() {
        return drawablePadding;
    }

    public void setDrawablePadding(Integer drawablePadding) {
        this.drawablePadding = drawablePadding;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
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
