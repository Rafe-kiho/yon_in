package com.mediaground.yon_in;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Category_board extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_board);

        ListView listView = (ListView)findViewById(R.id.list_category);

        List<String> list = new ArrayList<>();//데이터 담는 리스트

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        //어댑터 생성 > 리스트뷰랑 리스트랑 연결

        listView.setAdapter(adapter);//지정

        list.add("게시판 1");
        list.add("게시판 2");
        list.add("게시판 3");
        list.add("게시판 4");
    }
}