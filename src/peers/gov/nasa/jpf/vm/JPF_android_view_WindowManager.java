package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_WindowManager extends NativePeer{
	  @MJI
  public static int getDefaultDisplay____Landroid_view_Display_2 (MJIEnv env, int objRef) {
    int rDisplay = env.newObject("android.view.Display");
    return rDisplay;
  }
	  @MJI
  public static void removeViewImmediate__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
  }
}
