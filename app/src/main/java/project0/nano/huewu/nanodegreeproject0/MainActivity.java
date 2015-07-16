package project0.nano.huewu.nanodegreeproject0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_popular_movies).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_library_app).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_scores_app).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_build_it_bigger).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_xyz_reader).setOnClickListener(mOnClickListener);
        findViewById(R.id.btn_capstone).setOnClickListener(mOnClickListener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * This listener will be invoked when a user click one of buttons in the list
     */
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v!=null && v instanceof Button) {
                final String fmtStr = String.format("This button will launch %s app!",
                        ((Button)v).getText());
                Toast.makeText(MainActivity.this, fmtStr, Toast.LENGTH_SHORT).show();
            }
        }
    };
}
