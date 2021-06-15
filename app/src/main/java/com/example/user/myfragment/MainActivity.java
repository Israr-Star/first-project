package com.example.user.myfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;

    private String Name[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listviewid);

        Name = getResources().getStringArray(R.array.Names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.txt_id,Name);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);





    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;

        if(position==0){

            fragment = new KarimFrag();

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragId,fragment);
            fragmentTransaction.commit();



        }

        else if (position==1){

            fragment = new RahimFrag();

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragId,fragment);
            fragmentTransaction.commit();



        }
    }
}
