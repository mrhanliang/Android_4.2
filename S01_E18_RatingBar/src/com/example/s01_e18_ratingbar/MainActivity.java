package com.example.s01_e18_ratingbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class MainActivity extends Activity {

	private RatingBar ratingBar;
	private Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ratingBar = (RatingBar) findViewById(R.id.firstRatingBar);
		button1 = (Button) findViewById(R.id.firstButton);

		RatingBarListener listener = new RatingBarListener();
		ratingBar.setOnRatingBarChangeListener(listener);
		ButtonListener listener1 = new ButtonListener();
		button1.setOnClickListener(listener1);
	}

	class ButtonListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			ratingBar.setRating(ratingBar.getRating() + 0.5f);
		}

	}

	class RatingBarListener implements OnRatingBarChangeListener {

		@Override
		public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
			System.out.println("Rating: " + rating + ",FromUser: " + fromUser);
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
