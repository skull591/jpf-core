package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_preference_PreferenceManager extends NativePeer{
	  @MJI
  public static void init__Landroid_content_Context_2__V (MJIEnv env, int objRef, int rContext0) {
  }
	  @MJI
  public static int getContext____Landroid_content_Context_2 (MJIEnv env, int objRef) {
    int rContext = MJIEnv.NULL;
    return rContext;
  }
	  @MJI
  public static int queryIntentActivities__Landroid_content_Intent_2__Ljava_util_List_2 (MJIEnv env, int objRef, int rIntent0) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int inflateFromIntent__Landroid_content_Intent_2Landroid_preference_PreferenceScreen_2__Landroid_preference_PreferenceScreen_2 (MJIEnv env, int objRef, int rIntent0, int rPreferenceScreen1) {
    int rPreferenceScreen = MJIEnv.NULL;
    return rPreferenceScreen;
  }
	  @MJI
  public static int inflateFromResource__Landroid_content_Context_2ILandroid_preference_PreferenceScreen_2__Landroid_preference_PreferenceScreen_2 (MJIEnv env, int objRef, int rContext0, int v1, int rPreferenceScreen2) {
    int rPreferenceScreen = MJIEnv.NULL;
    return rPreferenceScreen;
  }
	  @MJI
  public static int createPreferenceScreen__Landroid_content_Context_2__Landroid_preference_PreferenceScreen_2 (MJIEnv env, int objRef, int rContext0) {
    int rPreferenceScreen = MJIEnv.NULL;
    return rPreferenceScreen;
  }
	  @MJI
  public static long getNextId____J (MJIEnv env, int objRef) {
    long v = (long)0;
    return v;
  }
	  @MJI
  public static int getSharedPreferencesName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static void setSharedPreferencesName__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static int getSharedPreferencesMode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setSharedPreferencesMode__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getSharedPreferences____Landroid_content_SharedPreferences_2 (MJIEnv env, int objRef) {
    return env.newObject("android.content.SharedPreferences");
  }
	  @MJI
  public static int getDefaultSharedPreferences__Landroid_content_Context_2__Landroid_content_SharedPreferences_2 (MJIEnv env, int clsObjRef, int rContext0) {
	  return env.newObject("android.content.SharedPreferences");
  }
	  @MJI
  public static int getDefaultSharedPreferencesName__Landroid_content_Context_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int rContext0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getDefaultSharedPreferencesMode____I (MJIEnv env, int clsObjRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getPreferenceScreen____Landroid_preference_PreferenceScreen_2 (MJIEnv env, int objRef) {
    int rPreferenceScreen = MJIEnv.NULL;
    return rPreferenceScreen;
  }
	  @MJI
  public static boolean setPreferences__Landroid_preference_PreferenceScreen_2__Z (MJIEnv env, int objRef, int rPreferenceScreen0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int findPreference__Ljava_lang_CharSequence_2__Landroid_preference_Preference_2 (MJIEnv env, int objRef, int rCharSequence0) {
    int rPreference = MJIEnv.NULL;
    return rPreference;
  }
	  @MJI
  public static void setDefaultValues__Landroid_content_Context_2Ljava_lang_String_2IIZ__V (MJIEnv env, int clsObjRef, int rContext0, int rString1, int v2, int v3, boolean v4) {
  }
	  @MJI
  public static void setDefaultValues__Landroid_content_Context_2IZ__V (MJIEnv env, int clsObjRef, int rContext0, int v1, boolean v2) {
  }
	  @MJI
  public static int getEditor____Landroid_content_SharedPreferences$Editor_2 (MJIEnv env, int objRef) {
    int rSharedPreferences$Editor = MJIEnv.NULL;
    return rSharedPreferences$Editor;
  }
	  @MJI
  public static boolean shouldCommit____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void setNoCommit__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
	  @MJI
  public static int getActivity____Landroid_app_Activity_2 (MJIEnv env, int objRef) {
    int rActivity = MJIEnv.NULL;
    return rActivity;
  }
	  @MJI
  public static void registerOnActivityResultListener__Landroid_preference_PreferenceManager$OnActivityResultListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnActivityResultListener0) {
  }
	  @MJI
  public static void unregisterOnActivityResultListener__Landroid_preference_PreferenceManager$OnActivityResultListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnActivityResultListener0) {
  }
	  @MJI
  public static void dispatchActivityResult__IILandroid_content_Intent_2__V (MJIEnv env, int objRef, int v0, int v1, int rIntent2) {
  }
	  @MJI
  public static void registerOnActivityStopListener__Landroid_preference_PreferenceManager$OnActivityStopListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnActivityStopListener0) {
  }
	  @MJI
  public static void unregisterOnActivityStopListener__Landroid_preference_PreferenceManager$OnActivityStopListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnActivityStopListener0) {
  }
	  @MJI
  public static void dispatchActivityStop____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void registerOnActivityDestroyListener__Landroid_preference_PreferenceManager$OnActivityDestroyListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnActivityDestroyListener0) {
  }
	  @MJI
  public static void unregisterOnActivityDestroyListener__Landroid_preference_PreferenceManager$OnActivityDestroyListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnActivityDestroyListener0) {
  }
	  @MJI
  public static void dispatchActivityDestroy____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int getNextRequestCode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void addPreferencesScreen__Landroid_content_DialogInterface_2__V (MJIEnv env, int objRef, int rDialogInterface0) {
  }
	  @MJI
  public static void removePreferencesScreen__Landroid_content_DialogInterface_2__V (MJIEnv env, int objRef, int rDialogInterface0) {
  }
	  @MJI
  public static void dispatchNewIntent__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
  }
	  @MJI
  public static void dismissAllScreens____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void setOnPreferenceTreeClickListener__Landroid_preference_PreferenceManager$OnPreferenceTreeClickListener_2__V (MJIEnv env, int objRef, int rPreferenceManager$OnPreferenceTreeClickListener0) {
  }
	  @MJI
  public static int getOnPreferenceTreeClickListener____Landroid_preference_PreferenceManager$OnPreferenceTreeClickListener_2 (MJIEnv env, int objRef) {
    int rPreferenceManager$OnPreferenceTreeClickListener = MJIEnv.NULL;
    return rPreferenceManager$OnPreferenceTreeClickListener;
  }
}  
