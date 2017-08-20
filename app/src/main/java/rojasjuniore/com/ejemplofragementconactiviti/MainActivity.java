package rojasjuniore.com.ejemplofragementconactiviti;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MyInterface {

    FragmentManager fragmentManager;
    TextView textView;
    public static final String TAG = "FrameLayout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        fragmentManager = getSupportFragmentManager();
        getAddFragment();
    }

    public void getAddFragment() {

        MyFragment myFragment = new MyFragment();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.FrameLayout, myFragment, TAG);
        fragmentTransaction.commit();

    }

    @Override
    public void sendData(String s) {
        textView.setText(s);
    }
}
