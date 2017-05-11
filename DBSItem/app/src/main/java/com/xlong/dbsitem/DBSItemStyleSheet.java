package com.xlong.dbsitem;

import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetBootImage;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetButton;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetMainImage;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetMainTitle;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetSubTitle;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetTextField;

/**
 * Created by SLP on 2017/4/14.
 */

public class DBSItemStyleSheet {
    private DBSItemStyleSheetBootImage styleSheetBootImage;
    private DBSItemStyleSheetButton styleSheetButton;
    private DBSItemStyleSheetMainImage styleSheetMainImage;
    private DBSItemStyleSheetMainTitle styleSheetMainTitle;
    private DBSItemStyleSheetSubTitle styleSheetSubTitle;
    private DBSItemStyleSheetTextField styleSheetTextField;

    public DBSItemStyleSheet() {
        this.styleSheetBootImage = new DBSItemStyleSheetBootImage();
        this.styleSheetButton = new DBSItemStyleSheetButton();
        this.styleSheetMainImage = new DBSItemStyleSheetMainImage();
        this.styleSheetMainTitle = new DBSItemStyleSheetMainTitle();
        this.styleSheetSubTitle = new DBSItemStyleSheetSubTitle();
        this.styleSheetTextField = new DBSItemStyleSheetTextField();
    }

    public DBSItemStyleSheet(DBSItemStyleSheetBootImage styleSheetBootImage, DBSItemStyleSheetButton styleSheetButton,
                             DBSItemStyleSheetMainImage styleSheetMainImage, DBSItemStyleSheetMainTitle styleSheetMainTitle,
                             DBSItemStyleSheetSubTitle styleSheetSubTitle, DBSItemStyleSheetTextField styleSheetTextField) {
        this.styleSheetBootImage = styleSheetBootImage;
        this.styleSheetButton = styleSheetButton;
        this.styleSheetMainImage = styleSheetMainImage;
        this.styleSheetMainTitle = styleSheetMainTitle;
        this.styleSheetSubTitle = styleSheetSubTitle;
        this.styleSheetTextField = styleSheetTextField;
    }

    public DBSItemStyleSheetBootImage getStyleSheetBootImage() {
        return styleSheetBootImage;
    }

    public void setStyleSheetBootImage(DBSItemStyleSheetBootImage styleSheetBootImage) {
        this.styleSheetBootImage = styleSheetBootImage;
    }

    public DBSItemStyleSheetButton getStyleSheetButton() {
        return styleSheetButton;
    }

    public void setStyleSheetButton(DBSItemStyleSheetButton styleSheetButton) {
        this.styleSheetButton = styleSheetButton;
    }

    public DBSItemStyleSheetMainImage getStyleSheetMainImage() {
        return styleSheetMainImage;
    }

    public void setStyleSheetMainImage(DBSItemStyleSheetMainImage styleSheetMainImage) {
        this.styleSheetMainImage = styleSheetMainImage;
    }

    public DBSItemStyleSheetMainTitle getStyleSheetMainTitle() {
        return styleSheetMainTitle;
    }

    public void setStyleSheetMainTitle(DBSItemStyleSheetMainTitle styleSheetMainTitle) {
        this.styleSheetMainTitle = styleSheetMainTitle;
    }

    public DBSItemStyleSheetSubTitle getStyleSheetSubTitle() {
        return styleSheetSubTitle;
    }

    public void setStyleSheetSubTitle(DBSItemStyleSheetSubTitle styleSheetSubTitle) {
        this.styleSheetSubTitle = styleSheetSubTitle;
    }

    public DBSItemStyleSheetTextField getStyleSheetTextField() {
        return styleSheetTextField;
    }

    public void setStyleSheetTextField(DBSItemStyleSheetTextField styleSheetTextField) {
        this.styleSheetTextField = styleSheetTextField;
    }
}
