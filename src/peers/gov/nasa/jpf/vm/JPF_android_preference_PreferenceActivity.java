package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_preference_PreferenceActivity extends NativePeer{
	  @MJI
  public static int getPreferenceScreen____Landroid_preference_PreferenceScreen_2(MJIEnv env, int objRef){
	  return env.newObject("android.preference.PreferenceScreen");
  }
}
