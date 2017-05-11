package com.xlong.dbsitem.DBSItemViewParameter;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleSheetTextField {
    private Integer textSize;
    private Integer textColor;
    private Integer marginLeft;
    private Integer marginTop;
    private Integer marginBottom;
    private Integer marginRight;
    private String textHint;
    private Integer textHintColor;

    public DBSItemStyleSheetTextField() {
    }

    public DBSItemStyleSheetTextField(Integer textSize, Integer textColor) {
        this.textSize = textSize;
        this.textColor = textColor;
    }

    public DBSItemStyleSheetTextField(Integer textSize, Integer textColor, Integer marginLeft, Integer marginTop, Integer marginBottom, Integer marginRight) {
        this.textSize = textSize;
        this.textColor = textColor;
        this.marginLeft = marginLeft;
        this.marginTop = marginTop;
        this.marginBottom = marginBottom;
        this.marginRight = marginRight;
    }

    public Integer getTextHintColor() {
        return textHintColor;
    }

    public void setTextHintColor(Integer textHintColor) {
        this.textHintColor = textHintColor;
    }

    public String getTextHint() {
        return textHint;
    }

    public void setTextHint(String textHint) {
        this.textHint = textHint;
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

    public void setMarginTop(int marginTop) {
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

    public Integer getTextSize() {
        return textSize;
    }

    public void setTextSize(Integer textSize) {
        this.textSize = textSize;
    }

    public Integer getTextColor() {
        return textColor;
    }

    public void setTextColor(Integer textColor) {
        this.textColor = textColor;
    }

}
