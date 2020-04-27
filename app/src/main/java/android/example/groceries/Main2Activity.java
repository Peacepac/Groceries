package android.example.groceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView first,second,third,four,five,six,total;
    String amount;
    ImageView share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third =  findViewById(R.id.third);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        total=findViewById(R.id.total);
        share = findViewById(R.id.share);

        amount=getIntent().getExtras().getString("firstPrice");
        first.setText(amount);

        amount=getIntent().getExtras().getString("secondPrice");
        second.setText(amount);

        amount=getIntent().getExtras().getString("thirdPrice");
        third.setText(amount);

        amount=getIntent().getExtras().getString("fourPrice");
        four.setText(amount);

        amount=getIntent().getExtras().getString("fivePrice");
        five.setText(amount);

        amount=getIntent().getExtras().getString("sixPrice");
        six.setText(amount);

        amount=getIntent().getExtras().getString("totalPrice");
        total.setText(amount);


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your body is here";
                String shareSub = "Your subject";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Share using"));



            }
        });

    }
}
