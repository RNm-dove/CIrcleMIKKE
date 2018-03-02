package org.cord4handai.circlemikke.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.cord4handai.circlemikke.MyRecyclerViewAdapter;
import org.cord4handai.circlemikke.R;
import org.cord4handai.circlemikke.model.Circle;

public class AnswerListsActivity extends AppCompatActivity implements MyRecyclerViewAdapter.OnEventItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //RecyclerViewにAdapterを渡したりする。
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);  //itemの大きさ形が変わらない場合これをtrueにすることで高速化

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        MyRecyclerViewAdapter myAdapter = new MyRecyclerViewAdapter(this, this);
        recyclerView.setAdapter(myAdapter);



    }


    @Override
    public void onEventItemClick(Circle item) {
        //TODO itemがクリックされた時の処理
    }
}
