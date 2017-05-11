package com.xlong.dbsitem;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetBootImage;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetButton;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetMainImage;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetMainTitle;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetSubTitle;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetTextField;

import java.util.List;

import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;


/**
 * Created by SLP on 2017/4/12.
 */

public class DBSItemViewHolder<T> {
    private SparseArray<View> mViews;
    private List<T> mDatas;
    private View mConvertView;
    private int position;
    private Context context;
    private int layoutId;
    private ViewGroup parent;

    public static final int DBSItemTypeSetting = 1; //默认设置样式 包含：图标  大标题  小标题  箭头
    public static final int DBSItemTypeNoImgSetting = 2;//无图标设置样式 包含：大标题  小标题  箭头
    public static final int DBSItemTypeHint = 3;//提示样式 包含：图标  大标题  小标题
    public static final int DBSItemTypeBind = 4;//默认绑定样式 包含：图标  大标题  按钮
    public static final int DBSItemTypeNoImgBind = 5;//无图标绑定样式 包含：图标  大标题  按钮
    public static final int DBSItemTypeTitleInput = 6;//文字标题输入样式 包含：标题  文本框
    public static final int DBSItemTypeImgInput = 7;//图标标题输入样式 包含：图片 文本框

    private DBSItemStyleTypeSettingInterface typeSettingInterface;
    private DBSItemStyleTypeNoImgSettingInterface typeNoImgSettingInterface;
    private DBSItemStyleTypeHintInterface typeHintInterface;
    private DBSItemStyleTypeBindInterface typeBindInterface;
    private DBSItemTypeNoImgBindInterface typeNoImgBindInterface;
    private DBSItemTypeTitleInputInterface typeTitleInputInterface;
    private DBSItemTypeImgInputInterface typeImgInputInterface;

    public interface DBSItemStyleTypeSettingInterface {
        void typeSetting(RoundImageView imageView, TextView mainTitle, TextView subTitle);
    }

    public void setDBSItemStyleTypeSettingInterface(DBSItemStyleTypeSettingInterface typeSettingInterface) {
        this.typeSettingInterface = typeSettingInterface;
    }

    public interface DBSItemStyleTypeNoImgSettingInterface {
        void typeNoImgSetting(TextView mainTitle, TextView subTitle);
    }

    public void setDBSItemStyleTypeNoImgSettingInterface(DBSItemStyleTypeNoImgSettingInterface typeNoImgSettingInterface) {
        this.typeNoImgSettingInterface = typeNoImgSettingInterface;
    }

    public interface DBSItemStyleTypeHintInterface {
        void typeHint(RoundImageView imageView, TextView mainTitle, TextView subTitle);
    }

    public void setDBSItemStyleTypeNoImgSettingInterface(DBSItemStyleTypeHintInterface typeHintInterface) {
        this.typeHintInterface = typeHintInterface;
    }

    public interface DBSItemStyleTypeBindInterface {
        void typeBind(RoundImageView imageView, TextView mainTitle, Button bindBtn);
    }

    public void setDBSItemTypeBindInterface(DBSItemStyleTypeBindInterface typeBindInterface) {
        this.typeBindInterface = typeBindInterface;
    }

    public interface DBSItemTypeNoImgBindInterface {
        void typeNoImgBind(RoundImageView imageView, TextView mainTitle, Button bindBtn);
    }

    public void setDBSItemTypeNoImgBindInterface(DBSItemTypeNoImgBindInterface typeNoImgBindInterface) {
        this.typeNoImgBindInterface = typeNoImgBindInterface;
    }

    public interface DBSItemTypeTitleInputInterface {
        void typeTitleInput(TextView mainTitle, EditText inputEt);
    }

    public void setDBSItemTypeTitleInputInterface(DBSItemTypeTitleInputInterface typeTitleInputInterface) {
        this.typeTitleInputInterface = typeTitleInputInterface;
    }

    public interface DBSItemTypeImgInputInterface {
        void typeImgInput(RoundImageView imageView, EditText inputEt);
    }

    public void setDBSItemTypeImgInputInterface(DBSItemTypeImgInputInterface typeImgInputInterface) {
        this.typeImgInputInterface = typeImgInputInterface;
    }

    public DBSItemViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
        this.context = context;
        this.mViews = new SparseArray<View>();
        this.position = position;
        this.layoutId = layoutId;
        this.parent = parent;
//        mConvertView = runSwitchLayout(layoutId, position);
//        mConvertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
    }

    /**
     * 拿到一个ViewHolder对象
     *
     * @param context
     * @param convertView
     * @param parent
     * @param layoutId
     * @return
     */
    public static DBSItemViewHolder get(Context context, View convertView, ViewGroup parent, int layoutId, int position) {
        if (convertView == null) {
            return new DBSItemViewHolder(context, parent, layoutId, position);
        }
        return (DBSItemViewHolder) convertView.getTag();
    }

    public View getConvertView() {
        return mConvertView;
    }

    /**
     * 通过控件的Id获取对于的控件，如果没有则加入views
     *
     * @param viewId
     * @return
     */
    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    /**
     * 为TextView设置字符串
     *
     * @param viewId
     * @param text
     * @return
     */
    public DBSItemViewHolder setText(int viewId, String text) {
        TextView view = getView(viewId);
        view.setText(text);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @param drawableId
     * @return
     */
    public DBSItemViewHolder setImageResource(int viewId, int drawableId) {
        ImageView view = getView(viewId);
        view.setImageResource(drawableId);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @return
     */
    public DBSItemViewHolder setImageBitmap(int viewId, Bitmap bm) {
        ImageView view = getView(viewId);
        view.setImageBitmap(bm);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @return
     */
    public DBSItemViewHolder setImageByUrl(int viewId, String url) {
        Picasso.with(context).load(url).into((ImageView) getView(viewId));
        return this;
    }

    public int getPosition() {
        return position;
    }

    public View runSwitchLayout(int swich, DBSItemStyleSheet styleSheet) {
        View contentView = null;
        switch (swich) {
            case 0:
                contentView = LayoutInflater.from(context).inflate(layoutId, parent, false);
                break;
            case DBSItemTypeSetting:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_setting, parent, false);
                RoundImageView typeSettingImageView = (RoundImageView) contentView.findViewById(R.id.type_setting_imageview);
                TextView typeSettingMainTitle = (TextView) contentView.findViewById(R.id.type_setting_maintitle);
                TextView typeSettingSubTitle = (TextView) contentView.findViewById(R.id.type_setting_subtitle);
                DBSItemStyleTypeClass.setMainImageStyle(context, styleSheet, typeSettingImageView, position);
                DBSItemStyleTypeClass.setMainTitleStyle(context, styleSheet, typeSettingMainTitle, position);
                DBSItemStyleTypeClass.setSubTitleStyle(context, styleSheet, typeSettingSubTitle, position);
                if (typeSettingInterface != null) {
                    typeSettingInterface.typeSetting(typeSettingImageView, typeSettingMainTitle, typeSettingSubTitle);
                }
                break;
            case DBSItemTypeNoImgSetting:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_noimgsetting, parent, false);
                TextView typeNoImgSettingMainTitle = (TextView) contentView.findViewById(R.id.type_noimgsetting_maintitle);
                TextView typeNoImgSettingSubTitle = (TextView) contentView.findViewById(R.id.type_noimgsetting_subtitle);
                DBSItemStyleTypeClass.setMainTitleStyle(context, styleSheet, typeNoImgSettingMainTitle, position);
                DBSItemStyleTypeClass.setSubTitleStyle(context, styleSheet, typeNoImgSettingSubTitle, position);
                if (typeNoImgSettingInterface != null) {
                    typeNoImgSettingInterface.typeNoImgSetting(typeNoImgSettingMainTitle, typeNoImgSettingSubTitle);
                }
                break;
            case DBSItemTypeHint:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_hint, parent, false);
                RoundImageView typeHintImageView = (RoundImageView) contentView.findViewById(R.id.type_hint_imageview);
                TextView typeHintMainTitle = (TextView) contentView.findViewById(R.id.type_hint_maintitle);
                TextView typeHintSubTitle = (TextView) contentView.findViewById(R.id.type_hint_subtitle);
                DBSItemStyleTypeClass.setMainImageStyle(context, styleSheet, typeHintImageView, position);
                DBSItemStyleTypeClass.setMainTitleStyle(context, styleSheet, typeHintMainTitle, position);
                DBSItemStyleTypeClass.setSubTitleStyle(context, styleSheet, typeHintSubTitle, position);
                if (typeHintInterface != null) {
                    typeHintInterface.typeHint(typeHintImageView, typeHintMainTitle, typeHintSubTitle);
                }
                break;
            case DBSItemTypeBind:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_bind, parent, false);
                RoundImageView typeBindImageView = (RoundImageView) contentView.findViewById(R.id.type_bind_imageview);
                TextView typeBindMainTitle = (TextView) contentView.findViewById(R.id.type_bind_maintitle);
                Button typeBindBtn = (Button) contentView.findViewById(R.id.type_bind_cbtn);
                DBSItemStyleTypeClass.setMainImageStyle(context, styleSheet, typeBindImageView, position);
                DBSItemStyleTypeClass.setMainTitleStyle(context, styleSheet, typeBindMainTitle, position);
                DBSItemStyleTypeClass.setButtonStyle(context, styleSheet, typeBindBtn, position);
                if (typeBindInterface != null) {
                    typeBindInterface.typeBind(typeBindImageView, typeBindMainTitle, typeBindBtn);
                }
                break;
            case DBSItemTypeNoImgBind:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_noimgbind, parent, false);
                RoundImageView typeNoImgBindImageView = (RoundImageView) contentView.findViewById(R.id.type_noimgbind_imageview);
                TextView typeNoImgBindMainTitle = (TextView) contentView.findViewById(R.id.type_noimgbind_maintitle);
                Button typeNoImgBindNoImgBindBtn = (Button) contentView.findViewById(R.id.type_noimgbind_btn);
                DBSItemStyleTypeClass.setMainImageStyle(context, styleSheet, typeNoImgBindImageView, position);
                DBSItemStyleTypeClass.setMainTitleStyle(context, styleSheet, typeNoImgBindMainTitle, position);
                DBSItemStyleTypeClass.setButtonStyle(context, styleSheet, typeNoImgBindNoImgBindBtn, position);
                if (typeNoImgBindInterface != null) {
                    typeNoImgBindInterface.typeNoImgBind(typeNoImgBindImageView, typeNoImgBindMainTitle, typeNoImgBindNoImgBindBtn);
                }
                break;
            case DBSItemTypeTitleInput:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_titleinput, parent, false);
                TextView typeTitleInputMainTitle = (TextView) contentView.findViewById(R.id.type_titleinput_maintitle);
                EditText typeTitleInputInputEt = (EditText) contentView.findViewById(R.id.type_titleinput_text);
                DBSItemStyleTypeClass.setMainTitleStyle(context, styleSheet, typeTitleInputMainTitle, position);
                DBSItemStyleTypeClass.setEditTextStyle(context, styleSheet, typeTitleInputInputEt, position);
                if (typeTitleInputInterface != null) {
                    typeTitleInputInterface.typeTitleInput(typeTitleInputMainTitle, typeTitleInputInputEt);
                }
                break;
            case DBSItemTypeImgInput:
                contentView = LayoutInflater.from(context).inflate(R.layout.type_imginput, parent, false);
                RoundImageView typeImgInputImageView = (RoundImageView) contentView.findViewById(R.id.type_imginput_imageview);
                EditText typeImgInputInputEt = (EditText) contentView.findViewById(R.id.type_imginput_text);
                DBSItemStyleTypeClass.setMainImageStyle(context, styleSheet, typeImgInputImageView, position);
                DBSItemStyleTypeClass.setEditTextStyle(context, styleSheet, typeImgInputInputEt, position);
                if (typeImgInputInterface != null) {
                    typeImgInputInterface.typeImgInput(typeImgInputImageView, typeImgInputInputEt);
                }
                break;
        }
        contentView.setTag(this);
        return contentView;
    }
}
