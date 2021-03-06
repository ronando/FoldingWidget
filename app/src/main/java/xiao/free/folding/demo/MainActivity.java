package xiao.free.folding.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import xiao.free.folding.R;

/**
 * Created by robincxiao on 2018/8/31.
 */

public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickViewPage(View view){
        startActivity(new Intent(this, ViewPageActivity.class));
    }

    public void OnRecycView(View view){
        startActivity(new Intent(this, RecycViewActivity.class));
    }
}
