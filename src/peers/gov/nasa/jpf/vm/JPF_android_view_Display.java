package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_Display extends NativePeer{
	  @MJI
  public static void init__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getDisplayId____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getDisplayCount____I (MJIEnv env, int clsObjRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getWidth____I (MJIEnv env, int objRef) {
    int v = (int)360;
    return v;
  }
	  @MJI
  public static int getHeight____I (MJIEnv env, int objRef) {
    int v = (int)480;
    return v;
  }
	  @MJI
  public static int getRotation____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getOrientation____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getPixelFormat____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static float getRefreshRate____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
	  @MJI
  public static void getMetrics__Landroid_util_DisplayMetrics_2__V (MJIEnv env, int objRef, int rDisplayMetrics0) {
  }
	  @MJI
  public static void nativeClassInit____V (MJIEnv env, int clsObjRef) {
  }
	  @MJI
  public static int createMetricsBasedDisplay__ILandroid_util_DisplayMetrics_2__Landroid_view_Display_2 (MJIEnv env, int clsObjRef, int v0, int rDisplayMetrics1) {
    int rDisplay = MJIEnv.NULL;
    return rDisplay;
  }
}  
