
package com.rns.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(24, 40, 24, 24);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(12, 18, 35));

        TextView title = new TextView(this);
        title.setText("RNS APP MODE");
        title.setTextSize(30);
        title.setTextColor(Color.CYAN);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("\nPrediction Dashboard\n");
        subtitle.setTextSize(20);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        TextView status = new TextView(this);
        status.setText(
            "Status: Demo Mode\n\n" +
            "Signals: Not connected\n" +
            "Accuracy: No data yet\n\n" +
            "Predictions are uncertain. " +
            "No guaranteed results."
        );
        status.setTextSize(17);
        status.setTextColor(Color.LTGRAY);
        status.setGravity(Gravity.CENTER);
        layout.addView(status);

        Button button = new Button(this);
        button.setText("CHECK STATUS");
        layout.addView(button);

        button.setOnClickListener(v ->
            status.setText(
                "Status: App Running\n\n" +
                "Live data: Not connected\n" +
                "Backtesting: Awaiting data\n\n" +
                "No reliable prediction available."
            )
        );

        setContentView(layout);
    }
}
