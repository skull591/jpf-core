package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_os_ServiceManager extends NativePeer{
  @MJI
  public static int getIServiceManager____Landroid_os_IServiceManager_2 (MJIEnv env, int clsObjRef) {
    int rIServiceManager = MJIEnv.NULL;
    return rIServiceManager;
  }
  @MJI
  public static int getService__Ljava_lang_String_2__Landroid_os_IBinder_2 (MJIEnv env, int clsObjRef, int rString0) {
	//the IBinder is a interface, which means that return a IBinder may cause abstractMethod Error, so we return null for the time being
    int rIBinder = MJIEnv.NULL;
    return rIBinder;
  }
  @MJI
  public static void addService__Ljava_lang_String_2Landroid_os_IBinder_2__V (MJIEnv env, int clsObjRef, int rString0, int rIBinder1) {
  }
  @MJI
  public static int checkService__Ljava_lang_String_2__Landroid_os_IBinder_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rIBinder = MJIEnv.NULL;
    return rIBinder;
  }
  @MJI
  public static int listServices_____3Ljava_lang_String_2 (MJIEnv env, int clsObjRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static void initServiceCache__Ljava_util_Map_2__V (MJIEnv env, int clsObjRef, int rMap0) {
  }
}
