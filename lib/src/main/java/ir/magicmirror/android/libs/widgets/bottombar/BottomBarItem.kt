package ir.magicmirror.android.libs.widgets.bottombar

import android.graphics.RectF
import android.graphics.drawable.Drawable

data class BottomBarItem (
    var title: String,
    val icon: Drawable,
    var rect: RectF = RectF(),
    var alpha: Int
)
