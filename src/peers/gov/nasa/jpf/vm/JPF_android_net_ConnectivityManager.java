package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_net_ConnectivityManager extends NativePeer{
	  @MJI
  public static boolean isNetworkTypeValid__I__Z (MJIEnv env, int clsObjRef, int v0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setNetworkPreference__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getNetworkPreference____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getActiveNetworkInfo____Landroid_net_NetworkInfo_2 (MJIEnv env, int objRef) {
    int rNetworkInfo = MJIEnv.NULL;
    return rNetworkInfo;
  }
	  @MJI
  public static int getNetworkInfo__I__Landroid_net_NetworkInfo_2 (MJIEnv env, int objRef, int v0) {
    int rNetworkInfo = MJIEnv.NULL;
    return rNetworkInfo;
  }
	  @MJI
  public static int getAllNetworkInfo_____3Landroid_net_NetworkInfo_2 (MJIEnv env, int objRef) {
    int rNetworkInfo = MJIEnv.NULL;
    return rNetworkInfo;
  }
	  @MJI
  public static boolean setRadios__Z__Z (MJIEnv env, int objRef, boolean v0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean setRadio__IZ__Z (MJIEnv env, int objRef, int v0, boolean v1) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int startUsingNetworkFeature__ILjava_lang_String_2__I (MJIEnv env, int objRef, int v0, int rString1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int stopUsingNetworkFeature__ILjava_lang_String_2__I (MJIEnv env, int objRef, int v0, int rString1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static boolean requestRouteToHost__II__Z (MJIEnv env, int objRef, int v0, int v1) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean getBackgroundDataSetting____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setBackgroundDataSetting__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean getMobileDataEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setMobileDataEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static int getTetherableIfaces_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getTetheredIfaces_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getTetheringErroredIfaces_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int tether__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int untether__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static boolean isTetheringSupported____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int getTetherableUsbRegexs_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getTetherableWifiRegexs_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getLastTetherError__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void reportInetCondition__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
}
