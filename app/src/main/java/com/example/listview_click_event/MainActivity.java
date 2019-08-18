package com.example.listview_click_event;

import java.util.Vector;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

	
	
	private Vector ls,ls2,ls3,ls4,ls5,ls4b;
	private String b;
	private String s;
	private String n;
	private String period;
	public static String rslt;
	final Context context = this;
	private String n2;
	public static String rslt2;
	private String pres;
	private String abs;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		ls=new Vector();
		
		
		ls.add("hai");
		ls.add("hai");
		
		// -- Display mode of the ListView
		
		ListView listview= getListView();
	listview.setChoiceMode(listview.CHOICE_MODE_NONE);
	//	listview.setChoiceMode(listview.CHOICE_MODE_SINGLE);
		listview.setChoiceMode(listview.CHOICE_MODE_MULTIPLE);
		
		//--	text filtering
		listview.setTextFilterEnabled(true);
			
			setListAdapter(new ArrayAdapter<String>(this, 
					android.R.layout.simple_list_item_checked,ls));
			initialise();
	}
	
	private void initialise() {
		// TODO Auto-generated method stub
		for(int i=0;i<ls.size();i++)
		{
			if((i%2)==0)
			{
				item.setChecked(true);
			}
			
				
		}
		
	}

	public void onListItemClick(ListView parent, View v,int position,long id){
		CheckedTextView item = (CheckedTextView) v;
		
		Toast.makeText(this, ls.get(position) + " status : " +
		item.isChecked(), Toast.LENGTH_SHORT).show();
		/*if(item.isChecked())
		{
			
			ls3.add(ls2.get(position));
			Toast.makeText(this, ls2.get(position) + " Present" , Toast.LENGTH_SHORT).show();
			
		
		}
		else
		{
			ls3.remove(ls2.get(position));
			Toast.makeText(this, ls2.get(position) + " Absent" , Toast.LENGTH_SHORT).show();
		}*/
	}
	
	
	

	
	
	
	
}
