package cindodcindy.sirihpinang.gantifont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView teks, teks2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //teks=(TextView)findViewById(R.id.font);
        //teks2=(TextView)findViewById(R.id.font2);
        //Typeface customfont=Typeface.createFromAsset(getAssets(),"font/roboto_light.ttf");
       //teks.setTypeface(customfont);
        //Typeface customfont2=Typeface.createFromAsset(getAssets(),"font/roboto_regular.ttf");
        //teks2.setTypeface(customfont2);
    }
}