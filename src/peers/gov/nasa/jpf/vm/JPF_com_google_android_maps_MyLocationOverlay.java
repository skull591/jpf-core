package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_google_android_maps_MyLocationOverlay extends NativePeer{
	  @MJI
	public static void $init__Landroid_content_Context_2Lcom_google_android_maps_MapView_2__V(MJIEnv env, int objRef, int contextRef, int mapViewRef){
	}
	  @MJI
  public static boolean enableCompass____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void disableCompass____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static boolean isCompassEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean enableMyLocation____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void disableMyLocation____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void onSensorChanged__I_3F__V (MJIEnv env, int objRef, int v0, int rF1) {
  }
	  @MJI
  public static void onLocationChanged__Landroid_location_Location_2__V (MJIEnv env, int objRef, int rLocation0) {
  }
	  @MJI
  public static void onStatusChanged__Ljava_lang_String_2ILandroid_os_Bundle_2__V (MJIEnv env, int objRef, int rString0, int v1, int rBundle2) {
  }
	  @MJI
  public static void onProviderEnabled__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static void onProviderDisabled__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static boolean onSnapToItem__IILandroid_graphics_Point_2Lcom_google_android_maps_MapView_2__Z (MJIEnv env, int objRef, int v0, int v1, int rPoint2, int rMapView3) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean onTap__Lcom_google_android_maps_GeoPoint_2Lcom_google_android_maps_MapView_2__Z (MJIEnv env, int objRef, int rGeoPoint0, int rMapView1) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean dispatchTap____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean draw__Landroid_graphics_Canvas_2Lcom_google_android_maps_MapView_2ZJ__Z (MJIEnv env, int objRef, int rCanvas0, int rMapView1, boolean v2, long v3) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void drawMyLocation__Landroid_graphics_Canvas_2Lcom_google_android_maps_MapView_2Landroid_location_Location_2Lcom_google_android_maps_GeoPoint_2J__V (MJIEnv env, int objRef, int rCanvas0, int rMapView1, int rLocation2, int rGeoPoint3, long v4) {
  }
	  @MJI
  public static void drawCompass__Landroid_graphics_Canvas_2F__V (MJIEnv env, int objRef, int rCanvas0, float v1) {
  }
	  @MJI
  public static int getMyLocation____Lcom_google_android_maps_GeoPoint_2 (MJIEnv env, int objRef) {
    int rGeoPoint = MJIEnv.NULL;
    return rGeoPoint;
  }
	  @MJI
  public static int getLastFix____Landroid_location_Location_2 (MJIEnv env, int objRef) {
    int rLocation = MJIEnv.NULL;
    return rLocation;
  }
	  @MJI
  public static float getOrientation____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
	  @MJI
  public static boolean isMyLocationEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean runOnFirstFix__Ljava_lang_Runnable_2__Z (MJIEnv env, int objRef, int rRunnable0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void onAccuracyChanged__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
}  
