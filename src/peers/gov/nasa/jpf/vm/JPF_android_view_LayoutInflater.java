package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_view_LayoutInflater extends NativePeer{
	@MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef,int rContext){}
	
	@MJI
	public static void $init__Landroid_view_LayoutInflater_2Landroid_content_Context_2__V(MJIEnv env, int objRef, int rLayoutInflater, int rContext){}
	
	
	@MJI
	public static int createView__Ljava_lang_String_2Ljava_lang_String_2Landroid_util_AttributeSet_2__Landroid_view_View_2(MJIEnv env, int objRef, int rName, int rPrefix, int rAttrs){
		int rView=env.newObject("android.view.View");
		return rView;
	}
	
	@MJI
	public static int from__Landroid_content_Context_2__Landroid_view_LayoutInflater_2(MJIEnv env, int objRef, int rContext){
		int rInflater=env.newObject("android.view.LayoutInflater");
		return rInflater;
	}
	
	@MJI
	public static int getContext____Landroid_content_Context_2(MJIEnv env, int objRef){
		int rContext=env.newObject("android.content.Context");
		return rContext;
	}
	
	/*@MJI
	public static int getFactory____Landroid_view_LayoutInflater_Factory_2(MJIEnv env, int objRef){
		int rFactory=env.newObject("android.view.LayoutInflater.Factory");
		return rFactory;
	}
	@MJI
	public static int getFactory2____Landroid_view_LayoutInflater_Factory2_2(MJIEnv env, int objRef){
		int rFactory=env.newObject("android.view.LayoutInflater.Factory2");
		return rFactory;
	}
	
	@MJI
	public static void setFactory__Landroid_view_LayoutInflater_Factory_2__V(MJIEnv env, int objRef, int rFactory){}
	@MJI
	public static void setFactory2__Landroid_view_LayoutInflater_Factory2_2__V(MJIEnv env, int objRef, int rFactory2){}
	
	@MJI
	public static int getFilter____Landroid_view_LayoutInflater_Filter_2(MJIEnv env, int objRef){
		int rFilter=env.newObject("android.view.LayoutInflager.Filter");
		return rFilter;
	}
	
	@MJI
	public static void setFilter__Landroid_view_LayoutInflater_Filter_2(MJIEnv env, int objRef, int rFilter){}*/
	
	@MJI 
	public static int inflate__ILandroid_view_ViewGroup_2__Landroid_view_View_2(MJIEnv env, int objRef, int rRes, int rRoot){
		int rView=env.newObject("android.view.View");
		return rView;
	}
	
	@MJI
	public static int inflate__ILandroid_view_ViewGroup_2Z__Landroid_view_View_2(MJIEnv env, int objRef, int rRes, int rRoot, Boolean rAttach){
		int rView=env.newObject("android.view.View");
		return rView;
	}
}
