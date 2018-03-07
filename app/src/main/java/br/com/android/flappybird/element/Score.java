package br.com.android.flappybird.element;

import android.graphics.Canvas;
import android.graphics.Paint;

import br.com.android.flappybird.graphic.Colors;

/**
 * Created by admin on 07/03/2018.
 */

public class Score {

    private static final Paint WHITE = Colors.getScoreColor();
    public static final int X = 50;
    public static final int Y = 100;
    private int scores;

    public Score() {
        this.scores = 0;
    }

    public void paint(Canvas canvas) {
        canvas.drawText(String.valueOf(scores), X, Y, WHITE);
    }

    public void score() {
        scores++;
    }
}