package com.qzsang.materialdialogtest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View view) {

        switch (view.getId()) {
            case R.id.btn_show_dialog:
                show();
                break;
        }
    }

    public void show() {
        new android.support.v7.app.AlertDialog.Builder(this)
                .setTitle("Material Design Dialog")
                .setMessage("这是 android.support.v7.app.AlertDialog 中的样式")
                .setNegativeButton("取消", null)
                .setPositiveButton("确定", null)
                .setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        Toast.makeText(MainActivity.this, "你点了确定", Toast.LENGTH_LONG).show();
                    }
                })
                .show();
    }

}
