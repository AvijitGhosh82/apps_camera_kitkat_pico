package com.android.camera;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;





import com.android.camera2.pico.R;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.preference.Preference.OnPreferenceClickListener;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class OptiMode extends PreferenceActivity {
	
	 @SuppressWarnings("deprecation")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState); 
        
        addPreferencesFromResource(R.xml.optimode);
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
               WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final ActionBar actionBar = getActionBar();
        actionBar.setCustomView(R.layout.actionbar_custom_view_home);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);
        TextView text = (TextView) findViewById(R.id.actiontext);
        text.setText("Opti Mode™");
    	actionBar.setDisplayHomeAsUpEnabled(true);
	}
	
        
	

	 @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	            case android.R.id.home:
	            	Intent intent = new Intent(this, CameraActivity.class);
	        	    startActivity(intent);
	        	    finish();
	                return(true);
	        }

	        return(super.onOptionsItemSelected(item));
	    }
	    
	    @Override
	    public boolean onKeyDown(int keyCode, KeyEvent event)
	    {
	        if ((keyCode == KeyEvent.KEYCODE_BACK))
	        {
	        	Intent intent = new Intent(this, CameraActivity.class);
	    	    startActivity(intent);
	    	    finish();
	        }
	        return super.onKeyDown(keyCode, event);
	    }
	    
	   
	    
}
