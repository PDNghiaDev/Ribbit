package com.teamtreehouse.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, 
	    	"hKL7SGBdyvRCViKNk4jEsF2Fpl4tBMMr2324ZBdC",
	    	"pbFNv6W51yFuWmZVrhdVLPlsqY6qt5bhxDS2chpI");
	}
}
