package an.cqupt.s01_e09_checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {

	private CheckBox eatBox;
	private CheckBox sleepBox;
	private CheckBox DotaBox;
	private CheckBox AllBox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		eatBox = (CheckBox) findViewById(R.id.eatId);
		sleepBox = (CheckBox) findViewById(R.id.sleepId);
		DotaBox = (CheckBox) findViewById(R.id.dotaId);
		AllBox = (CheckBox) findViewById(R.id.AllId);

		/*OnBoxClickListener listener = new OnBoxClickListener();
		eatBox.setOnClickListener(listener);
		sleepBox.setOnClickListener(listener);
		DotaBox.setOnClickListener(listener);*/
		
		CheckBoxListener listener = new CheckBoxListener();
		eatBox.setOnCheckedChangeListener(listener);
		sleepBox.setOnCheckedChangeListener(listener);
		DotaBox.setOnCheckedChangeListener(listener);
		AllBox.setOnCheckedChangeListener(listener);
	}
	
	class CheckBoxListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			// TODO Auto-generated method stub
			if(buttonView.getId() == R.id.eatId){
				System.out.println("eatBox");
			}else if(buttonView.getId() == R.id.sleepId){
				System.out.println("sleepBox");
			}else if(buttonView.getId() == R.id.dotaId){
				System.out.println("DotaBox");
			}else if(buttonView.getId() == R.id.AllId){
				if(isChecked){
					eatBox.setChecked(true);
					sleepBox.setChecked(true);
					DotaBox.setChecked(true);
					System.out.println("allChecked");
				}else{
					eatBox.setChecked(false);
					sleepBox.setChecked(false);
					DotaBox.setChecked(false);
					System.out.println("allunChecked");
				}
			}
			
			if(isChecked){
				System.out.println("checked");
			}else{
				System.out.println("unchecked");
			}
		}
		
	}
	
	//OnClickListener的使用方法
	/*class OnBoxClickListener implements OnClickListener {

		@Override
		public void onClick(View view) {
			CheckBox box = (CheckBox) view;
			if (box.getId() == R.id.eatId) {
				System.out.println("eatBox");
			} else if (box.getId() == R.id.sleepId) {
				System.out.println("sleepBox");
			} else if (box.getId() == R.id.dotaId) {
				System.out.println("DoataBox");
			}

			if (box.isChecked()) {
				System.out.println("checked");
			} else {
				System.out.println("unchecked");
			}
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
