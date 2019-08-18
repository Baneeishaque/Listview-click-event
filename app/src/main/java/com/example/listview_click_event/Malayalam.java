package com.example.listview_click_event;

import java.util.Vector;

import android.app.Activity;
import android.app.LauncherActivity.ListItem;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Malayalam extends Activity {
	
	static Vector ls2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.malayalam);
		
		ls2=new Vector();
		ls2.add("Register Number:Name:Present");
		ls2.add("Register Number:Name:Absent");
		
		
		ArrayAdapter adapter=new ArrayAdapter<String>(this,R.layout.listview,ls2);
		final ListView listview=(ListView) findViewById(R.id.list);
		listview.setAdapter(adapter);
		listview.setClickable(true);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				String it=ls2.get(position).toString();
				int l=it.indexOf(":");
				String reg=it.substring(0,l);
				
				it=it.substring(l+1);
						l=it.indexOf(":");
						String na=it.substring(0,l);
						
						it=it.substring(l+1);
						
						//Toast.makeText(getApplicationContext(), reg, Toast.LENGTH_SHORT).show();
						//Toast.makeText(getApplicationContext(), na, Toast.LENGTH_SHORT).show();
						//Toast.makeText(getApplicationContext(), it, Toast.LENGTH_SHORT).show();
						if(it.equals("Present"))
						{
							//ls2.set(position, reg+":"+na+":"+"Absent");
							//startActivity(new Intent(Malayalam.this,Malayalam.class));
							((TextView)view).setText(reg+":"+na+":"+"Absent");
						}
						if(it.equals("Absent"))
						{
							//ls2.set(position, reg+":"+na+":"+"Present");
							//startActivity(new Intent(Malayalam.this,Malayalam.class));
							((TextView)view).setText(reg+":"+na+":"+"Present");
						}
						
					
					
					
				
				
			}

			
			
		});
	}

	
}
