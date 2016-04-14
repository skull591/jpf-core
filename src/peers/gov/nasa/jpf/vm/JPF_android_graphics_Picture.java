package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_graphics_Picture extends NativePeer{
	  @MJI
  public static void $clinit (MJIEnv env, int clsObjRef) {
  }
	  @MJI
  public static void $init____V(MJIEnv env, int objRef){
	  
  }
	  @MJI
  public static void finalize____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int beginRecording__II__Landroid_graphics_Canvas_2 (MJIEnv env, int objRef, int v0, int v1) {
    int rCanvas = MJIEnv.NULL;
    return rCanvas;
  }
	  @MJI
  public static int ni____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void endRecording____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int getWidth____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void draw__Landroid_graphics_Canvas_2__V (MJIEnv env, int objRef, int rCanvas0) {
  }
	  @MJI
  public static int createFromStream__Ljava_io_InputStream_2__Landroid_graphics_Picture_2 (MJIEnv env, int clsObjRef, int rInputStream0) {
    int rPicture = MJIEnv.NULL;
    return rPicture;
  }
	  @MJI
  public static void writeToStream__Ljava_io_OutputStream_2__V (MJIEnv env, int objRef, int rOutputStream0) {
  }
	  @MJI
  public static int nativeConstructor__I__I (MJIEnv env, int clsObjRef, int v0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int nativeCreateFromStream__Ljava_io_InputStream_2_3B__I (MJIEnv env, int clsObjRef, int rInputStream0, int rB1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int nativeBeginRecording__III__I (MJIEnv env, int clsObjRef, int v0, int v1, int v2) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void nativeEndRecording__I__V (MJIEnv env, int clsObjRef, int v0) {
  }
	  @MJI
  public static void nativeDraw__II__V (MJIEnv env, int clsObjRef, int v0, int v1) {
  }
	  @MJI
  public static boolean nativeWriteToStream__ILjava_io_OutputStream_2_3B__Z (MJIEnv env, int clsObjRef, int v0, int rOutputStream1, int rB2) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void nativeDestructor__I__V (MJIEnv env, int clsObjRef, int v0) {
  }
}
