package com.example.s01_e18_seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	private SeekBar seekBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		seekBar=(SeekBar)findViewById(R.id.firstSeekBar);
		seekBar.setProgress(20);
		seekBar.setSecondaryProgress(50);
		
		SeekBarListener listener = new SeekBarListener();
		seekBar.setOnSeekBarChangeListener(listener);
	}

	class SeekBarListener implements OnSeekBarChangeListener{

		@Override
		public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
			System.out.println("progress: " + progress + ",fromUser: " + fromUser);
		}

		@Override
		public void onStartTrackingTouch(SeekBar seekBar) {
			System.out.println("OnStart");
		}

		@Override
		public void onStopTrackingTouch(SeekBar seekBar) {
			System.out.println("OnStop");
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
