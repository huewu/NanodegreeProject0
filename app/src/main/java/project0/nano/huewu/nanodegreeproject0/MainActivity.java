package project0.nano.huewu.nanodegreeproject0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast mToast = null;

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
    protected void onStop() {
        super.onStop();

        if (mToast != null) {
            mToast.cancel();
        }
    }

    /**
     * This listener will be invoked when a user click one of buttons in the list
     */
    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            if (v!=null && v instanceof Button) {
                final String fmtStr = String.format(getString(R.string.caption_format),
                        ((Button) v).getText());

                if (mToast != null) {
                    mToast.setText(fmtStr);
                } else {
                    mToast = Toast.makeText(MainActivity.this, fmtStr, Toast.LENGTH_SHORT);
                }
                mToast.show();
            }
        }
    };
}
