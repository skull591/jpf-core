package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_SharedPreferences extends NativePeer{
	  @MJI
  public static boolean getBoolean__Ljava_lang_String_2Z__Z (MJIEnv env, int objRef, int rString0, boolean v1) {
    boolean v = true;
    return v;
  }
	  @MJI
  public static int getInt__Ljava_lang_String_2I__I (MJIEnv env, int objRef, int rString0, int v1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static long getLong__Ljava_lang_String_2J__J (MJIEnv env, int objRef, int rString0, long v1) {
    long v = (long)0;
    return v;
  }
	  @MJI
  public static float getFloat__Ljava_lang_String_2F__F (MJIEnv env, int objRef, int rString0, float v1) {
    float v = (float)0;
    return v;
  }
	  @MJI
  public static boolean contains__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int getString__Ljava_lang_String_2Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0, int rString1) {
    int rString = env.newString("1");
    return rString;
  }
	  @MJI
  public static int getAll____Ljava_util_Map_2 (MJIEnv env, int objRef) {
    int rMap = MJIEnv.NULL;
    return rMap;
  }
	  @MJI
  public static int edit____Landroid_content_SharedPreferences$Editor_2 (MJIEnv env, int objRef) {
	  return env.newObject("android.content.SharedPreferences$Editor");
  }
	  @MJI
  public static void registerOnSharedPreferenceChangeListener__Landroid_content_SharedPreferences$OnSharedPreferenceChangeListener_2__V (MJIEnv env, int objRef, int rSharedPreferences$OnSharedPreferenceChangeListener0) {
  }
	  @MJI
  public static void unregisterOnSharedPreferenceChangeListener__Landroid_content_SharedPreferences$OnSharedPreferenceChangeListener_2__V (MJIEnv env, int objRef, int rSharedPreferences$OnSharedPreferenceChangeListener0) {
  }
} 
