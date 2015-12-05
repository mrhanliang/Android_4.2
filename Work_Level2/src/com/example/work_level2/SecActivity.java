package com.example.work_level2;

import java.util.ArrayList;
import java.util.List;

import com.example.work_level2.was.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;  
  
public class SecActivity extends Activity {  
    //获取ListView对象  
    private ListView userlv;  
    //创建对象  
    List list;  
    @Override  
      
      
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_sec);  
        userlv=(ListView)findViewById(R.id.userlv);  
        //ListView的实现依赖于适配器，而适配器依赖于数据源  
        //创建集合数据源  
        list=new ArrayList();  
        list.add("zhao");  
        list.add("qian");  
        list.add("sun");  
        list.add("li");  
        list.add("zhou");  
        list.add("wu");  
        //创建适配对象  
        ArrayAdapter<String>adapter=  
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);  
        //参数1：表示当前适配器的宿主  
        //参数2：表示当前适配器的数据的呈现形式，用简单列表形式呈现数据  
        //参数3：表示数据源  
        userlv.setAdapter(adapter);//导入  
          
    }  
  
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        // Inflate the menu; this adds items to the action bar if it is present.  
        getMenuInflater().inflate(R.menu.sec, menu);  
        return true;  
    }  
  
}
