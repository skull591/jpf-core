package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_app_Service extends NativePeer{
	@MJI
  public static void finalize____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static int getClassName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int getApplication____Landroid_app_Application_2 (MJIEnv env, int objRef) {
    int rApplication = MJIEnv.NULL;
    return rApplication;
  }
	@MJI
  public static void onCreate____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static void onStart__Landroid_content_Intent_2I__V (MJIEnv env, int objRef, int rIntent0, int v1) {
  }
	@MJI
  public static int onStartCommand__Landroid_content_Intent_2II__I (MJIEnv env, int objRef, int rIntent0, int v1, int v2) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static void onDestroy____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static void onConfigurationChanged__Landroid_content_res_Configuration_2__V (MJIEnv env, int objRef, int rConfiguration0) {
  }
	@MJI
  public static void onLowMemory____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static int onBind__Landroid_content_Intent_2__Landroid_os_IBinder_2 (MJIEnv env, int objRef, int rIntent0) {
    int rIBinder = MJIEnv.NULL;
    return rIBinder;
  }
	@MJI
  public static boolean onUnbind__Landroid_content_Intent_2__Z (MJIEnv env, int objRef, int rIntent0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static void onRebind__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
  }
	@MJI
  public static void stopSelf____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static void stopSelf__I__V (MJIEnv env, int objRef, int v0) {
  }
	@MJI
  public static boolean stopSelfResult__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static void setForeground__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	@MJI
  public static void startForeground__ILandroid_app_Notification_2__V (MJIEnv env, int objRef, int v0, int rNotification1) {
  }
	@MJI
  public static void stopForeground__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	@MJI
  public static void dump__Ljava_io_FileDescriptor_2Ljava_io_PrintWriter_2_3Ljava_lang_String_2__V (MJIEnv env, int objRef, int rFileDescriptor0, int rPrintWriter1, int rString2) {
  }
	@MJI
  public static void attach__Landroid_content_Context_2Landroid_app_ActivityThread_2Ljava_lang_String_2Landroid_os_IBinder_2Landroid_app_Application_2Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rContext0, int rActivityThread1, int rString2, int rIBinder3, int rApplication4, int rObject5) {
  }
}
