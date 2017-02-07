package araminta.sukahar.shopreceipt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA = "araminta.sukahar.shopreceipt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void calculate(View view) {

        EditText input1 = (EditText) findViewById(R.id.input1);
        EditText input2 = (EditText) findViewById(R.id.input2);
        EditText input3 = (EditText) findViewById(R.id.input3);
        EditText input4 = (EditText) findViewById(R.id.input4);
        EditText input5 = (EditText) findViewById(R.id.input5);
        EditText input6 = (EditText) findViewById(R.id.input6);

        double baju, celana, kerudung, jaket, kemeja, kaos;
        String hasil;
        baju = Double.parseDouble(input1.getText().toString());
        celana = Double.parseDouble(input2.getText().toString());
        kerudung = Double.parseDouble(input3.getText().toString());
        jaket = Double.parseDouble(input4.getText().toString());
        kemeja = Double.parseDouble(input5.getText().toString());
        kaos = Double.parseDouble(input6.getText().toString());

        hasil = "Baju" +baju+ (baju*30000);
        hasil += "Celana" +celana+ (celana*50000);
        hasil += "Kerudung" +kerudung+ (kerudung*15000);
        hasil += "Jaket" +jaket+ (jaket*70000);
        hasil += "Kemeja" +kemeja+ (kemeja*40000);
        hasil += "Kaos" +kaos+(kaos*70000);
        hasil += "total"+"\t"+((baju*30000)+(celana*50000)+(kerudung*15000)+(jaket*70000)+(kemeja*40000)+(kaos*70000));


        TextView result = (TextView) findViewById(R.id.txt_message);
        result.setText(hasil);
        Intent intent = new Intent(this, Tampilan.class);
        intent.putExtra(EXTRA, result.getText().toString());
        startActivity(intent);

    }
}
