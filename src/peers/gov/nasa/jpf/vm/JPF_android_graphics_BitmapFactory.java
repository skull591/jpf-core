package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_graphics_BitmapFactory extends NativePeer{
	  @MJI
	public static int decodeStream__Ljava_io_InputStream_2__Landroid_graphics_Bitmap_2(MJIEnv env, int objRef, int inputStreamRef){
		int ret = env.newObject("android.graphics.Bitmap");
		return ret;
	}
	  @MJI
	public static int decodeStream__Ljava_io_InputStream_2Landroid_graphics_Rect_2Landroid_graphics_BitmapFactory$Options_2__Landroid_graphics_Bitmap_2(MJIEnv env, int objRef, int inputStreamRef, int rectRef, int optRef){
		int ret = env.newObject("android.graphics.Bitmap");
		return ret;
	}

}
