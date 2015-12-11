package com.example.listviewtext;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class StudentAdapter extends ArrayAdapter<Student>{

	private int resourceId;
	public StudentAdapter(Context context, int textViewResoureId, List<Student> objects) {
		super(context, textViewResoureId, objects);
		resourceId = textViewResoureId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Student student = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
		TextView studentName = (TextView)view.findViewById(R.id.studentName);
		TextView studentClass = (TextView)view.findViewById(R.id.studentClass);
		studentName.setText(student.getStudentName());
		studentClass.setText(student.getStudentClass());
		return view;
	}
}
