package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_os_SystemClock extends NativePeer{
	  @MJI
  public static void sleep__J__V (MJIEnv env, int clsObjRef, long v0) {
  }
	  @MJI
  public static boolean setCurrentTimeMillis__J__Z (MJIEnv env, int clsObjRef, long v0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static long uptimeMillis____J (MJIEnv env, int clsObjRef) {
    long v = (long)0;
    return v;
  }
	  @MJI
  public static long elapsedRealtime____J (MJIEnv env, int clsObjRef) {
    long v = (long)0;
    return v;
  }
	  @MJI
  public static long currentThreadTimeMillis____J (MJIEnv env, int clsObjRef) {
    long v = (long)0;
    return v;
  }
}
