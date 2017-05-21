package info.billcan.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.graphics.drawable.Drawable;

public class MainActivity extends AppCompatActivity {

    // Flag for what is being shown - begin with showing a Seminole
    Boolean noleShown = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchImage(View view) {
        Drawable i;
        String s;

        ImageView img = (ImageView) findViewById(R.id.imageView);
        Button btn = (Button) view;

        if (noleShown) {
            i = getResources().getDrawable(getResources()
                    .getIdentifier("gator", "drawable", getPackageName()), null);
            s = getResources().getString(R.string.button_text_nole);
        } else {
            i = getResources().getDrawable(getResources()
                    .getIdentifier("nole", "drawable", getPackageName()), null);
            s = getResources().getString(R.string.button_text_nole);
        }

        img.setImageDrawable(i);
        btn.setText(s);
        noleShown = !noleShown;
    }
}
