package android.support.p007v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.annotation.RequiresApi;

@RequiresApi(9)
/* renamed from: android.support.v7.widget.ActionBarBackgroundDrawable */
class ActionBarBackgroundDrawable extends Drawable {
    final ActionBarContainer mContainer;

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.mContainer = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.mContainer.mIsSplit) {
            if (this.mContainer.mBackground != null) {
                this.mContainer.mBackground.draw(canvas);
            }
            if (this.mContainer.mStackedBackground != null && this.mContainer.mIsStacked) {
                this.mContainer.mStackedBackground.draw(canvas);
            }
        } else if (this.mContainer.mSplitBackground != null) {
            this.mContainer.mSplitBackground.draw(canvas);
        }
    }
}
