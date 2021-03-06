package com.example.justfortext;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class BackButton extends RelativeLayout {

	private Button button;
	private Button button1;

	public BackButton(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.backbutton, this);

		button = (Button) findViewById(R.id.button);
		button1 = (Button) findViewById(R.id.button1);

		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder((Activity) getContext());
				builder.setTitle("提醒！");
				builder.setMessage("亲~你真的要离开我吗？");
				builder.setCancelable(true);
				builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						((Activity) getContext()).finish();
					}
				});
				builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {

					}

				});
				builder.show();
			}

		});

		button1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				ProgressDialog dialog = new ProgressDialog(getContext());
				dialog.setTitle("加载中");
				dialog.setMessage("请稍等......");
				dialog.setCancelable(true);
				dialog.show();
			}
		});
	}

}
