package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_util_Log extends NativePeer{
	static boolean enabled = false;
	  @MJI
  public static void $clinit (MJIEnv env, int clsObjRef) {
  }
	  @MJI
  public static int println__ILjava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int v0, int rString1, int rString2) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int i__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1) {
	  if(enabled){
		  System.out.println("[Log Info] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int i__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1, int rThrowable2) {
	  if(enabled){
		  System.out.println("[Log Info+Exception] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
	  int v = (int)0;
    return v;
  }
	  @MJI
  public static int v__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1, int rThrowable2) {
	  if(enabled){
		  System.out.println("[Log Verbose] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
	  int v = (int)0;
    return v;
  }
	  @MJI
  public static int v__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1) {
	  if(enabled){
		  System.out.println("[Log Verbose+Exception] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
	  int v = (int)0;
    return v;
  }
	  @MJI
  public static int d__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1) {
	  if(enabled){
		  System.out.println("[Log Debug] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int d__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1, int rThrowable2) {
	  if(enabled){
		  System.out.println("[Log Debug+Exception] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
	  int v = (int)0;
    return v;
  }
	  @MJI
  public static int w__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1, int rThrowable2) {
	  if(enabled){
		  System.out.println("[Log Warning+Exception] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
	  int v = (int)0;
    return v;
  }
	  @MJI
  public static int w__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1) {
	  if(enabled){
		  System.out.println("[Log Warning] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int w__Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rThrowable1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static boolean isLoggable__Ljava_lang_String_2I__Z (MJIEnv env, int clsObjRef, int rString0, int v1) {
    boolean v = true;
    return v;
  }
	  @MJI
  public static int e__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1, int rThrowable2) {
	  if(enabled){
		  System.out.println("[Log Error+Exception] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int e__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1) {
	  if(enabled){
		  System.out.println("[Log Error] "+env.getStringObject(rString0)+":"+env.getStringObject(rString1));
	  }
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int wtf__Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rThrowable1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int wtf__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int wtf__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Throwable_2__I (MJIEnv env, int clsObjRef, int rString0, int rString1, int rThrowable2) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int setWtfHandler__Landroid_util_Log$TerribleFailureHandler_2__Landroid_util_Log$TerribleFailureHandler_2 (MJIEnv env, int clsObjRef, int rLog$TerribleFailureHandler0) {
    int rLog$TerribleFailureHandler = MJIEnv.NULL;
    return rLog$TerribleFailureHandler;
  }
	  @MJI
  public static int getStackTraceString__Ljava_lang_Throwable_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int rThrowable0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int println_native__IILjava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int v0, int v1, int rString2, int rString3) {
    int v = (int)0;
    return v;
  }
}
