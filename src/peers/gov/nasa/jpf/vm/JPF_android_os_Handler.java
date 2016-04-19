package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_os_Handler extends NativePeer{
	@MJI
	public static void $init____V(MJIEnv env, int objref){
		//System.out.println("not using?");
	}
	@MJI	
	public static void $init__Landroid_os_Looper_2__V(MJIEnv env, int objRef, int looperRef){
		//System.out.println("not using?");
	}
	@MJI	
  public static int toString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static void handleMessage__Landroid_os_Message_2__V (MJIEnv env, int objRef, int rMessage0) {
  }
	@MJI
  public static void dispatchMessage__Landroid_os_Message_2__V (MJIEnv env, int objRef, int rMessage0) {
  }
	@MJI
  public static int obtainMessage__ILjava_lang_Object_2__Landroid_os_Message_2 (MJIEnv env, int objRef, int v0, int rObject1) {
    int rMessage = MJIEnv.NULL;
    return rMessage;
  }
	@MJI
  public static int obtainMessage__III__Landroid_os_Message_2 (MJIEnv env, int objRef, int v0, int v1, int v2) {
    int rMessage = MJIEnv.NULL;
    return rMessage;
  }
	@MJI
  public static int obtainMessage__IIILjava_lang_Object_2__Landroid_os_Message_2 (MJIEnv env, int objRef, int v0, int v1, int v2, int rObject3) {
    int rMessage = MJIEnv.NULL;
    return rMessage;
  }
	@MJI
  public static int obtainMessage____Landroid_os_Message_2 (MJIEnv env, int objRef) {
    int rMessage = MJIEnv.NULL;
    return rMessage;
  }
	@MJI
  public static int obtainMessage__I__Landroid_os_Message_2 (MJIEnv env, int objRef, int v0) {
    int rMessage = MJIEnv.NULL;
    return rMessage;
  }
	@MJI
  public static boolean post__Ljava_lang_Runnable_2__Z (MJIEnv env, int objRef, int rRunnable0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean postAtTime__Ljava_lang_Runnable_2J__Z (MJIEnv env, int objRef, int rRunnable0, long v1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean postAtTime__Ljava_lang_Runnable_2Ljava_lang_Object_2J__Z (MJIEnv env, int objRef, int rRunnable0, int rObject1, long v2) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean postDelayed__Ljava_lang_Runnable_2J__Z (MJIEnv env, int objRef, int rRunnable0, long v1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean postAtFrontOfQueue__Ljava_lang_Runnable_2__Z (MJIEnv env, int objRef, int rRunnable0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static void removeCallbacks__Ljava_lang_Runnable_2Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rRunnable0, int rObject1) {
  }
	@MJI
  public static void removeCallbacks__Ljava_lang_Runnable_2__V (MJIEnv env, int objRef, int rRunnable0) {
  }
	@MJI
  public static boolean sendMessage__Landroid_os_Message_2__Z (MJIEnv env, int objRef, int rMessage0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean sendEmptyMessage__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean sendEmptyMessageDelayed__IJ__Z (MJIEnv env, int objRef, int v0, long v1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean sendEmptyMessageAtTime__IJ__Z (MJIEnv env, int objRef, int v0, long v1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean sendMessageDelayed__Landroid_os_Message_2J__Z (MJIEnv env, int objRef, int rMessage0, long v1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean sendMessageAtTime__Landroid_os_Message_2J__Z (MJIEnv env, int objRef, int rMessage0, long v1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean sendMessageAtFrontOfQueue__Landroid_os_Message_2__Z (MJIEnv env, int objRef, int rMessage0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static void removeMessages__I__V (MJIEnv env, int objRef, int v0) {
  }
	@MJI
  public static void removeMessages__ILjava_lang_Object_2__V (MJIEnv env, int objRef, int v0, int rObject1) {
  }
	@MJI
  public static void removeCallbacksAndMessages__Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rObject0) {
  }
	@MJI
  public static boolean hasMessages__ILjava_lang_Object_2__Z (MJIEnv env, int objRef, int v0, int rObject1) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean hasMessages__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int getLooper____Landroid_os_Looper_2 (MJIEnv env, int objRef) {
    int rLooper = MJIEnv.NULL;
    return rLooper;
  }
	@MJI
  public static void dump__Landroid_util_Printer_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rPrinter0, int rString1) {
  }
}
