package com.example.s01_e16_datepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;

public class MainActivity extends Activity {

	private DatePicker datePicker;
	private Button button;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		datePicker=(DatePicker)findViewById(R.id.firstDatePicker);
		button=(Button)findViewById(R.id.button);
		
		ButtonListener listener = new ButtonListener();
		button.setOnClickListener(listener);
	}

	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			int year = datePicker.getYear();
			int month = datePicker.getMonth() + 1;
			int date = datePicker.getDayOfMonth();
			System.out.println("年份" + year + "月份" + month + "日期" + date);
		}
		
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
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
