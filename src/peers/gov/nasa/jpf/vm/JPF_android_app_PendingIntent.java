package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_app_PendingIntent extends NativePeer{
//  public static void $clinit (MJIEnv env, int clsObjRef) {
//  }
	@MJI
  public static boolean equals__Ljava_lang_Object_2__Z (MJIEnv env, int objRef, int rObject0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int toString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int hashCode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static void send__Landroid_content_Context_2ILandroid_content_Intent_2__V (MJIEnv env, int objRef, int rContext0, int v1, int rIntent2) {
  }
	@MJI
  public static void send__ILandroid_app_PendingIntent$OnFinished_2Landroid_os_Handler_2__V (MJIEnv env, int objRef, int v0, int rPendingIntent$OnFinished1, int rHandler2) {
  }
	@MJI
  public static void send__Landroid_content_Context_2ILandroid_content_Intent_2Landroid_app_PendingIntent$OnFinished_2Landroid_os_Handler_2__V (MJIEnv env, int objRef, int rContext0, int v1, int rIntent2, int rPendingIntent$OnFinished3, int rHandler4) {
  }
	@MJI
  public static void send__I__V (MJIEnv env, int objRef, int v0) {
  }
	@MJI
  public static void send____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static int getActivity__Landroid_content_Context_2ILandroid_content_Intent_2I__Landroid_app_PendingIntent_2 (MJIEnv env, int clsObjRef, int rContext0, int v1, int rIntent2, int v3) {
	  int rPendingIntent = env.newObject("android.app.PendingIntent");
    
    return rPendingIntent;
  }
	@MJI
  public static int getBroadcast__Landroid_content_Context_2ILandroid_content_Intent_2I__Landroid_app_PendingIntent_2 (MJIEnv env, int clsObjRef, int rContext0, int v1, int rIntent2, int v3) {
    int rPendingIntent = MJIEnv.NULL;
    return rPendingIntent;
  }
	@MJI
  public static int getService__Landroid_content_Context_2ILandroid_content_Intent_2I__Landroid_app_PendingIntent_2 (MJIEnv env, int clsObjRef, int rContext0, int v1, int rIntent2, int v3) {
    int rPendingIntent = MJIEnv.NULL;
    return rPendingIntent;
  }
	@MJI
  public static int getIntentSender____Landroid_content_IntentSender_2 (MJIEnv env, int objRef) {
    int rIntentSender = MJIEnv.NULL;
    return rIntentSender;
  }
	@MJI
  public static void cancel____V (MJIEnv env, int objRef) {
  }
	@MJI
  public static int getTargetPackage____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int describeContents____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static void writeToParcel__Landroid_os_Parcel_2I__V (MJIEnv env, int objRef, int rParcel0, int v1) {
  }
	@MJI
  public static void writePendingIntentOrNullToParcel__Landroid_app_PendingIntent_2Landroid_os_Parcel_2__V (MJIEnv env, int clsObjRef, int rPendingIntent0, int rParcel1) {
  }
	@MJI
  public static int readPendingIntentOrNullFromParcel__Landroid_os_Parcel_2__Landroid_app_PendingIntent_2 (MJIEnv env, int clsObjRef, int rParcel0) {
    int rPendingIntent = MJIEnv.NULL;
    return rPendingIntent;
  }
	@MJI
  public static int getTarget____Landroid_content_IIntentSender_2 (MJIEnv env, int objRef) {
    int rIIntentSender = MJIEnv.NULL;
    return rIIntentSender;
  }
}	