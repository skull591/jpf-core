package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_location_LocationManager extends NativePeer{
	
//	public static void $init__Ljava_lang_Object_2__V(MJIEnv env, int objRef, int ref){
//		System.out.println("@LocationManager constructor");
//	}
	  @MJI
  public static int getProvider__Ljava_lang_String_2__Landroid_location_LocationProvider_2 (MJIEnv env, int objRef, int rString0) {
	  String providerName = env.getStringObject(rString0);
	  int rLocationProvider = env.newObject("android.location.LocationProvider");
//	  env.setReferenceField(rLocationProvider, "", rString0);
    return rLocationProvider;
  }
	  @MJI
  public static int getAllProviders____Ljava_util_List_2 (MJIEnv env, int objRef) {
	  int rList = env.newObject("java.util.ArrayList");
	  FieldInfo fi = env.getHeap().get(rList).getFieldInfo("elementData");
	    int ref = env.newObjectArray("java.lang.String", 1);
	    
	    env.setReferenceField(rList, "elementData", ref);
	    env.setIntField(rList, "size", 1);
	  
	    return rList;
  }
	  @MJI
  public static int getProviders__Landroid_location_Criteria_2Z__Ljava_util_List_2 (MJIEnv env, int objRef, int rCriteria0, boolean v1) {
	  int rList = env.newObject("java.util.ArrayList");
	  FieldInfo fi = env.getHeap().get(rList).getFieldInfo("elementData");
	    int ref = env.newObjectArray("java.lang.String", 1);
	    
	    env.setReferenceField(rList, "elementData", ref);
	    env.setIntField(rList, "size", 1);
	  
	    return rList;
  }
	  @MJI
  public static int getProviders__Z__Ljava_util_List_2 (MJIEnv env, int objRef, boolean v0) {
	  int rList = env.newObject("java.util.ArrayList");
	  FieldInfo fi = env.getHeap().get(rList).getFieldInfo("elementData");
	    int ref = env.newObjectArray("java.lang.String", 1);
	    
	    env.setReferenceField(rList, "elementData", ref);
	    env.setIntField(rList, "size", 1);
	  
	    return rList;
  }
	  @MJI
  public static int getBestProvider__Landroid_location_Criteria_2Z__Ljava_lang_String_2 (MJIEnv env, int objRef, int rCriteria0, boolean v1) {
    int rString = env.newString("gps");
    return rString;
  }
	  @MJI
  public static void requestLocationUpdates__Ljava_lang_String_2JFLandroid_location_LocationListener_2__V (MJIEnv env, int objRef, int rString0, long v1, float v2, int rLocationListener3) {
  }
	  @MJI
  public static void requestLocationUpdates__Ljava_lang_String_2JFLandroid_location_LocationListener_2Landroid_os_Looper_2__V (MJIEnv env, int objRef, int rString0, long v1, float v2, int rLocationListener3, int rLooper4) {
  }
	  @MJI
  public static void requestLocationUpdates__JFLandroid_location_Criteria_2Landroid_location_LocationListener_2Landroid_os_Looper_2__V (MJIEnv env, int objRef, long v0, float v1, int rCriteria2, int rLocationListener3, int rLooper4) {
  }
	  @MJI
  public static void requestLocationUpdates__Ljava_lang_String_2JFLandroid_app_PendingIntent_2__V (MJIEnv env, int objRef, int rString0, long v1, float v2, int rPendingIntent3) {
  }
	  @MJI
  public static void requestLocationUpdates__JFLandroid_location_Criteria_2Landroid_app_PendingIntent_2__V (MJIEnv env, int objRef, long v0, float v1, int rCriteria2, int rPendingIntent3) {
  }
	  @MJI
  public static void requestSingleUpdate__Landroid_location_Criteria_2Landroid_location_LocationListener_2Landroid_os_Looper_2__V (MJIEnv env, int objRef, int rCriteria0, int rLocationListener1, int rLooper2) {
  }
	  @MJI
  public static void requestSingleUpdate__Ljava_lang_String_2Landroid_app_PendingIntent_2__V (MJIEnv env, int objRef, int rString0, int rPendingIntent1) {
  }
	  @MJI
  public static void requestSingleUpdate__Landroid_location_Criteria_2Landroid_app_PendingIntent_2__V (MJIEnv env, int objRef, int rCriteria0, int rPendingIntent1) {
  }
	  @MJI
  public static void requestSingleUpdate__Ljava_lang_String_2Landroid_location_LocationListener_2Landroid_os_Looper_2__V (MJIEnv env, int objRef, int rString0, int rLocationListener1, int rLooper2) {
  }
	  @MJI
  public static void removeUpdates__Landroid_app_PendingIntent_2__V (MJIEnv env, int objRef, int rPendingIntent0) {
  }
	  @MJI
  public static void removeUpdates__Landroid_location_LocationListener_2__V (MJIEnv env, int objRef, int rLocationListener0) {
  }
	  @MJI
  public static void addProximityAlert__DDFJLandroid_app_PendingIntent_2__V (MJIEnv env, int objRef, double v0, double v1, float v2, long v3, int rPendingIntent4) {
  }
	  @MJI
  public static void removeProximityAlert__Landroid_app_PendingIntent_2__V (MJIEnv env, int objRef, int rPendingIntent0) {
  }
	  @MJI
  public static boolean isProviderEnabled__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
//    String s = env.getStringObject(rString0);
//    if(s.equals("gps")){
//    	return true;
//    } else{
//    	return false;
//    }
	  rString0 = env.newString("gps");
	  return true;
  }
	  @MJI
  public static int getLastKnownLocation__Ljava_lang_String_2__Landroid_location_Location_2 (MJIEnv env, int objRef, int rString0) {
    int rLocation = env.newObject("android.location.Location");
    return rLocation;
  }
	  @MJI
  public static void addTestProvider__Ljava_lang_String_2ZZZZZZZII__V (MJIEnv env, int objRef, int rString0, boolean v1, boolean v2, boolean v3, boolean v4, boolean v5, boolean v6, boolean v7, int v8, int v9) {
  }
	  @MJI
  public static void removeTestProvider__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static void setTestProviderLocation__Ljava_lang_String_2Landroid_location_Location_2__V (MJIEnv env, int objRef, int rString0, int rLocation1) {
  }
	  @MJI
  public static void clearTestProviderLocation__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static void setTestProviderEnabled__Ljava_lang_String_2Z__V (MJIEnv env, int objRef, int rString0, boolean v1) {
  }
	  @MJI
  public static void clearTestProviderEnabled__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static void setTestProviderStatus__Ljava_lang_String_2ILandroid_os_Bundle_2J__V (MJIEnv env, int objRef, int rString0, int v1, int rBundle2, long v3) {
  }
	  @MJI
  public static void clearTestProviderStatus__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static boolean addGpsStatusListener__Landroid_location_GpsStatus$Listener_2__Z (MJIEnv env, int objRef, int rGpsStatus$Listener0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void removeGpsStatusListener__Landroid_location_GpsStatus$Listener_2__V (MJIEnv env, int objRef, int rGpsStatus$Listener0) {
  }
	  @MJI
  public static boolean addNmeaListener__Landroid_location_GpsStatus$NmeaListener_2__Z (MJIEnv env, int objRef, int rGpsStatus$NmeaListener0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void removeNmeaListener__Landroid_location_GpsStatus$NmeaListener_2__V (MJIEnv env, int objRef, int rGpsStatus$NmeaListener0) {
  }
	  @MJI
  public static int getGpsStatus__Landroid_location_GpsStatus_2__Landroid_location_GpsStatus_2 (MJIEnv env, int objRef, int rGpsStatus0) {
    int rGpsStatus = MJIEnv.NULL;
    return rGpsStatus;
  }
	  @MJI
  public static boolean sendExtraCommand__Ljava_lang_String_2Ljava_lang_String_2Landroid_os_Bundle_2__Z (MJIEnv env, int objRef, int rString0, int rString1, int rBundle2) {
    boolean v = false;
    return v;
  }
}  
