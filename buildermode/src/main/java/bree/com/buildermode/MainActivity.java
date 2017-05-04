package bree.com.buildermode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import bree.com.buildermode.abs.Builder;
import bree.com.buildermode.windowimp.WindowBook;
import bree.com.buildermode.windowimp.WindowBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Builder wBuilder=new WindowBuilder();
        WindowBook computer = (WindowBook) wBuilder.buildBoard("window board").buildDispaly("window display").create();
        Log.d("MainActivity", "Computer window Info :" + computer.toString());
    }
}
