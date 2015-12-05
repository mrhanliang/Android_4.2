package cn.cqupt.s01_e16_timepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class MainActivity extends Activity {

	private TimePicker firstTimePicker;
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		firstTimePicker=(TimePicker)findViewById(R.id.firstTimePicker);
		button=(Button)findViewById(R.id.button);
		
		firstTimePicker.setIs24HourView(true);/*
		TimeListener listener = new TimeListener();
		firstTimePicker.setOnTimeChangedListener(listener);*/
		ButtonListener listener = new ButtonListener();
		button.setOnClickListener(listener);
	}
	
	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int hour = firstTimePicker.getCurrentHour();
			int minute = firstTimePicker.getCurrentMinute();
			System.out.println("Hour:" + hour + "," + minute);
		}
		
	}
	
	/*class TimeListener implements OnTimeChangedListener{

		@Override
		public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
			System.out.println("Hour:" + hourOfDay + "," + minute);
		}
		
	}*/

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
