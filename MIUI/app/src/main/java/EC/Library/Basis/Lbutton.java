package EC.Library.Basis;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.Gravity;
import android.widget.Button;
import android.util.AttributeSet;
import android.service.controls.Control;


public class Lbutton extends Button
{
	public static int[]	mNormalState		= new int[] {};
	public static int[]	mPressState			= new int[] { android.R.attr.state_pressed, android.R.attr.state_enabled };
	public static int[]	mDisableState		= new int[] { -android.R.attr.state_enabled };
	public static int[]	mSelectedState		= new int[] { android.R.attr.state_selected, android.R.attr.state_enabled };
	private int			mRadius				= 20;																			//默认的圆角半径

	//默认文字和背景颜色
	private int			mBgNormalColor		= Color.WHITE;
	private int			mBgPressedColor		= Color.argb(255,224,224,224);
	private int			mTextNormalColor	= Color.BLACK;
	private int			mTextPressedColor	= Color.GRAY;

    public static int DETERMINE = 0;
    
    public static int CANCEL = 1;
    
	public Lbutton(Context context)
	{
		super(context);
		initUI();
	}
    
    public Lbutton(Context context,AttributeSet attrs){
        super(context,attrs);
        initUI();
    }
    
    public void setButtonStyle(int Style){
        if(Style == DETERMINE){
            mBgNormalColor = Color.argb(255,245,245,245);
            mBgPressedColor = Color.argb(255,224,224,224);
            mTextNormalColor = Color.WHITE;
            mTextPressedColor = Color.WHITE;
        }else if(Style == CANCEL){
            mBgNormalColor = Color.argb(255,245,245,245);
            mBgPressedColor = Color.argb(255,224,224,224);
            mTextNormalColor = Color.GRAY;
            mTextPressedColor = Color.GRAY;
        }
        buildDraweableState();
		buildColorDrawableState();
    }

	private void initUI()
	{
		setGravity(Gravity.CENTER);
		buildDraweableState();
		buildColorDrawableState();
	}

	/**
	 * 构建图片drawble
	 */
	private void buildColorDrawableState()
	{
		ColorStateList colorStateList = new ColorStateList(new int[][] { mPressState, mNormalState },
														   new int[] { mTextPressedColor, mTextNormalColor });
		setTextColor(colorStateList);
	}

	/**
	 * 构建背景Drawble
	 */
	private void buildDraweableState()
	{

		float outRectr[] = new float[] { mRadius, mRadius, mRadius, mRadius, mRadius, mRadius, mRadius, mRadius };
		//创建状态管理器
		StateListDrawable drawable = new StateListDrawable();
		/**
		 * 注意StateListDrawable的构造方法我们这里使用的
		 * 是第一参数它是一个float的数组保存的是圆角的半径，它是按照top-left顺时针保存的八个值
		 */
		//创建圆弧形状
		RoundRectShape rectShape = new RoundRectShape(outRectr, null, null);
		//创建drawable
		ShapeDrawable pressedDrawable = new ShapeDrawable(rectShape);
		//设置我们按钮背景的颜色
		pressedDrawable.getPaint().setColor(mBgPressedColor);
		//添加到状态管理里面
		drawable.addState(mPressState, pressedDrawable);

		//		ShapeDrawable disableDrawable = new ShapeDrawable(rectShape);
		//		disableDrawable.getPaint().setColor(prssedClor);
		//		disableDrawable.getPaint().setAlpha(125);
		//		drawable.addState(mDisableState, disableDrawable);

		ShapeDrawable normalDrawable = new ShapeDrawable(rectShape);
		normalDrawable.getPaint().setColor(mBgNormalColor);
		drawable.addState(mNormalState, normalDrawable);
		//设置我们的背景，就是xml里面的selector
		setBackgroundDrawable(drawable);
	}

	/**
	 * 设置圆角矩形
	 * 
	 * @param radius
	 */
	public void setRadius(int radius)
	{
		this.mRadius = radius;
		buildDraweableState();
	}

	/**
	 * 设置按钮背景颜色
	 * 
	 * @param normalColor
	 * @param prssedClor
	 */
	public void setBgNormalPressedcolor(int normalColor, int prssedClor)
	{

		mBgNormalColor = normalColor;
		mBgPressedColor = prssedClor;
		buildDraweableState();

	}

	/**
	 * 设置按钮文字颜色
	 * 
	 * @param normalColor
	 * @param pressedColor
	 */
	public void setTextNormalPressedcolor(int normalColor, int pressedColor)
	{
		mTextPressedColor = pressedColor;
		mTextNormalColor = normalColor;
		buildColorDrawableState();

	}
}
