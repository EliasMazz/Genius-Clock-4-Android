package com.genius;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class GeniusAlarmReceiver extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent arg1) {
		// TODO Auto-generated method stub
		
//		Intent it = new Intent(context,GeniusLaunch.class);
		//it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		//context.startActivity(it);
		
		Intent it = new Intent("ABRIRTELA");	
		it.addCategory("GAMEGENIUS");
		it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(it);
		
		
	}

}
