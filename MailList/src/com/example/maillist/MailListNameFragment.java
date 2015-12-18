package com.example.maillist;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MailListNameFragment extends Fragment implements OnItemClickListener{

	private ListView mailListNameListView;
	private List<MailList> mailListList;
	private MailListAdapter adapter;
	private boolean isTwoPane;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		mailListList = getMailList();
		adapter = new MailListAdapter(activity, R.layout.name_item, mailListList);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.maillist_name_frag, container, false);
		mailListNameListView = (ListView)view.findViewById(R.id.mailList_list_view);
		mailListNameListView.setAdapter(adapter);
		mailListNameListView.setOnItemClickListener(this);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		if(getActivity().findViewById(R.id.mailList_content_layout) != null){
			isTwoPane = true;
		}else{
			isTwoPane = false;
		}
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		MailList mailList = mailListList.get(position);
		if(isTwoPane){
			MailListContentFragment mailListContentFragment = (MailListContentFragment) getFragmentManager().findFragmentById(R.id.mailList_content_fragment);
			mailListContentFragment.refresh(mailList.getName(), mailList.getContent());
		}else{
			MailListContentActivity.actionStart(getActivity(), mailList.getName(), mailList.getContent());
		}
	}
	
	private List<MailList> getMailList(){
		List<MailList> mailListList = new ArrayList<MailList>();
		
		MailList m1 = new MailList();
		m1.setName("李明");
		m1.setContent("15123859554");
		mailListList.add(m1);
		
		MailList m2 = new MailList();
		m2.setName("肖混");
		m2.setContent("15489545461");
		mailListList.add(m2);
		
		MailList m3 = new MailList();
		m3.setName("赵宇");
		m3.setContent("18462446413" );
		mailListList.add(m3);
		
		MailList m4 = new MailList();
		m4.setName("孙越");
		m4.setContent("18642476323");
		mailListList.add(m4);
		
		MailList m5 = new MailList();
		m5.setName("李鹏");
		m5.setContent("17654696561");
		mailListList.add(m5);
		
		MailList m6 = new MailList();
		m6.setName("胡茜");
		m6.setContent("13494634413");
		mailListList.add(m6);
		
		MailList m7 = new MailList();
		m7.setName("凤英");
		m7.setContent("16424974216");
		mailListList.add(m7);
		
		MailList m8 = new MailList();
		m8.setName("凌天");
		m8.setContent("16484134649" );
		mailListList.add(m8);
		
		MailList m9 = new MailList();
		m9.setName("楚天");
		m9.setContent("15897411344");
		mailListList.add(m9);
		return mailListList;
	}

}