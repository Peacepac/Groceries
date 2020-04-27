package android.example.groceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText price1, price2, price3, item1, item2, item3;
    String text;
    TextView total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        price1 =  findViewById(R.id.price1);
        price2 =  findViewById(R.id.price2);
        price3 =  findViewById(R.id.price3);
        item1 =   findViewById(R.id.item1);
        item2 =   findViewById(R.id.item2);
        item3 =   findViewById(R.id.item3);
        total =   findViewById(R.id.total);


    }

    public void submit(View view) {
        Intent intentName=new Intent(this,Main2Activity.class);

        int total1=Integer.parseInt(price1.getText().toString());


        int total2=Integer.parseInt(price2.getText().toString());


        int total3=Integer.parseInt(price3.getText().toString());


        int operate=total1+total2+total3*500;
        total.setText("Total:"+""+(operate));


        text=price1.getText().toString();
        intentName.putExtra("firstPrice",text);


        text=price2.getText().toString();
        intentName.putExtra("secondPrice",text);

        text=price3.getText().toString();
        intentName.putExtra("thirdPrice",text);



        text=item1.getText().toString();
        intentName.putExtra("fourPrice",text);

        text=item2.getText().toString();
        intentName.putExtra("fivePrice",text);

        text=item3.getText().toString();
        intentName.putExtra("sixPrice",text);

        text=total.getText().toString();
        intentName.putExtra("totalPrice",text);
        startActivity(intentName);



    }
}
