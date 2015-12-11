package com.example.s01_e15_relativelayout01;

import com.example.s01_e15_relativelayout01.R.id;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;

public class SecActivity extends Activity {

	private Button button1;
	private EditText nichengId;
	private EditText mimaId;
	private EditText querenmima;
	private CheckBox checkBox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);

		button1 = (Button) findViewById(R.id.button1);
		nichengId = (EditText) findViewById(R.id.nichengId);
		mimaId = (EditText) findViewById(R.id.mimaId);
		querenmima = (EditText) findViewById(R.id.quedingmimaId);
		checkBox = (CheckBox) findViewById(R.id.checkBox);
		checkBox.setChecked(true);

		button1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SecActivity.this, MainActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}

	public static void actionStart(Context context) {
		Intent intent = new Intent(context, SecActivity.class);
		context.startActivity(intent);
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
		return super.onOptionsItemSelected(item);
	}
}
