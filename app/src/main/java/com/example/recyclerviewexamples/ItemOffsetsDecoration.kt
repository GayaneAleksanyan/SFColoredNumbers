package com.example.recyclerviewexamples

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView

class ItemOffsetsDecoration(private val context: Context) : RecyclerView.ItemDecoration() {
    @Deprecated("Deprecated in Java")
    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        super.getItemOffsets(outRect, itemPosition, parent)
        val hSide = context.resources.getDimension(R.dimen.h_side).toInt()
        val vSide = context.resources.getDimension(R.dimen.v_side).toInt()
        outRect.set(hSide, vSide, hSide, vSide)
    }

    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        val paint = Paint()
        paint.color = context.getColor(R.color.teal_200)
        paint.strokeWidth = 15F
        c.drawLine(0f, 0f, 1500f, 1500f, paint)
    }
}