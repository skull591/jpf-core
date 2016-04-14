package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_app_ListActivity extends NativePeer{
	//andrew manually
	@MJI
		public static void $init____V(MJIEnv env, int objref){
		}
	@MJI
  public static void onListItemClick__Landroid_widget_ListView_2Landroid_view_View_2IJ__V (MJIEnv env, int objRef, int rListView0, int rView1, int v2, long v3) {
  }
	@MJI
  public static void onRestoreInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
  }
	@MJI
  public static void onDestroy____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static void onContentChanged____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static void setListAdapter__Landroid_widget_ListAdapter_2__V (MJIEnv env, int objRef, int rListAdapter0) {
  }
	@MJI
  public static void setSelection__I__V (MJIEnv env, int objRef, int v0) {
  }
	@MJI
  public static int getSelectedItemPosition____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static long getSelectedItemId____J (MJIEnv env, int objRef) {
    long v = (long)0;
    return v;
  }
	@MJI
  public static int getListView____Landroid_widget_ListView_2 (MJIEnv env, int objRef) {
    int rListView = env.newObject("android.widget.ListView");
    return rListView;
  }
	@MJI
  public static int getListAdapter____Landroid_widget_ListAdapter_2 (MJIEnv env, int objRef) {
    int rListAdapter = MJIEnv.NULL;
    return rListAdapter;
  }
}
