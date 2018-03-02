package org.cord4handai.circlemikke.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import org.cord4handai.circlemikke.R;

public class SearchActivity extends AppCompatActivity {

    private Button sendSearchDescriptionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        sendSearchDescriptionButton = (Button) findViewById(R.id.send_search_descriptioin_btn);
        sendSearchDescriptionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SearchActivity.this, SearchDescpiptionActivity.class);
                startActivity(intent);
            }
        });
    }


}
