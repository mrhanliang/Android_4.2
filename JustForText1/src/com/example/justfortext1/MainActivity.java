package com.example.justfortext1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;



public class MainActivity extends Activity {

	private List <Student> studentList = new ArrayList<Student>();
	
	private ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initStudent();
		
		StudentAdapter adapter = new StudentAdapter(MainActivity.this,R.layout.student,studentList);
		listView = (ListView)findViewById(R.id.listView1);
		listView.setAdapter(adapter);

	}

	public void initStudent(){
		Student s1 = new Student("哈哈", 10);
		studentList.add(s1);
		Student s2 = new Student("哈哈", 10);
		studentList.add(s2);
		Student s3 = new Student("哈哈", 10);
		studentList.add(s3);
		Student s4 = new Student("哈哈", 10);
		studentList.add(s4);
		Student s5 = new Student("哈哈", 10);
		studentList.add(s5);
		Student s6 = new Student("哈哈", 10);
		studentList.add(s6);
	}
}
