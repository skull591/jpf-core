package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_widget_Button extends NativePeer{
	@MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int contextRef){
//		System.out.println("[constru] constructor");
	}
	
	@MJI
	public static void $init__Landroid_content_Context_2Landroid_util_AttributeSet_2__V(MJIEnv env, int objRef, int contextRef, int attriRef){
		System.out.println("@Button constructor 2");
	}
	
	@MJI
	public static void $init__Landroid_content_Context_2Landroid_util_AttributeSet_2I__V(MJIEnv env, int objRef, int contextRef, int attriRef, int defStyle){
		System.out.println("@Button constructor 3");
	}
	
}
