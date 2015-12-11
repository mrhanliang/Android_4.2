package com.example.s01_e15_relativelayout01;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button zhucheButton;
	private TextView denglu;
	private TextView wangji;
	private ImageView imageView;
	private EditText username;
	private EditText password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		zhucheButton = (Button) findViewById(R.id.zhucheButton);
		denglu = (TextView) findViewById(R.id.dengluId);
		wangji = (TextView) findViewById(R.id.wangjiId);
		imageView = (ImageView) findViewById(R.id.imageView1);
		username = (EditText) findViewById(R.id.usernameText);
		password = (EditText) findViewById(R.id.passwordText);

		zhucheButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				/*
				 * Intent intent = new
				 * Intent(MainActivity.this,SecActivity.class);
				 * startActivity(intent);
				 */
				SecActivity.actionStart(MainActivity.this);
			}

		});

		denglu.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
			}
		});

		wangji.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(Intent.ACTION_VIEW);
				intent1.setData(Uri.parse("http://www.baidu.com"));
				startActivity(intent1);
			}
		});

		imageView.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
				dialog.setTitle("提醒！");
				dialog.setMessage("亲~您确定要退出吗？");
				dialog.setCancelable(false);
				dialog.setPositiveButton("确定",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						finish();
					}
				});
				dialog.setNegativeButton("取消",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						
					}
				});
				dialog.show();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.add_item) {
			Toast.makeText(MainActivity.this, "成功添加", Toast.LENGTH_SHORT).show();
			return true;
		} else if (id == R.id.remove_item) {
			Toast.makeText(MainActivity.this, "成功移除", Toast.LENGTH_SHORT).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
