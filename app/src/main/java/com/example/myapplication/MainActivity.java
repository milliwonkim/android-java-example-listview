package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Context mContext;

    private ArrayList<String> arrayMountain;
    private ListView mListView;
    private MountainAdapter mMountainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mContext = getApplicationContext();
        mListView = (ListView) findViewById(R.id.list_mountain);

        arrayMountain = new ArrayList<>();
        arrayMountain.add("Javascript");
        arrayMountain.add("Java");
        arrayMountain.add("Python");
        arrayMountain.add("Ruby");
        arrayMountain.add("Go");
        arrayMountain.add("Scala");
        arrayMountain.add("C");
        arrayMountain.add("C#");
        arrayMountain.add("Typescript");
        arrayMountain.add("C++");
        arrayMountain.add("Haskell");
        arrayMountain.add("Objective-C");
        arrayMountain.add("Swift");
        arrayMountain.add("php");
        arrayMountain.add("Basic");
        arrayMountain.add("Groovy");
        arrayMountain.add("Pascal");
        arrayMountain.add("Assembly");


        mMountainAdapter = new MountainAdapter(mContext, arrayMountain);
        mListView.setAdapter(mMountainAdapter);
    }
}