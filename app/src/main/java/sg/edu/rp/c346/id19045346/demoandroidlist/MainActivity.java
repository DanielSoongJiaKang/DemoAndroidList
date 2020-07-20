package sg.edu.rp.c346.id19045346.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lvversion;
    ArrayList<String> versionList;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvversion = findViewById(R.id.ListviewVersions);

        versionList = new ArrayList<String>();
        versionList.add("Pie- 9.0");
        versionList.add("Oreo - 8.0-8.1");
        versionList.add("Nougat - 8.0 - 7.1.2");
        versionList.add("Marshmellow - 6.0 - 6.0.1");
        versionList.add("Lolipop - 5.0 - 5.1.1");
        versionList.add("KitKat - 4.4 - 4.4.4");
        versionList.add("Jelly Bean - 4.1 - 4.3.1");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,versionList);
        lvversion.setAdapter(adapter);



    }
}
