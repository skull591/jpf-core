package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_edu_nyu_cs_omnidroid_app_model_UIDbHelper extends NativePeer{
	//directly copy from old version, may not be used
	  @MJI
	public static int getSharedPreferences____Landroid_content_SharedPreferences_2 (MJIEnv env, int objRef){
		return env.newObject("android.content.SharedPreferences");
	}
	

}
