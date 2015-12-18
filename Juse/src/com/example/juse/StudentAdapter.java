package com.example.juse;

import java.util.List;

import android.content.Context;
import android.support.v4.widget.ViewDragHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class StudentAdapter extends ArrayAdapter<Student> {

	private int resourceId;

	public StudentAdapter(Context context, int textViewResourceId, List<Student> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Student student = getItem(position);
		View view;
		ViewHolder viewHolder;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.textView1 = (TextView) view.findViewById(R.id.textView1);
			viewHolder.textView2 = (TextView) view.findViewById(R.id.textView2);
			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}
		viewHolder.textView1.setText(student.getStudentName());
		viewHolder.textView2.setText(student.getStudentAge());
		return view;
	}

	class ViewHolder {
		TextView textView1;
		TextView textView2;
	}
}
