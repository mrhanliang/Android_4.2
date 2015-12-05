package com.example.work_level2;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;  
  
public class MainActivity extends Activity {  
    private Button but;//创建一个按钮对象，导入包  
    private Button btn;  
    private EditText et1;  
    private EditText et2;  
    @Override  
      
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);  
        //对but进行实例化  
        but=(Button)findViewById(R.id.button1);  
        btn=(Button)findViewById(R.id.button2);  
        //创建but的单击事件，参数要传匿名内部类  
        et1=(EditText)findViewById(R.id.editText1);  
        et2=(EditText)findViewById(R.id.editText2);  
        but.setOnClickListener(new OnClickListener(){  
  
            @Override  
            public void onClick(View arg0) {  
                // TODO Auto-generated method stub  
                //测试使用System.out.println("hello..........");  
                //要成功进行跳转到intent这个对象  
                //第一个参数是原来的类，出发站以.this结尾  
                //第二个参数是要跳转的类，结束站以class结尾  
                //Intent in=new Intent(MainActivity.this,SecActivity.class);  
                //startActivity(in);  
                String  username=et1.getText().toString();  
                String  pwd=et2.getText().toString();  
                if(username.equals("zhao")&&pwd.equals("118598")){  
                    //密码确认  
                Intent in=new Intent(MainActivity.this,SecActivity.class);  
                startActivity(in);}  
            }  
              
        });  
        btn.setOnClickListener(new OnClickListener(){  
  
            @Override  
            public void onClick(View arg0) {  
                // TODO Auto-generated method stub  
            Intent in2=new Intent();//创建意图对象  
            /* 打电话 
            in2.setAction(Intent.ACTION_CALL);指定意图动作 
            in2.setData(Uri.parse("tel:5556")); 
            startActivity(in2);启动意图*/  
            //发短信  
            in2.setAction(Intent.ACTION_SENDTO);  
            in2.setData(Uri.parse("smsto:5556"));  
            in2.putExtra("sms_body", "password");  
            startActivity(in2);//=MainActivity.this.startActivity(in2)  
              
            }  
              
        });  
    }//onCreat.  
  
  
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        // Inflate the menu; this adds items to the action bar if it is present.  
        getMenuInflater().inflate(R.menu.main, menu);  
        return true;  
    }  
      
}