package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_preference_PreferenceScreen extends NativePeer{
	  @MJI
	public static void $init____V(MJIEnv env, int objRef){
		
	}
	  @MJI	  
	public static int getSharedPreferences____Landroid_content_SharedPreferences_2(MJIEnv env, int objRef){
		System.out.println("@@@@@@@@@@@@@@@@@@@");
		return env.newObject("android.content.SharedPreferences");
	}
}
