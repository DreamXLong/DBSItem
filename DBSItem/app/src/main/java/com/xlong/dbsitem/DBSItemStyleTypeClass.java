package com.xlong.dbsitem;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import static android.graphics.Color.BLACK;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemStyleTypeClass {

    public static void setMainImageStyle(Context context, DBSItemStyleSheet styleSheet, RoundImageView roundImageView, int postion) {
        if (styleSheet.getStyleSheetMainImage() != null) {
            roundImageView.setBorderRadius(styleSheet.getStyleSheetMainImage().getCornerRadius() != null
                    ? DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getCornerRadius()) : 0);
            roundImageView.setType(styleSheet.getStyleSheetMainImage().getType() != null
                    ? DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getType()) : RoundImageView.TYPE_ROUND);
            if (styleSheet.getStyleSheetMainImage().getListUrl() != null) {
                if (styleSheet.getStyleSheetMainImage().getlocalDrawable() != null) {
                    Picasso.with(context)
                            .load(DBSDensityUtil.toURLString(styleSheet.getStyleSheetMainImage().getListUrl().get(postion)))
                            .fit().placeholder(styleSheet.getStyleSheetMainImage().getlocalDrawable())
                            .error(styleSheet.getStyleSheetMainImage().getlocalDrawable())
                            .into(roundImageView);
                } else {
                    Picasso.with(context)
                            .load(DBSDensityUtil.toURLString(styleSheet.getStyleSheetMainImage().getListUrl().get(postion)))
                            .fit().placeholder(R.mipmap.placehoderimage)
                            .error(R.mipmap.placehoderimage)
                            .into(roundImageView);
                }
            } else {
                roundImageView.setImageResource(R.mipmap.placehoderimage);
            }
            widHeiView(styleSheet.getStyleSheetMainImage().getWidth() != null
                            ? DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetButton().getWidth()) : WRAP_CONTENT,
                    styleSheet.getStyleSheetMainImage().getHeight() != null
                            ? DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getHeight()) : WRAP_CONTENT,
                    roundImageView);
            int left = 0;
            int top = 0;
            int right = 0;
            int bottom = 0;
            if (styleSheet.getStyleSheetMainImage().getMarginLeft() != null) {
                left = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginLeft());
            } else {
                left = 0;
            }
            if (styleSheet.getStyleSheetMainImage().getMarginLeft() != null) {
                top = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginTop());
            } else {
                top = 0;
            }
            if (styleSheet.getStyleSheetMainImage().getMarginLeft() != null) {
                right = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginRight());
            } else {
                right = 0;
            }
            if (styleSheet.getStyleSheetMainImage().getMarginLeft() != null) {
                bottom = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginBottom());
            } else {
                bottom = 0;
            }
            marginView(left, top, right, bottom, roundImageView);
        }
    }

    public static void setMainTitleStyle(Context context, DBSItemStyleSheet styleSheet, TextView mainTitle, int postion) {
        if (styleSheet.getStyleSheetMainImage() != null) {
            int color = BLACK;
            if (styleSheet.getStyleSheetMainTitle().getTextColor() != null) {
                color = styleSheet.getStyleSheetMainTitle().getTextColor();
            } else {
                color = BLACK;
            }
            mainTitle.setTextColor(color);
            mainTitle.setTextSize(styleSheet.getStyleSheetMainTitle().getTextSize() != null
                    ? DBSDensityUtil.sp2px(context, styleSheet.getStyleSheetMainTitle().getTextSize()) : DBSDensityUtil.sp2px(context, 10));
            if (styleSheet.getStyleSheetMainTitle().getListText() != null) {
                mainTitle.setText(styleSheet.getStyleSheetMainTitle().getListText().get(postion));
            }
            int left = 0;
            int top = 0;
            int right = 0;
            int bottom = 0;
            if (styleSheet.getStyleSheetMainTitle().getMarginLeft() != null) {
                left = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginLeft());
            } else {
                left = 0;
            }
            if (styleSheet.getStyleSheetMainTitle().getMarginLeft() != null) {
                top = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginTop());
            } else {
                top = 0;
            }
            if (styleSheet.getStyleSheetMainTitle().getMarginLeft() != null) {
                right = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginRight());
            } else {
                right = 0;
            }
            if (styleSheet.getStyleSheetMainTitle().getMarginLeft() != null) {
                bottom = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginBottom());
            } else {
                bottom = 0;
            }

            marginView(left, top, right, bottom, mainTitle);
        }
    }

    public static void setSubTitleStyle(Context context, DBSItemStyleSheet styleSheet, TextView subTitle, int postion) {
        if (styleSheet.getStyleSheetMainImage() != null) {
            int color = BLACK;
            if (styleSheet.getStyleSheetMainTitle().getTextColor() != null) {
                color = styleSheet.getStyleSheetMainTitle().getTextColor();
            } else {
                color = BLACK;
            }
            subTitle.setTextColor(color);
            subTitle.setTextSize(styleSheet.getStyleSheetMainTitle().getTextSize() != null
                    ? DBSDensityUtil.sp2px(context, styleSheet.getStyleSheetMainTitle().getTextSize()) : DBSDensityUtil.sp2px(context, 10));
            if (styleSheet.getStyleSheetSubTitle().getDrawable() != null) {
                Drawable drawable = styleSheet.getStyleSheetSubTitle().getDrawable();
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                subTitle.setCompoundDrawables(null, null, drawable, null);
            } else {
                Drawable drawable = context.getResources().getDrawable(R.mipmap.icinto22);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                subTitle.setCompoundDrawables(null, null, drawable, null);
            }
            subTitle.setCompoundDrawablePadding(styleSheet.getStyleSheetSubTitle().getDrawablePadding() != null
                    ? styleSheet.getStyleSheetSubTitle().getDrawablePadding() : 0);
            if (styleSheet.getStyleSheetSubTitle().getListText() != null) {
                subTitle.setText(styleSheet.getStyleSheetSubTitle().getListText().get(postion));
            }
            int left = 0;
            int top = 0;
            int right = 0;
            int bottom = 0;
            if (styleSheet.getStyleSheetSubTitle().getMarginLeft() != null) {
                left = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginLeft());
            } else {
                left = 0;
            }
            if (styleSheet.getStyleSheetSubTitle().getMarginLeft() != null) {
                top = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginTop());
            } else {
                top = 0;
            }
            if (styleSheet.getStyleSheetSubTitle().getMarginLeft() != null) {
                right = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginRight());
            } else {
                right = 0;
            }
            if (styleSheet.getStyleSheetSubTitle().getMarginLeft() != null) {
                bottom = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginBottom());
            } else {
                bottom = 0;
            }
            marginView(left, top, right, bottom, subTitle);
        }
    }

    public static void setButtonStyle(Context context, DBSItemStyleSheet styleSheet, Button btn, int postion) {
        if (styleSheet.getStyleSheetMainImage() != null) {
            if (styleSheet.getStyleSheetButton().getBg() != null) {
                btn.setBackgroundResource(styleSheet.getStyleSheetButton().getBg());
            } else {
                btn.setBackgroundResource(R.drawable.myfragment_login_btn_gray);
            }
            if (styleSheet.getStyleSheetButton().getTextColor() != null) {
                btn.setTextColor(styleSheet.getStyleSheetButton().getTextColor());
            } else {
                btn.setTextColor(BLACK);
            }
            btn.setTextSize(styleSheet.getStyleSheetButton().getTextSize() != null
                    ? DBSDensityUtil.sp2px(context, styleSheet.getStyleSheetButton().getTextSize()) : DBSDensityUtil.sp2px(context, 10));
            if (styleSheet.getStyleSheetButton().getListText() != null) {
                btn.setText(styleSheet.getStyleSheetButton().getListText() != null
                        ? styleSheet.getStyleSheetButton().getListText().get(postion) : "绑定");
            }
            widHeiView(styleSheet.getStyleSheetButton().getWidth() != null
                            ? DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetButton().getWidth()) : WRAP_CONTENT,
                    styleSheet.getStyleSheetButton().getHeight() != null
                            ? DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetButton().getHeight()) : WRAP_CONTENT,
                    btn);
            int left = 0;
            int top = 0;
            int right = 0;
            int bottom = 0;
            if (styleSheet.getStyleSheetButton().getMarginLeft() != null) {
                left = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginLeft());
            } else {
                left = 0;
            }
            if (styleSheet.getStyleSheetButton().getMarginLeft() != null) {
                top = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginTop());
            } else {
                top = 0;
            }
            if (styleSheet.getStyleSheetButton().getMarginLeft() != null) {
                right = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginRight());
            } else {
                right = 0;
            }
            if (styleSheet.getStyleSheetButton().getMarginLeft() != null) {
                bottom = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginBottom());
            } else {
                bottom = 0;
            }
            marginView(left, top, right, bottom, btn);
        }
    }

    public static void setEditTextStyle(Context context, DBSItemStyleSheet styleSheet, EditText editText, int postion) {
        if (styleSheet.getStyleSheetMainImage() != null) {
            int color = BLACK;
            if (styleSheet.getStyleSheetMainTitle().getTextColor() != null) {
                color = styleSheet.getStyleSheetMainTitle().getTextColor();
            } else {
                color = BLACK;
            }
            editText.setHint(styleSheet.getStyleSheetTextField().getTextHint() != null ? styleSheet.getStyleSheetTextField().getTextHint() : "");
            if (styleSheet.getStyleSheetTextField().getTextHintColor() != null) {
                editText.setHintTextColor(styleSheet.getStyleSheetTextField().getTextHintColor());
            } else {
                editText.setHintTextColor(context.getResources().getColor(R.color.text_black_nomal));
            }
            editText.setTextColor(color);
            editText.setTextSize(styleSheet.getStyleSheetMainTitle().getTextSize() != null
                    ? DBSDensityUtil.sp2px(context, styleSheet.getStyleSheetMainTitle().getTextSize()) : DBSDensityUtil.sp2px(context, 10));
            int left = 0;
            int top = 0;
            int right = 0;
            int bottom = 0;
            if (styleSheet.getStyleSheetTextField().getMarginLeft() != null) {
                left = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginLeft());
            } else {
                left = 0;
            }
            if (styleSheet.getStyleSheetTextField().getMarginLeft() != null) {
                top = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginTop());
            } else {
                top = 0;
            }
            if (styleSheet.getStyleSheetTextField().getMarginLeft() != null) {
                right = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginRight());
            } else {
                right = 0;
            }
            if (styleSheet.getStyleSheetTextField().getMarginLeft() != null) {
                bottom = DBSDensityUtil.dp2px(context, styleSheet.getStyleSheetMainImage().getMarginBottom());
            } else {
                bottom = 0;
            }
            marginView(left, top, right, bottom, editText);
        }
    }

    private static void marginView(int left, int top, int right, int bottom, View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(left,
                top,
                right,
                bottom);
        view.setLayoutParams(layoutParams);
    }

    private static void widHeiView(int width, int height, View view) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.width = width;
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
    }
}

