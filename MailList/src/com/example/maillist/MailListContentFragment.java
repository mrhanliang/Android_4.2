package com.example.maillist;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MailListContentFragment extends Fragment{

	private View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	view = inflater.inflate(R.layout.maillist_content_frag, container, false);
	return view;
	}
	
	public void refresh(String mailListName , String mailListContent){
		View visibilityLayout = view.findViewById(R.id.visibility_layout);
		visibilityLayout.setVisibility(View.VISIBLE);
		TextView mailListNameText = (TextView) view.findViewById(R.id.mailList_name);
		TextView mailListContentText = (TextView) view.findViewById(R.id.mailList_content);
		mailListNameText.setText(mailListName);
		mailListContentText.setText(mailListContent);
		
		Button button1 = (Button)view.findViewById(R.id.tel);
		Button button2 = (Button)view.findViewById(R.id.sendMessage);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("tel:"));
				startActivity(intent);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "载入信箱......", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
