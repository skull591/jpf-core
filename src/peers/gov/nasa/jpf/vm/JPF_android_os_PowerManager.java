package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_os_PowerManager extends NativePeer{
	  @MJI
	public static void $init____V(MJIEnv env, int objref){
	}
	  @MJI
  public static int newWakeLock__ILjava_lang_String_2__Landroid_os_PowerManager$WakeLock_2 (MJIEnv env, int objRef, int v0, int rString1) {
	  int rPowerManager$WakeLock = env.newObject("android.os.PowerManager$WakeLock");
    return rPowerManager$WakeLock;
  }
	  @MJI
  public static void userActivity__JZ__V (MJIEnv env, int objRef, long v0, boolean v1) {
  }
	  @MJI
  public static void goToSleep__J__V (MJIEnv env, int objRef, long v0) {
  }
	  @MJI
  public static void setBacklightBrightness__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getSupportedWakeLockFlags____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static boolean isScreenOn____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void reboot__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
}  
