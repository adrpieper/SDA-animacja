package pl.pieper.adrian.animexample;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button firstFragmentButton = (Button) findViewById(R.id.first_fragment_button);
        Button secondFragmentButton = (Button) findViewById(R.id.second_fragment_button);
        firstFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.empty_frame, new FirstFragment());
                transaction.commit();
            }
        });
        secondFragmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.empty_frame, new SecondFragment());
                transaction.commit();
            }
        });
    }
}
