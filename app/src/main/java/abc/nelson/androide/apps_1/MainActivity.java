package abc.nelson.androide.apps_1;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nameApp = "APPs1";
        TextView mEditText = findViewById(R.id.etiqueta1);
        mEditText.setText(nameApp);
    }
}