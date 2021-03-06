package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_Context extends NativePeer{
	  @MJI
	public static void $init____V(MJIEnv env, int objref){
		//System.out.println("### @Context constructor");
	}
	  @MJI
  public static int checkPermission__Ljava_lang_String_2II__I (MJIEnv env, int objRef, int rString0, int v1, int v2) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getClassLoader____Ljava_lang_ClassLoader_2 (MJIEnv env, int objRef) {
    int rClassLoader = MJIEnv.NULL;
    return rClassLoader;
  }
	  @MJI
  public static int getResources____Landroid_content_res_Resources_2 (MJIEnv env, int objRef) {
    int rResources = MJIEnv.NULL;
    return rResources;
  }
	  @MJI
  public static int getString__I__Ljava_lang_String_2 (MJIEnv env, int objRef, int v0) {
		 // System.out.println("need String!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    int rString = env.newString("");
    return rString;
  }
	  @MJI
  public static int getString__I_3Ljava_lang_Object_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int v0, int rObject1) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getPackageName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getAssets____Landroid_content_res_AssetManager_2 (MJIEnv env, int objRef) {
    int rAssetManager = MJIEnv.NULL;
    return rAssetManager;
  }
	  @MJI
  public static int getPackageManager____Landroid_content_pm_PackageManager_2 (MJIEnv env, int objRef) {
    int rPackageManager = MJIEnv.NULL;
    return rPackageManager;
  }
	  @MJI
  public static int getContentResolver____Landroid_content_ContentResolver_2 (MJIEnv env, int objRef) {
    int rContentResolver = MJIEnv.NULL;
    return rContentResolver;
  }
	  @MJI
  public static int getMainLooper____Landroid_os_Looper_2 (MJIEnv env, int objRef) {
    int rLooper = MJIEnv.NULL;
    return rLooper;
  }
  @MJI  
  public static int getApplicationContext____Landroid_content_Context_2 (MJIEnv env, int objRef) {
    int rContext = MJIEnv.NULL;
    return rContext;
  }
  @MJI
  public static int getText__I__Ljava_lang_CharSequence_2 (MJIEnv env, int objRef, int v0) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
  @MJI
  public static void setTheme__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static int getTheme____Landroid_content_res_Resources$Theme_2 (MJIEnv env, int objRef) {
    int rResources$Theme = MJIEnv.NULL;
    return rResources$Theme;
  }
  @MJI
  public static int obtainStyledAttributes__I_3I__Landroid_content_res_TypedArray_2 (MJIEnv env, int objRef, int v0, int rI1) {
    int rTypedArray = MJIEnv.NULL;
    return rTypedArray;
  }
  @MJI
  public static int obtainStyledAttributes___3I__Landroid_content_res_TypedArray_2 (MJIEnv env, int objRef, int rI0) {
    int rTypedArray = MJIEnv.NULL;
    return rTypedArray;
  }
  @MJI
  public static int obtainStyledAttributes__Landroid_util_AttributeSet_2_3I__Landroid_content_res_TypedArray_2 (MJIEnv env, int objRef, int rAttributeSet0, int rI1) {
    int rTypedArray = MJIEnv.NULL;
    return rTypedArray;
  }
  @MJI
  public static int obtainStyledAttributes__Landroid_util_AttributeSet_2_3III__Landroid_content_res_TypedArray_2 (MJIEnv env, int objRef, int rAttributeSet0, int rI1, int v2, int v3) {
    int rTypedArray = MJIEnv.NULL;
    return rTypedArray;
  }
  @MJI
  public static int getApplicationInfo____Landroid_content_pm_ApplicationInfo_2 (MJIEnv env, int objRef) {
    int rApplicationInfo = env.newObject("android.content.pm.ApplicationInfo");
    return rApplicationInfo;
  }
  @MJI
  public static int getPackageResourcePath____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static int getPackageCodePath____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static int getSharedPreferences__Ljava_lang_String_2I__Landroid_content_SharedPreferences_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rSharedPreferences = MJIEnv.NULL;
    return rSharedPreferences;
  }
  @MJI
  public static int openFileInput__Ljava_lang_String_2__Ljava_io_FileInputStream_2 (MJIEnv env, int objRef, int rString0) {
    int rFileInputStream = MJIEnv.NULL;
    return rFileInputStream;
  }
  @MJI
  public static int openFileOutput__Ljava_lang_String_2I__Ljava_io_FileOutputStream_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rFileOutputStream = MJIEnv.NULL;
    return rFileOutputStream;
  }
  @MJI  
  public static boolean deleteFile__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getFileStreamPath__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int objRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getFilesDir____Ljava_io_File_2 (MJIEnv env, int objRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalFilesDir__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int objRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getCacheDir____Ljava_io_File_2 (MJIEnv env, int objRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int getExternalCacheDir____Ljava_io_File_2 (MJIEnv env, int objRef) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI  
  public static int fileList_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static int getDir__Ljava_lang_String_2I__Ljava_io_File_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int openOrCreateDatabase__Ljava_lang_String_2ILandroid_database_sqlite_SQLiteDatabase$CursorFactory_2__Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int objRef, int rString0, int v1, int rSQLiteDatabase$CursorFactory2) {
    int rSQLiteDatabase = MJIEnv.NULL;
    return rSQLiteDatabase;
  }
  @MJI
  public static boolean deleteDatabase__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getDatabasePath__Ljava_lang_String_2__Ljava_io_File_2 (MJIEnv env, int objRef, int rString0) {
    int rFile = MJIEnv.NULL;
    return rFile;
  }
  @MJI
  public static int databaseList_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static int getWallpaper____Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
  @MJI
  public static int peekWallpaper____Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
  @MJI
  public static int getWallpaperDesiredMinimumWidth____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int getWallpaperDesiredMinimumHeight____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setWallpaper__Ljava_io_InputStream_2__V (MJIEnv env, int objRef, int rInputStream0) {
  }
  @MJI
  public static void setWallpaper__Landroid_graphics_Bitmap_2__V (MJIEnv env, int objRef, int rBitmap0) {
  }
  @MJI
  public static void clearWallpaper____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void startActivity__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
  }
  @MJI
  public static void startIntentSender__Landroid_content_IntentSender_2Landroid_content_Intent_2III__V (MJIEnv env, int objRef, int rIntentSender0, int rIntent1, int v2, int v3, int v4) {
  }
  @MJI
  public static void sendBroadcast__Landroid_content_Intent_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rIntent0, int rString1) {
  }
  @MJI
  public static void sendBroadcast__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
  }
  @MJI
  public static void sendOrderedBroadcast__Landroid_content_Intent_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rIntent0, int rString1) {
  }
  @MJI
  public static void sendOrderedBroadcast__Landroid_content_Intent_2Ljava_lang_String_2Landroid_content_BroadcastReceiver_2Landroid_os_Handler_2ILjava_lang_String_2Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rIntent0, int rString1, int rBroadcastReceiver2, int rHandler3, int v4, int rString5, int rBundle6) {
  }
  @MJI
  public static void sendStickyBroadcast__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
  }
  @MJI
  public static void sendStickyOrderedBroadcast__Landroid_content_Intent_2Landroid_content_BroadcastReceiver_2Landroid_os_Handler_2ILjava_lang_String_2Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rIntent0, int rBroadcastReceiver1, int rHandler2, int v3, int rString4, int rBundle5) {
  }
  @MJI
  public static void removeStickyBroadcast__Landroid_content_Intent_2__V (MJIEnv env, int objRef, int rIntent0) {
  }
  @MJI
  public static int registerReceiver__Landroid_content_BroadcastReceiver_2Landroid_content_IntentFilter_2Ljava_lang_String_2Landroid_os_Handler_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rBroadcastReceiver0, int rIntentFilter1, int rString2, int rHandler3) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
  @MJI
  public static int registerReceiver__Landroid_content_BroadcastReceiver_2Landroid_content_IntentFilter_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rBroadcastReceiver0, int rIntentFilter1) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
  @MJI
  public static void unregisterReceiver__Landroid_content_BroadcastReceiver_2__V (MJIEnv env, int objRef, int rBroadcastReceiver0) {
  }
  @MJI
  public static int startService__Landroid_content_Intent_2__Landroid_content_ComponentName_2 (MJIEnv env, int objRef, int rIntent0) {
    int rComponentName = MJIEnv.NULL;
    return rComponentName;
  }
  @MJI
  public static boolean stopService__Landroid_content_Intent_2__Z (MJIEnv env, int objRef, int rIntent0) {
    boolean v = false;
    return v;
  }
@MJI  
  public static boolean bindService__Landroid_content_Intent_2Landroid_content_ServiceConnection_2I__Z (MJIEnv env, int objRef, int rIntent0, int rServiceConnection1, int v2) {
    boolean v = false;
    return v;
  }
@MJI
  public static void unbindService__Landroid_content_ServiceConnection_2__V (MJIEnv env, int objRef, int rServiceConnection0) {
  }
@MJI
  public static boolean startInstrumentation__Landroid_content_ComponentName_2Ljava_lang_String_2Landroid_os_Bundle_2__Z (MJIEnv env, int objRef, int rComponentName0, int rString1, int rBundle2) {
    boolean v = false;
    return v;
  }
@MJI
  public static int getSystemService__Ljava_lang_String_2__Ljava_lang_Object_2 (MJIEnv env, int objRef, int rString0) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
  @MJI
  public static int checkCallingPermission__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
    int v = (int)0;
    return v;
  }
  @MJI 
  public static int checkCallingOrSelfPermission__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
	//System.out.println("Permission!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    int v = (int)0;
    return v;
  }
  @MJI
  public static void enforcePermission__Ljava_lang_String_2IILjava_lang_String_2__V (MJIEnv env, int objRef, int rString0, int v1, int v2, int rString3) {
  }
  @MJI
  public static void enforceCallingPermission__Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0, int rString1) {
  }
  @MJI
  public static void enforceCallingOrSelfPermission__Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0, int rString1) {
  }
  @MJI
  public static void grantUriPermission__Ljava_lang_String_2Landroid_net_Uri_2I__V (MJIEnv env, int objRef, int rString0, int rUri1, int v2) {
  }
  @MJI
  public static void revokeUriPermission__Landroid_net_Uri_2I__V (MJIEnv env, int objRef, int rUri0, int v1) {
  }
  @MJI
  public static int checkUriPermission__Landroid_net_Uri_2Ljava_lang_String_2Ljava_lang_String_2III__I (MJIEnv env, int objRef, int rUri0, int rString1, int rString2, int v3, int v4, int v5) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int checkUriPermission__Landroid_net_Uri_2III__I (MJIEnv env, int objRef, int rUri0, int v1, int v2, int v3) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int checkCallingUriPermission__Landroid_net_Uri_2I__I (MJIEnv env, int objRef, int rUri0, int v1) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static int checkCallingOrSelfUriPermission__Landroid_net_Uri_2I__I (MJIEnv env, int objRef, int rUri0, int v1) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void enforceUriPermission__Landroid_net_Uri_2Ljava_lang_String_2Ljava_lang_String_2IIILjava_lang_String_2__V (MJIEnv env, int objRef, int rUri0, int rString1, int rString2, int v3, int v4, int v5, int rString6) {
  }
  @MJI
  public static void enforceUriPermission__Landroid_net_Uri_2IIILjava_lang_String_2__V (MJIEnv env, int objRef, int rUri0, int v1, int v2, int v3, int rString4) {
  }
  @MJI
  public static void enforceCallingUriPermission__Landroid_net_Uri_2ILjava_lang_String_2__V (MJIEnv env, int objRef, int rUri0, int v1, int rString2) {
  }
  @MJI
  public static void enforceCallingOrSelfUriPermission__Landroid_net_Uri_2ILjava_lang_String_2__V (MJIEnv env, int objRef, int rUri0, int v1, int rString2) {
  }
  @MJI
  public static int createPackageContext__Ljava_lang_String_2I__Landroid_content_Context_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rContext = MJIEnv.NULL;
    return rContext;
  }
  @MJI
  public static int createConfigurationContext__Landroid_content_res_Configuration_2__Landroid_content_Context_2 (MJIEnv env, int objRef, int con){
	  int rContext = MJIEnv.NULL;
	  return rContext;
  }
  @MJI
  public static int createDisplayContext__Landroid_view_Display_2__Landroid_content_Context_2(MJIEnv env, int objRef, int dis){
	  int rContext = MJIEnv.NULL;
	  return rContext;
  }
  @MJI
  public static boolean isRestricted____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
}
