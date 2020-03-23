package com.example.sandhya.callsmswedshareemail;

import android.content.Intent;
import android.media.Rating;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {
RatingBar cswse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cswse=findViewById(R.id.cswse);

        cswse.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                if(v==1.0f)
                {
                    Intent i1=new Intent();
                    i1.setAction(Intent.ACTION_CALL);
                    i1.setData(Uri.parse("tel:8106418674"));
                    startActivity(i1);
                }
                else if(v==2.0f)
                {
                    Intent i2=new Intent(Intent.ACTION_SENDTO,Uri.parse("smsto:9003306626"));
                    i2.putExtra("sms_body","I am coming wait");
                    startActivity(i2);
                }
                else if(v==3.0f)
                {
                    Intent i3=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
                    startActivity(i3);
                }
                else if(v==4.0f)
                {
                    Intent i4=new Intent(Intent.ACTION_SEND);
                    i4.setType("text/plain");
                    i4.putExtra(Intent.EXTRA_TEXT,"Hello!");
                    startActivity(Intent.createChooser(i4,"Sandhyaapp"));
                }
                else if(v==5.0f)
                {
                    Intent i5=new Intent(Intent.ACTION_SEND);
                    i5.setType("message/rfc822");
                    String[] to=("sandhyaananthan@yahoo.in");
                    String[] cc=("sandhyaananthan@gmail.com");
                    String subject="Android App";
                    String body="Hello";
                    i5.putExtra(Intent.EXTRA_EMAIL,to);
                    i5.putExtra(Intent.EXTRA_CC,cc);
                    i5.putExtra(Intent.EXTRA_SUBJECT,subject);
                    i5.putExtra(Intent.EXTRA_TEXT,body);
                    startActivity(Intent.createChooser(i5,"Emailapp"));
                }
                else
                {

                }
            }
        });
    }
}
