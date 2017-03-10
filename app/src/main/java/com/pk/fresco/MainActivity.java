package com.pk.fresco;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Uri uri = Uri.parse("https://s-media-cache-ak0.pinimg.com/564x/a1/bc/ec/a1bcecafe02550f7be8c0899189fd30b.jpg");
        SimpleDraweeView draweeView = ((SimpleDraweeView) findViewById(R.id.imageView));
        draweeView.setImageURI(uri);

    }
}
