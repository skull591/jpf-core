package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_app_TabActivity extends NativePeer{
	@MJI
  public static void setDefaultTab__I__V (MJIEnv env, int objRef, int v0) {
  }
	@MJI
  public static void setDefaultTab__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	@MJI
  public static void onRestoreInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
  }
	@MJI
  public static void onPostCreate__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
  }
	@MJI
  public static void onSaveInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
  }
	@MJI
  public static void onContentChanged____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static void ensureTabHost____V (MJIEnv env, int objRef) {
	  int mTabHostRef = env.getReferenceField(objRef, "mTabHost");
	  if(mTabHostRef == -1){
		  int newTabHostRef = env.newObject("android.widget.TabHost");
		  env.setReferenceField(objRef, "mTabHost", newTabHostRef);
	  }
  }
	@MJI
  public static void onChildTitleChanged__Landroid_app_Activity_2Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rActivity0, int rCharSequence1) {
  }
	@MJI
  public static int getTabHost____Landroid_widget_TabHost_2 (MJIEnv env, int objRef) {
	  ensureTabHost____V(env, objRef);
	  
    return env.getReferenceField(objRef, "mTabHost");
  }
	@MJI
  public static int getTabWidget____Landroid_widget_TabWidget_2 (MJIEnv env, int objRef) {
    int rTabWidget = MJIEnv.NULL;
    return rTabWidget;
  }
}	