package com.example.maillist;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MailListContentActivity extends Activity{

	public static void actionStart(Context context ,String mailListName ,String mailListContent){
		Intent intent = new Intent(context , MailListContentActivity.class);
		intent.putExtra("mailList_Name", mailListName);
		intent.putExtra("mailList_Content", mailListContent);
		context.startActivity(intent);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.maillist_content);
		String mailListName = getIntent().getStringExtra("mailList_Name");
		String mailListContent = getIntent().getStringExtra("mailList_Content");
		MailListContentFragment mailListContentFragment = (MailListContentFragment) getFragmentManager().findFragmentById(R.id.mailList_content_fragment);
		mailListContentFragment.refresh(mailListName, mailListContent);
	}
}
