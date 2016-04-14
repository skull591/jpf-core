package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_res_Resources extends NativePeer{
	  @MJI
	public static int getIdentifier__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__I(MJIEnv env, int objRef, int str1, int str2, int str3){
		return 0;
	}
	  @MJI
	public static int getDrawable__I__Landroid_graphics_drawable_Drawable_2(MJIEnv env, int objRef, int id){
		return env.newObject("android.graphics.drawable.Drawable");
	}
	  @MJI
	public static int getString__I__Ljava_lang_String_2(MJIEnv env, int objRef, int id){
		return env.newString("resource");
	}
	  @MJI
	public static int openRawResource__I__Ljava_io_InputStream_2(MJIEnv env, int objRef, int id){
		return env.newObject("java.io.InputStream");
	}
	  @MJI
	public static int getDisplayMetrics____Landroid_util_DisplayMetrics_2(MJIEnv env, int objRef){
		return env.newObject("android.util.DisplayMetrics");
	}
	  @MJI
	public static int getColor__I__I(MJIEnv env, int objRef, int id){
		return id;
	}
	  @MJI
	public static int getConfiguration____Landroid_content_res_Configuration_2 (MJIEnv env, int objRef){
		return env.newObject("android.content.res.Configuration");
	}
}