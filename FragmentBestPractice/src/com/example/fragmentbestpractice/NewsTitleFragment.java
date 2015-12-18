package com.example.fragmentbestpractice;

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



public class NewsTitleFragment extends Fragment implements OnItemClickListener{

	private ListView newsTitleListView;
	private List<News> newsList;
	private NewsAdapter adapter;
	private boolean isTwoPane;
	
	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		newsList = getNews();
		adapter = new NewsAdapter(activity, R.layout.news_item,newsList);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.news_title_frag, container, false);
		newsTitleListView = (ListView)view.findViewById(R.id.news_title_list_view);
		newsTitleListView.setAdapter(adapter);
		newsTitleListView.setOnItemClickListener(this);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		if(getActivity().findViewById(R.id.news_content_layout) != null){
			isTwoPane = true;
		}else{           
			isTwoPane = false;
		}
	}
	@Override
	public void onItemClick(AdapterView<?>parent,View view,int position,long id){
		News news = newsList.get(position);
		if(isTwoPane){
			NewsContentFragment newsContentFrament = (NewsContentFragment) getFragmentManager().findFragmentById(R.id.news_content_fragment);
			newsContentFrament.refresh(news.getTitle(), news.getContent());
		}else{
			NewsContentActivity.actionStart(getActivity(), news.getTitle(),news.getContent());
		}
	}
	
	
	private List<News> getNews(){
		List<News> newsList = new ArrayList<News>();
		News news1 = new News();
		news1.setTitle("美国加州发生枪击案");
		news1.setContent("Americans were exposed to the terror of mass gun violence again on Wednesday, "
				+ "this time at a social services center in San Bernardino, California. The initial "
				+ "reports revealed a distressingly1 familiar pattern: A heavily armed active shoote"
				+ "r or shooters, at least 14 people dead and more injured, harrowing images of law"
				+ " enforcement and first responders rushing to get the area under control, and stu"
				+ "nned2 people -- some of them wounded and bleeding -- streaming out of the facility.");
		newsList.add(news1);
		News news2 = new News();
		news2.setTitle("7月11日，来自河北、河南、广西、广东、湖北、甘肃等地的贸促会机构会长和代表180多人");
		news2.setContent("7月11日，来自河北、河南、广西、广东、湖北、甘肃等地的贸促会机构会长和代表180多人，"
				+ "聚集兰州，参加在这里举办的全国贸促会分支机构领导干部培训研讨班。此次研讨班在我省举办，是中"
				+ "国贸促会贯彻落实西部大开发的具体举措，培训对象主要为分支机构领导，旨在提高贸促会基层组织的"
				+ "管理和服务水平，为企业开展国际化经营提供优质服务。");
		newsList.add(news2);
		News news3 = new News();
		news3.setTitle("7月11日，我省第二批节水型社会建设试点名单公布");
		news3.setContent("7月11日，我省第二批节水型社会建设试点名单公布，嘉峪关市、白银市等12个市和庄浪县、"
				+ "静宁县、广河县等32个县(区)名列其中。　(吕霞)");
		newsList.add(news3);
		News news4 = new News();
		news4.setTitle("7月11日，全国贸促会系统培训工作成果展在兰州饭店展出。");
		news4.setContent("7月11日，全国贸促会系统培训工作成果展在兰州饭店展出。　(武莉王军红)");
		newsList.add(news4);
		News news5 = new News();
		news5.setTitle("目前，我省日光温室面积达到30.52万亩，产量122万吨，蔬菜总产值91.5亿元");
		news5.setContent("目前，我省日光温室面积达到30.52万亩，产量122万吨，蔬菜总产值91.5亿元，占全省种植"
				+ "业产值的28.4%。日光温室工程，已成为河西走廊、沿黄灌区和城郊农民增收的重要支柱产业之一。　"
				+ "(何成军钱河山马大伟)");
		newsList.add(news5);
		News news6 = new News();
		news6.setTitle("我省向国家发改委申报的45个2006年西部地区农村寄宿制学校建设工程项目已正式获批");
		news6.setContent("我省向国家发改委申报的45个2006年西部地区农村寄宿制学校建设工程项目已正式获批，并"
				+ "全部纳入建设计划。项目总投资1.65亿元，总建筑面积20.56万平方米，购置课桌凳3.05万套、学生"
				+ "用床2.71万张、图书22.44万册。(张丽丽)");
		newsList.add(news6);
		News news7 = new News();
		news7.setTitle("7月6日，天水市劳模又获文化精神食粮");
		news7.setContent("7月6日，天水市劳模又获文化精神食粮。“画鸡国手”王子洲现场挥毫为市以上劳模赠送书法作"
				+ "品百余幅，以自己的言行表达了对劳动者的敬仰。 (牛占虎)");
		newsList.add(news7);
		News news8 = new News();
		news8.setTitle("7月7日上午，新疆生化药业有限公司向甘肃捐赠价值33.38万元救助药品仪式在会宁县中心广场举行");
		news8.setContent("7月7日上午，新疆生化药业有限公司向甘肃捐赠价值33.38万元救助药品仪式在会宁县中心广"
				+ "场举行。会宁县是我省红十字会参与“新型农村合作医疗”试点县，今年恰适中国工农红军在会宁胜利会"
				+ "师70周年，因此，省红十字会将这批药品全部转赠给会宁县，使这次捐赠活动更加具有意义。");
		newsList.add(news8);
		News news9 = new News();
		news9.setTitle("7月11日，记者从有关部门了解到，为做好对重点青少年群体的教育管理");
		news9.setContent("7月11日，记者从有关部门了解到，为做好对重点青少年群体的教育管理，省预青办决定动员全省各"
				+ "级预青办工作人员和省青年法律工作者协会会员，开展针对违法犯罪青少年、闲散未成年人和服刑人员未成年"
				+ "子女的社区矫正、帮教工作。 (吕霞张丽丽)");
		newsList.add(news9);
		News news10 = new News();
		news10.setTitle("为了让智力残疾人通过运动会的形式更多的接触社会、参与社会");
		news10.setContent("为了让智力残疾人通过运动会的形式更多的接触社会、参与社会，日前，兰州市七里河区在武山路社"
				+ "区举办了首届“特奥”运动会，选手们参加了乒乓球、羽毛球、跳绳、两分钟拍皮球和定点投篮五个项目的比赛"
				+ "。此次运动会评选出的2名优秀选手将在7月29日参加在哈尔滨举办的全国“特奥”运动会。　(冯冬花)");
		newsList.add(news10);
		News news11 = new News();
		news11.setTitle("截至今年5月底，我省各类煤矿从业人员达90123人");
		news11.setContent("截至今年5月底，我省各类煤矿从业人员达90123人。其中农民工30078人，从调查情况来看，甘肃煤"
				+ "矿从业人员的文化程度85%为初中及以下水平，其中20%是文盲半文盲。 (燕澜月)");
		newsList.add(news11);
		return newsList;
	}

}