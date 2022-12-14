package android.support.p007v7.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.annotation.RestrictTo;
import android.support.p007v7.appcompat.C0384R;
import android.util.AttributeSet;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v7.graphics.drawable.DrawerArrowDrawable */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = ((float) Math.toRadians(45.0d));
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection = 2;
    private float mMaxCutForBarSize;
    private final Paint mPaint = new Paint();
    private final Path mPath = new Path();
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror = false;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.graphics.drawable.DrawerArrowDrawable$ArrowDirection */
    public @interface ArrowDirection {
    }

    private static float lerp(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    public int getOpacity() {
        return -3;
    }

    public DrawerArrowDrawable(Context context) {
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeJoin(Paint.Join.MITER);
        this.mPaint.setStrokeCap(Paint.Cap.BUTT);
        this.mPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C0384R.styleable.DrawerArrowToggle, C0384R.attr.drawerArrowStyle, C0384R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(obtainStyledAttributes.getColor(C0384R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(obtainStyledAttributes.getDimension(C0384R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(obtainStyledAttributes.getBoolean(C0384R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize((float) Math.round(obtainStyledAttributes.getDimension(C0384R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.mSize = obtainStyledAttributes.getDimensionPixelSize(C0384R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mBarLength = (float) Math.round(obtainStyledAttributes.getDimension(C0384R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.mArrowHeadLength = (float) Math.round(obtainStyledAttributes.getDimension(C0384R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = obtainStyledAttributes.getDimension(C0384R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public void setArrowHeadLength(float f) {
        if (this.mArrowHeadLength != f) {
            this.mArrowHeadLength = f;
            invalidateSelf();
        }
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public void setArrowShaftLength(float f) {
        if (this.mArrowShaftLength != f) {
            this.mArrowShaftLength = f;
            invalidateSelf();
        }
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public void setBarLength(float f) {
        if (this.mBarLength != f) {
            this.mBarLength = f;
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i) {
        if (i != this.mPaint.getColor()) {
            this.mPaint.setColor(i);
            invalidateSelf();
        }
    }

    @ColorInt
    public int getColor() {
        return this.mPaint.getColor();
    }

    public void setBarThickness(float f) {
        if (this.mPaint.getStrokeWidth() != f) {
            this.mPaint.setStrokeWidth(f);
            this.mMaxCutForBarSize = (float) (((double) (f / 2.0f)) * Math.cos((double) ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    public void setGapSize(float f) {
        if (f != this.mBarGap) {
            this.mBarGap = f;
            invalidateSelf();
        }
    }

    public void setDirection(int i) {
        if (i != this.mDirection) {
            this.mDirection = i;
            invalidateSelf();
        }
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    public void setSpinEnabled(boolean z) {
        if (this.mSpin != z) {
            this.mSpin = z;
            invalidateSelf();
        }
    }

    public int getDirection() {
        return this.mDirection;
    }

    public void setVerticalMirror(boolean z) {
        if (this.mVerticalMirror != z) {
            this.mVerticalMirror = z;
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        if (android.support.p004v4.graphics.drawable.DrawableCompat.getLayoutDirection(r20) == 1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (android.support.p004v4.graphics.drawable.DrawableCompat.getLayoutDirection(r20) == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            android.graphics.Rect r2 = r20.getBounds()
            int r3 = r0.mDirection
            r4 = 3
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x001a
            switch(r3) {
                case 0: goto L_0x0021;
                case 1: goto L_0x0018;
                default: goto L_0x0012;
            }
        L_0x0012:
            int r3 = android.support.p004v4.graphics.drawable.DrawableCompat.getLayoutDirection(r20)
            if (r3 != r6) goto L_0x0021
        L_0x0018:
            r5 = r6
            goto L_0x0021
        L_0x001a:
            int r3 = android.support.p004v4.graphics.drawable.DrawableCompat.getLayoutDirection(r20)
            if (r3 != 0) goto L_0x0021
            goto L_0x0018
        L_0x0021:
            float r3 = r0.mArrowHeadLength
            float r4 = r0.mArrowHeadLength
            float r3 = r3 * r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r4
            double r7 = (double) r3
            double r7 = java.lang.Math.sqrt(r7)
            float r3 = (float) r7
            float r7 = r0.mBarLength
            float r8 = r0.mProgress
            float r3 = lerp(r7, r3, r8)
            float r7 = r0.mBarLength
            float r8 = r0.mArrowShaftLength
            float r9 = r0.mProgress
            float r7 = lerp(r7, r8, r9)
            float r8 = r0.mMaxCutForBarSize
            float r9 = r0.mProgress
            r10 = 0
            float r8 = lerp(r10, r8, r9)
            int r8 = java.lang.Math.round(r8)
            float r8 = (float) r8
            float r9 = ARROW_HEAD_ANGLE
            float r11 = r0.mProgress
            float r9 = lerp(r10, r9, r11)
            if (r5 == 0) goto L_0x005b
            r11 = r10
            goto L_0x005d
        L_0x005b:
            r11 = -1020002304(0xffffffffc3340000, float:-180.0)
        L_0x005d:
            r12 = 1127481344(0x43340000, float:180.0)
            if (r5 == 0) goto L_0x0063
            r13 = r12
            goto L_0x0064
        L_0x0063:
            r13 = r10
        L_0x0064:
            float r14 = r0.mProgress
            float r11 = lerp(r11, r13, r14)
            double r13 = (double) r3
            r15 = r11
            double r10 = (double) r9
            double r16 = java.lang.Math.cos(r10)
            r18 = r5
            double r4 = r13 * r16
            long r3 = java.lang.Math.round(r4)
            float r3 = (float) r3
            double r4 = java.lang.Math.sin(r10)
            double r13 = r13 * r4
            long r4 = java.lang.Math.round(r13)
            float r4 = (float) r4
            android.graphics.Path r5 = r0.mPath
            r5.rewind()
            float r5 = r0.mBarGap
            android.graphics.Paint r9 = r0.mPaint
            float r9 = r9.getStrokeWidth()
            float r5 = r5 + r9
            float r9 = r0.mMaxCutForBarSize
            float r9 = -r9
            float r10 = r0.mProgress
            float r5 = lerp(r5, r9, r10)
            float r9 = -r7
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            android.graphics.Path r11 = r0.mPath
            float r13 = r9 + r8
            r14 = 0
            r11.moveTo(r13, r14)
            android.graphics.Path r11 = r0.mPath
            float r8 = r8 * r10
            float r7 = r7 - r8
            r11.rLineTo(r7, r14)
            android.graphics.Path r7 = r0.mPath
            r7.moveTo(r9, r5)
            android.graphics.Path r7 = r0.mPath
            r7.rLineTo(r3, r4)
            android.graphics.Path r7 = r0.mPath
            float r5 = -r5
            r7.moveTo(r9, r5)
            android.graphics.Path r5 = r0.mPath
            float r4 = -r4
            r5.rLineTo(r3, r4)
            android.graphics.Path r3 = r0.mPath
            r3.close()
            r21.save()
            android.graphics.Paint r3 = r0.mPaint
            float r3 = r3.getStrokeWidth()
            int r4 = r2.height()
            float r4 = (float) r4
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r5 * r3
            float r4 = r4 - r5
            float r5 = r0.mBarGap
            r7 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r7
            float r4 = r4 - r5
            int r4 = (int) r4
            int r4 = r4 / 4
            int r4 = r4 * 2
            float r4 = (float) r4
            r5 = 1069547520(0x3fc00000, float:1.5)
            float r3 = r3 * r5
            float r5 = r0.mBarGap
            float r3 = r3 + r5
            float r4 = r4 + r3
            int r2 = r2.centerX()
            float r2 = (float) r2
            r1.translate(r2, r4)
            boolean r2 = r0.mSpin
            if (r2 == 0) goto L_0x0108
            boolean r2 = r0.mVerticalMirror
            r2 = r2 ^ r18
            if (r2 == 0) goto L_0x0101
            r6 = -1
        L_0x0101:
            float r2 = (float) r6
            float r11 = r15 * r2
            r1.rotate(r11)
            goto L_0x010d
        L_0x0108:
            if (r18 == 0) goto L_0x010d
            r1.rotate(r12)
        L_0x010d:
            android.graphics.Path r2 = r0.mPath
            android.graphics.Paint r3 = r0.mPaint
            r1.drawPath(r2, r3)
            r21.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p007v7.graphics.drawable.DrawerArrowDrawable.draw(android.graphics.Canvas):void");
    }

    public void setAlpha(int i) {
        if (i != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.mSize;
    }

    public int getIntrinsicWidth() {
        return this.mSize;
    }

    @FloatRange(from = 0.0d, mo321to = 1.0d)
    public float getProgress() {
        return this.mProgress;
    }

    public void setProgress(@FloatRange(from = 0.0d, mo321to = 1.0d) float f) {
        if (this.mProgress != f) {
            this.mProgress = f;
            invalidateSelf();
        }
    }

    public final Paint getPaint() {
        return this.mPaint;
    }
}
