package an.cqupt.s01_e10_radio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

	private RadioGroup radioGroup;
	private RadioButton femaleButton;
	private RadioButton maleButton;
	private RadioGroup radioGroup1;
	private RadioButton yesButton;
	private RadioButton noButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		radioGroup=(RadioGroup)findViewById(R.id.radioGroupId);
		femaleButton=(RadioButton)findViewById(R.id.femaleButtonId);
		maleButton=(RadioButton)findViewById(R.id.maleButtonId);
		radioGroup1=(RadioGroup)findViewById(R.id.radioGroupId1);
		yesButton=(RadioButton)findViewById(R.id.yesId);
		noButton=(RadioButton)findViewById(R.id.noId);
		
		
		RadioGroupListener listener = new RadioGroupListener();
		radioGroup.setOnCheckedChangeListener(listener);
		radioGroup1.setOnCheckedChangeListener(listener);		
		
		/*RadioButtonListener radioButtonListener = new RadioButtonListener();
		femaleButton.setOnCheckedChangeListener(radioButtonListener);*/
	}

	/*class RadioButtonListener implements android.widget.CompoundButton.OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
			// TODO Auto-generated method stub
			System.out.println("isChecked---->" + isChecked);
		}
		
	}*/
	
	class RadioGroupListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			if(checkedId == femaleButton.getId()){
				System.out.println("选中了female");
				yesButton.setChecked(true);
			}else if(checkedId == maleButton.getId()){
				System.out.println("选中了male");
				noButton.setChecked(true);
			}
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
