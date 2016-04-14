package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_widget_ArrayAdapter extends NativePeer{
	  @MJI
  public static void add__Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rObject0) {
  }
	  @MJI
  public static void clear____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void remove__Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rObject0) {
  }
	  @MJI
  public static int getContext____Landroid_content_Context_2 (MJIEnv env, int objRef) {
    int rContext = MJIEnv.NULL;
    return rContext;
  }
	  @MJI
  public static void insert__Ljava_lang_Object_2I__V (MJIEnv env, int objRef, int rObject0, int v1) {
  }
	  @MJI
  public static void sort__Ljava_util_Comparator_2__V (MJIEnv env, int objRef, int rComparator0) {
  }
	  @MJI
  public static void notifyDataSetChanged____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void setNotifyOnChange__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static int getCount____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getItem__I__Ljava_lang_Object_2 (MJIEnv env, int objRef, int v0) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
	  @MJI
  public static int getPosition__Ljava_lang_Object_2__I (MJIEnv env, int objRef, int rObject0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static long getItemId__I__J (MJIEnv env, int objRef, int v0) {
    long v = (long)0;
    return v;
  }
	  @MJI
  public static int getView__ILandroid_view_View_2Landroid_view_ViewGroup_2__Landroid_view_View_2 (MJIEnv env, int objRef, int v0, int rView1, int rViewGroup2) {
    int rView = MJIEnv.NULL;
    return rView;
  }
	  @MJI
  public static void setDropDownViewResource__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getDropDownView__ILandroid_view_View_2Landroid_view_ViewGroup_2__Landroid_view_View_2 (MJIEnv env, int objRef, int v0, int rView1, int rViewGroup2) {
    int rView = MJIEnv.NULL;
    return rView;
  }
	  @MJI
  public static int createFromResource__Landroid_content_Context_2II__Landroid_widget_ArrayAdapter_2 (MJIEnv env, int clsObjRef, int rContext0, int v1, int v2) {
    int rArrayAdapter = env.newObject("android.widget.ArrayAdapter");
    return rArrayAdapter;
  }
	  @MJI
  public static int getFilter____Landroid_widget_Filter_2 (MJIEnv env, int objRef) {
    int rFilter = MJIEnv.NULL;
    return rFilter;
  }
}  
