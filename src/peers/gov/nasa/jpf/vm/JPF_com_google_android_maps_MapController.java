package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_google_android_maps_MapController extends NativePeer{
	public static void doSomething(){
		//what?!
		//TODO
		int a = 5;
		a = a + 6;
		a = a - 6;
	}
	  @MJI
  public static void stopPanning____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static boolean onKey__Landroid_view_View_2ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int rView0, int v1, int rKeyEvent2) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void animateTo__Lcom_google_android_maps_GeoPoint_2Landroid_os_Message_2__V (MJIEnv env, int objRef, int rGeoPoint0, int rMessage1) {
	  doSomething();
  }
	  @MJI
  public static void animateTo__Lcom_google_android_maps_GeoPoint_2Ljava_lang_Runnable_2__V (MJIEnv env, int objRef, int rGeoPoint0, int rRunnable1) {
	  doSomething();
  }
	  @MJI
  public static void animateTo__Lcom_google_android_maps_GeoPoint_2__V (MJIEnv env, int objRef, int rGeoPoint0) {
	  doSomething();
  }
	  @MJI
  public static void scrollBy__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static void setCenter__Lcom_google_android_maps_GeoPoint_2__V (MJIEnv env, int objRef, int rGeoPoint0) {
  }
	  @MJI
  public static void stopAnimation__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static int setZoom__I__I (MJIEnv env, int objRef, int v0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void zoomToSpan__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static boolean zoomIn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean zoomOut____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean zoomInFixing__II__Z (MJIEnv env, int objRef, int v0, int v1) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean zoomOutFixing__II__Z (MJIEnv env, int objRef, int v0, int v1) {
    boolean v = false;
    return v;
  }
}  
