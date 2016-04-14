package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_google_android_maps_MapView extends NativePeer{
	  @MJI
  public static boolean isOpaque____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void onSizeChanged__IIII__V (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
  }
	  @MJI
  public static void onDetachedFromWindow____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void computeScroll____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void onDraw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
	  @MJI
  public static void onMeasure__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static void onWindowFocusChanged__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static void onFocusChanged__ZILandroid_graphics_Rect_2__V (MJIEnv env, int objRef, boolean v0, int v1, int rRect2) {
  }
	  @MJI
  public static boolean onKeyDown__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean onKeyUp__ILandroid_view_KeyEvent_2__Z (MJIEnv env, int objRef, int v0, int rKeyEvent1) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean onTrackballEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean onTouchEvent__Landroid_view_MotionEvent_2__Z (MJIEnv env, int objRef, int rMotionEvent0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void onVisibilityChanged__Landroid_view_View_2I__V (MJIEnv env, int objRef, int rView0, int v1) {
  }
	  @MJI
  public static int generateDefaultLayoutParams____Lcom_google_android_maps_MapView$LayoutParams_2 (MJIEnv env, int objRef) {
    int rMapView$LayoutParams = MJIEnv.NULL;
    return rMapView$LayoutParams;
  }
	  @MJI
  public static int generateDefaultLayoutParams____Landroid_view_ViewGroup$LayoutParams_2 (MJIEnv env, int objRef) {
    int rViewGroup$LayoutParams = MJIEnv.NULL;
    return rViewGroup$LayoutParams;
  }
	  @MJI
  public static void onLayout__ZIIII__V (MJIEnv env, int objRef, boolean v0, int v1, int v2, int v3, int v4) {
  }
	  @MJI
  public static int generateLayoutParams__Landroid_view_ViewGroup$LayoutParams_2__Landroid_view_ViewGroup$LayoutParams_2 (MJIEnv env, int objRef, int rViewGroup$LayoutParams0) {
    int rViewGroup$LayoutParams = MJIEnv.NULL;
    return rViewGroup$LayoutParams;
  }
	  @MJI
  public static int generateLayoutParams__Landroid_util_AttributeSet_2__Landroid_view_ViewGroup$LayoutParams_2 (MJIEnv env, int objRef, int rAttributeSet0) {
    int rViewGroup$LayoutParams = MJIEnv.NULL;
    return rViewGroup$LayoutParams;
  }
	  @MJI
  public static boolean checkLayoutParams__Landroid_view_ViewGroup$LayoutParams_2__Z (MJIEnv env, int objRef, int rViewGroup$LayoutParams0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void displayZoomControls__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean canCoverCenter____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void preLoad____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int getZoomLevel____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setSatellite__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isSatellite____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setTraffic__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isTraffic____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setStreetView__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static boolean isStreetView____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int getMapCenter____Lcom_google_android_maps_GeoPoint_2 (MJIEnv env, int objRef) {
    int rGeoPoint = MJIEnv.NULL;
    return rGeoPoint;
  }
	  @MJI
  public static int getController____Lcom_google_android_maps_MapController_2 (MJIEnv env, int objRef) {
    int rMapController = env.newObject("com.google.android.maps.MapController");
    return rMapController;
  }
	  @MJI
  public static int getOverlays____Ljava_util_List_2 (MJIEnv env, int objRef) {
    int rList = env.newObject("java.util.ArrayList");
    //FieldInfo fi = env.getHeap().get(rList).getFieldInfo("elementData");
    int ref = env.newObjectArray("java.lang.Object", 0);
    env.setReferenceField(rList, "elementData", ref);
    env.setIntField(rList, "size", 0);
    return rList;
  }
	  @MJI
  public static int getLatitudeSpan____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getLongitudeSpan____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setReticleDrawMode__Lcom_google_android_maps_MapView$ReticleDrawMode_2__V (MJIEnv env, int objRef, int rMapView$ReticleDrawMode0) {
  }
	  @MJI
  public static int getMaxZoomLevel____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void onSaveInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
  }
	  @MJI
  public static void onRestoreInstanceState__Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rBundle0) {
  }
	  @MJI
  public static int getZoomControls____Landroid_view_View_2 (MJIEnv env, int objRef) {
    int rView = MJIEnv.NULL;
    return rView;
  }
	  @MJI
  public static int getZoomButtonsController____Landroid_widget_ZoomButtonsController_2 (MJIEnv env, int objRef) {
    int rZoomButtonsController = MJIEnv.NULL;
    return rZoomButtonsController;
  }
	  @MJI
  public static void setBuiltInZoomControls__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static int getProjection____Lcom_google_android_maps_Projection_2 (MJIEnv env, int objRef) {
    int rProjection = MJIEnv.NULL;
    return rProjection;
  }
}
