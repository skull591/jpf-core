package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_SurfaceView extends NativePeer{
	  @MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int ctxtRef){
		
	}
	  @MJI
  public static void access$000__Landroid_view_SurfaceView_2ZZ__V (MJIEnv env, int clsObjRef, int rSurfaceView0, boolean v1, boolean v2) {
  }
	  @MJI
  public static void init____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int getHolder____Landroid_view_SurfaceHolder_2 (MJIEnv env, int objRef) {
    int rSurfaceHolder = env.newObject("android.view.SurfaceHolder");
    return rSurfaceHolder;
  }
	  @MJI
  public static void onAttachedToWindow____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void onWindowVisibilityChanged__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void setVisibility__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void showSurface____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void hideSurface____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void onDetachedFromWindow____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void onMeasure__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static boolean setFrame__IIII__Z (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean gatherTransparentRegion__Landroid_graphics_Region_2__Z (MJIEnv env, int objRef, int rRegion0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void draw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
	  @MJI
  public static void dispatchDraw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
	  @MJI
  public static void setZOrderMediaOverlay__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static void setZOrderOnTop__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static void setWindowType__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void updateWindow__ZZ__V (MJIEnv env, int objRef, boolean v0, boolean v1) {
  }
	  @MJI
  public static void reportSurfaceDestroyed____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void handleGetNewSurface____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static boolean isFixedSize____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
}  