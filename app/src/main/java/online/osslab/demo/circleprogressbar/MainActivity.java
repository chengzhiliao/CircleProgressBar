package online.osslab.demo.circleprogressbar;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;

import com.larswerkman.lobsterpicker.OnColorListener;
import com.larswerkman.lobsterpicker.sliders.LobsterShadeSlider;
import online.osslab.CircleProgressBar;

public class MainActivity extends AppCompatActivity {

    private CircleProgressBar circleProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleProgressBar = (CircleProgressBar)findViewById(R.id.circleProgressbar);
        circleProgressBar.setProgressWithAnimation(65);

        // PROGRESS
        ((SeekBar)findViewById(R.id.seekBarProgress)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                circleProgressBar.setProgress(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // BORDER
        ((SeekBar)findViewById(R.id.seekBarStrokeWidth)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                circleProgressBar.setProgressBarWidth(progress * getResources().getDisplayMetrics().density);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // BACKGROUND BORDER
        ((SeekBar) findViewById(R.id.seekBarBackgroundStrokeWidth)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                circleProgressBar.setBackgroundProgressBarWidth(progress * getResources().getDisplayMetrics().density);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // COLOR
        ((LobsterShadeSlider)findViewById(R.id.shadeslider)).addOnColorListener(new OnColorListener() {
            @Override
            public void onColorChanged(@ColorInt int color) {
                circleProgressBar.setColor(color);
                circleProgressBar.setBackgroundColor(adjustAlpha(color, 0.3f));
            }

            @Override
            public void onColorSelected(@ColorInt int color) {
            }
        });
    }

    /**
     * Transparent the given color by the factor
     * The more the factor closer to zero the more the color gets transparent
     *
     * @param color  The color to transparent
     * @param factor 1.0f to 0.0f
     * @return int - A transplanted color
     */
    private int adjustAlpha(int color, float factor) {
        int alpha = Math.round(Color.alpha(color) * factor);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        return Color.argb(alpha, red, green, blue);
    }
}
