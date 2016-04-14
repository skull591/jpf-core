package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_os_Environment extends NativePeer{
  @MJI
  public static void $clinit (MJIEnv env, int clsObjRef) {
  }
  @MJI
  public static int getRootDirectory____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getSystemSecureDirectory____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getSecureDataDirectory____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static boolean isEncryptedFilesystemEnabled____Z (MJIEnv env, int clsObjRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getDataDirectory____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageDirectory____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = env.newObject("java.io.File");
    return rFile;
  }
  @MJI
  public static int getExternalStoragePublicDirectory__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageAndroidDataDir____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageAppDataDirectory__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageAppMediaDirectory__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageAppFilesDirectory__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageAppCacheDirectory__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getDownloadCacheDirectory____Ljava_io_File_2 (MJIEnv env, int clsObjRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalStorageState____Ljava_lang_String_2 (MJIEnv env, int clsObjRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static boolean isExternalStorageRemovable____Z (MJIEnv env, int clsObjRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getDirectory__Ljava_lang_String_2Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int clsObjRef, int rString0, int rString1) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
} 
