
package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_ContextThemeWrapper extends NativePeer{
	  @MJI
	public static void $init____V(MJIEnv env, int objref){
		System.out.println("### @ContextThemeWrapper constructor");
	}
	  @MJI
  public static void attachBaseContext__Landroid_content_Context_2__V (MJIEnv env, int objRef, int rContext0) {
  }
	  @MJI
  public static void setTheme__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getTheme____Landroid_content_res_Resources$Theme_2 (MJIEnv env, int objRef) {
    int rResources$Theme = MJIEnv.NULL;
    return rResources$Theme;
  }
	  @MJI
  public static int getSystemService__Ljava_lang_String_2__Ljava_lang_Object_2 (MJIEnv env, int objRef, int rString0) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
	  @MJI
  public static void onApplyThemeResource__Landroid_content_res_Resources$Theme_2IZ__V (MJIEnv env, int objRef, int rResources$Theme0, int v1, boolean v2) {
  }
}
