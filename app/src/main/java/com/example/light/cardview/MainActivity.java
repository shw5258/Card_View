package com.example.light.cardview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset = {"창세기", "출애굽기", "레위기", "민수기",
            "신명기", "여호수아", "사사기", "룻기", "사무엘상", "사무엘하", "열왕기상",
            "열왕기하", "역대상", "역대하","에스라","느헤미야","에스더","욥기","시편",
            "잠언","전도서","아가","이사야","예레미야","예레미야애가","에스겔","다니엘",
            "호세아","요엘","아모스","오바댜","요나","미가","나훔","하박국","스바냐",
            "학개","스가랴","말라기","마태","마가","누가","요한","사도행전","로마서",
            "고린도전서","고린도후서","갈라디아서","에베소서","빌립보서","골로새서",
            "데살로니가전서","데살로니가후서","디모데전서","디모데후서","디도서",
            "필레몬서","히브리서","야고보서","베드로전서","베드로후서","요한1서",
            "요한2서","요한3서","유다서","요한계시록"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
