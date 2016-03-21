package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_os_Binder extends NativePeer{

  @MJI
  public static void finalize____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void init____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void destroy____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int getCallingPid____I (MJIEnv env, int clsObjRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getCallingUid____I (MJIEnv env, int clsObjRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static long clearCallingIdentity____J (MJIEnv env, int clsObjRef) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static void restoreCallingIdentity__J__V (MJIEnv env, int clsObjRef, long v0) {
  }
  @MJI
  public static void setThreadStrictModePolicy__I__V (MJIEnv env, int clsObjRef, int v0) {
  }
  @MJI
  public static int getThreadStrictModePolicy____I (MJIEnv env, int clsObjRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void flushPendingCommands____V (MJIEnv env, int clsObjRef) {
  }
  @MJI
  public static void joinThreadPool____V (MJIEnv env, int clsObjRef) {
  }
  @MJI
  public static void attachInterface__Landroid_os_IInterface_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rIInterface0, int rString1) {
  }
  @MJI
  public static int getInterfaceDescriptor____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static boolean pingBinder____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean isBinderAlive____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int queryLocalInterface__Ljava_lang_String_2__Landroid_os_IInterface_2 (MJIEnv env, int objRef, int rString0) {
    int rIInterface = MJIEnv.NULL;
    return rIInterface;
  }
  @MJI
  public static boolean onTransact__ILandroid_os_Parcel_2Landroid_os_Parcel_2I__Z (MJIEnv env, int objRef, int v0, int rParcel1, int rParcel2, int v3) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void dump__Ljava_io_FileDescriptor_2_3Ljava_lang_String_2__V (MJIEnv env, int objRef, int rFileDescriptor0, int rString1) {
  }
  @MJI
  public static void dump__Ljava_io_FileDescriptor_2Ljava_io_PrintWriter_2_3Ljava_lang_String_2__V (MJIEnv env, int objRef, int rFileDescriptor0, int rPrintWriter1, int rString2) {
  }
  @MJI
  public static boolean transact__ILandroid_os_Parcel_2Landroid_os_Parcel_2I__Z (MJIEnv env, int objRef, int v0, int rParcel1, int rParcel2, int v3) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void linkToDeath__Landroid_os_IBinder$DeathRecipient_2I__V (MJIEnv env, int objRef, int rIBinder$DeathRecipient0, int v1) {
  }
  @MJI
  public static boolean unlinkToDeath__Landroid_os_IBinder$DeathRecipient_2I__Z (MJIEnv env, int objRef, int rIBinder$DeathRecipient0, int v1) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean execTransact__IJJI__Z (MJIEnv env, int objRef, int v0, int v1, int v2, int v3) {
    boolean v = false;
    return v;
  }
}
