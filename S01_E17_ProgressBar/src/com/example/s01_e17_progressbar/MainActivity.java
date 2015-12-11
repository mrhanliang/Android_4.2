package com.example.s01_e17_progressbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

	private ProgressBar progressBar;
	private Button button1;
	private Button button2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		progressBar=(ProgressBar)findViewById(R.id.firstProgressBar);
		button1=(Button)findViewById(R.id.firstButton);
		button2=(Button)findViewById(R.id.secondButton);
		progressBar.setMax(100);
		progressBar.setProgress(20);
		progressBar.setSecondaryProgress(40);
		
		boolean flag = progressBar.isIndeterminate();
		System.out.println(flag);
		
		FirstButtonListener listener1 = new FirstButtonListener();
		SecondButtonListener listener2 = new SecondButtonListener();
		button1.setOnClickListener(listener1);
		button2.setOnClickListener(listener2);
	}

	class FirstButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			progressBar.incrementProgressBy(10);
			int i = progressBar.getProgress();
			System.out.println(i);
			if(i == 100){
				progressBar.setVisibility(View.INVISIBLE);
			}
		}
		
	}
	
	class SecondButtonListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			progressBar.incrementSecondaryProgressBy(10);
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
