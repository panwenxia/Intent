package edu.fjnu.cse.intent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void jump(View view){
        String data;
        EditText editText=(EditText)findViewById(R.id.edit_uri);
        data = editText.getText().toString();
        Uri uri = Uri.parse(data);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(uri);
        startActivity(intent);
    }
}
