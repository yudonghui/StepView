package com.sorgs.stepview.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.sorgs.stepview.bean.StepBean;
import com.sorgs.stepview.utils.CalcUtils;

import java.util.List;

public class TestView extends View {
    /**
     * 线段的高度
     */
    private float mCompletedLineHeight = CalcUtils.dp2px(getContext(), 2f);

    /**
     * 图标宽度
     */
    private float mIconWidth = CalcUtils.dp2px(getContext(), 24f);
    /**
     * 图标的高度
     */
    private float mIconHeight = CalcUtils.dp2px(getContext(), 24f);
    /**
     * 线段长度
     */
    private float mLineWidth = CalcUtils.dp2px(getContext(), 45f);

    /**
     * 已经完成的图标
     */
    private Drawable mCompleteIcon;
    /**
     * 正在进行的图标
     */
    private Drawable mAttentionIcon;
    /**
     * 默认的图标
     */
    private Drawable mDefaultIcon;
    /**
     * 图标中心点Y
     */
    private float mCenterY;
    /**
     * 线段的左上方的Y
     */
    private float mLeftY;
    /**
     * 线段的右下方的Y
     */
    private float mRightY;
    /**
     * 数据源
     */
    private List<StepBean> mStepBeanList;
    public TestView(Context context) {
        super(context);
    }
}
