package araminta.sukahar.mainmultifunctionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA = "araminta.sukahar.mainmultifunctionapp.Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showMessage(View view){
        Intent intent = new Intent(this,ShowMessage.class);
        TextView txtMessage = (TextView) findViewById(R.id.txt_message);
        intent.putExtra(EXTRA,txtMessage.getText().toString());
        startActivity(intent);
    }
    public void openBrowser (View view){
        Intent intent = new Intent(this,IntentExecutor.class);
        intent.putExtra(EXTRA, "browse");
        startActivity(intent);

    }
    public void openPhone (View view){
        Intent intent = new Intent(this,IntentExecutor.class);
        intent.putExtra(EXTRA, "phone");
        startActivity(intent);

    }public void openMap (View view){
        Intent intent = new Intent(this,IntentExecutor.class);
        intent.putExtra(EXTRA, "map");
        startActivity(intent);

    }
}
