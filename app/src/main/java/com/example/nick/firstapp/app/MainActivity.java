package com.example.nick.firstapp.app;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.nick.firstapp.R;
import com.example.nick.firstapp.adapter.RecyclerAdapter;
import com.example.nick.firstapp.model.Landscape;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Home Page");
        toolbar.inflateMenu(R.menu.menu_main);

//        toolbar.inflateMenu((R.menu.menu_main));
//        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                String message = "";
//
//                switch (item.getItemId()) {
//                    case R.id.discard:
//                        message = "Delete";
//                        break;
//
//                    case R.id.settings:
//                        message = "Settings";
//                        break;
//
//                    case R.id.edit:
//                        message = "Edit";
//                        break;
//                }
//
//                Toast.makeText(MainActivity.this, message + " clicked!", Toast.LENGTH_SHORT).show();
//
//                return true;
//            }
//        });

        setUpRecyclerView();

    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerAdapter adapter = new RecyclerAdapter(Landscape.getData(), this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager mLinearLayoutManagerVertical = new LinearLayoutManager(this);
        mLinearLayoutManagerVertical.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(mLinearLayoutManagerVertical);

        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }
}