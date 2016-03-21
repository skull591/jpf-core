package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_app_Fragment extends NativePeer{
	@MJI
	public static void $clinit____V(MJIEnv env, int clsObjRef){}
	@MJI
	public static void $init____V(MJIEnv env, int objRef){
	}
	//@MJI
	//public static void onAttach__Landroid_app_Activity_2__V(MJIEnv env, int objRef, int actRef){
	//}
	@MJI
	public static void onCreate__Landroid_os_Bundle_2__V(MJIEnv env, int objRef, int rBundle){
	}
	@MJI
	public static int onCreateView__Landroid_view_LayoutInflater_2Landroid_view_ViewGroup_2Landroid_os_Bundle_2__Landroid_view_View_2 (MJIEnv env, int objRef, int rLayoutInflater, int rViewGroup, int rBundle){
		int viewRef=env.newObject("Landroid/view/View;");
		return viewRef;
	}
	@MJI
	public static void onActivityCreated__Landroid_os_Bundle_2__V(MJIEnv env, int objRef, int rBundle){
	}
	@MJI
	public static void onViewStateRestored__Landroid_os_Bundle_2__V(MJIEnv env, int objRef, int rBunlde){		
	}
	
	@MJI
	public static void onStart____V(MJIEnv env, int objRef){
	}
	@MJI
	public static void onResume____V(MJIEnv env, int objRef){
	}
	@MJI
	public static void onPause____V(MJIEnv env, int objRef){
	}
	@MJI
	public static void onStop____V(MJIEnv env, int objRef){
	}
	@MJI
	public static void onDestroy____V(MJIEnv env, int objRef){
	}
	@MJI
	public static void onDetach____V(MJIEnv env, int objRef){
	}
	
	  @MJI
	  public static void startActivity__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
	  	  System.out.println("using this?");
	  }
}
