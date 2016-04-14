package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_pm_PackageManager extends NativePeer{
	  @MJI
  public static int checkPermission__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0, int rString1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getPackageInfo__Ljava_lang_String_2I__Landroid_content_pm_PackageInfo_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rPackageInfo = MJIEnv.NULL;
    return rPackageInfo;
  }
	  @MJI
  public static int currentToCanonicalPackageNames___3Ljava_lang_String_2___3Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int canonicalToCurrentPackageNames___3Ljava_lang_String_2___3Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getLaunchIntentForPackage__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	  @MJI
  public static int getPackageGids__Ljava_lang_String_2___3I (MJIEnv env, int objRef, int rString0) {
    int r = MJIEnv.NULL;
    return r;
  }
	  @MJI
  public static int getPermissionInfo__Ljava_lang_String_2I__Landroid_content_pm_PermissionInfo_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rPermissionInfo = MJIEnv.NULL;
    return rPermissionInfo;
  }
	  @MJI
  public static int queryPermissionsByGroup__Ljava_lang_String_2I__Ljava_util_List_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int getPermissionGroupInfo__Ljava_lang_String_2I__Landroid_content_pm_PermissionGroupInfo_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rPermissionGroupInfo = MJIEnv.NULL;
    return rPermissionGroupInfo;
  }
	  @MJI
  public static int getAllPermissionGroups__I__Ljava_util_List_2 (MJIEnv env, int objRef, int v0) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int getApplicationInfo__Ljava_lang_String_2I__Landroid_content_pm_ApplicationInfo_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rApplicationInfo = MJIEnv.NULL;
    return rApplicationInfo;
  }
	  @MJI
  public static int getActivityInfo__Landroid_content_ComponentName_2I__Landroid_content_pm_ActivityInfo_2 (MJIEnv env, int objRef, int rComponentName0, int v1) {
    int rActivityInfo = MJIEnv.NULL;
    return rActivityInfo;
  }
	  @MJI
  public static int getReceiverInfo__Landroid_content_ComponentName_2I__Landroid_content_pm_ActivityInfo_2 (MJIEnv env, int objRef, int rComponentName0, int v1) {
    int rActivityInfo = MJIEnv.NULL;
    return rActivityInfo;
  }
	  @MJI
  public static int getServiceInfo__Landroid_content_ComponentName_2I__Landroid_content_pm_ServiceInfo_2 (MJIEnv env, int objRef, int rComponentName0, int v1) {
    int rServiceInfo = MJIEnv.NULL;
    return rServiceInfo;
  }
	  @MJI
  public static int getProviderInfo__Landroid_content_ComponentName_2I__Landroid_content_pm_ProviderInfo_2 (MJIEnv env, int objRef, int rComponentName0, int v1) {
    int rProviderInfo = MJIEnv.NULL;
    return rProviderInfo;
  }
	  @MJI
  public static int getInstalledPackages__I__Ljava_util_List_2 (MJIEnv env, int objRef, int v0) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static boolean addPermission__Landroid_content_pm_PermissionInfo_2__Z (MJIEnv env, int objRef, int rPermissionInfo0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static boolean addPermissionAsync__Landroid_content_pm_PermissionInfo_2__Z (MJIEnv env, int objRef, int rPermissionInfo0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void removePermission__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static int checkSignatures__II__I (MJIEnv env, int objRef, int v0, int v1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int checkSignatures__Ljava_lang_String_2Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0, int rString1) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getPackagesForUid__I___3Ljava_lang_String_2 (MJIEnv env, int objRef, int v0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getNameForUid__I__Ljava_lang_String_2 (MJIEnv env, int objRef, int v0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getUidForSharedUser__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getInstalledApplications__I__Ljava_util_List_2 (MJIEnv env, int objRef, int v0) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int getSystemSharedLibraryNames_____3Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static int getSystemAvailableFeatures_____3Landroid_content_pm_FeatureInfo_2 (MJIEnv env, int objRef) {
    int rFeatureInfo = MJIEnv.NULL;
    return rFeatureInfo;
  }
	  @MJI
  public static boolean hasSystemFeature__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int resolveActivity__Landroid_content_Intent_2I__Landroid_content_pm_ResolveInfo_2 (MJIEnv env, int objRef, int rIntent0, int v1) {
    int rResolveInfo = MJIEnv.NULL;
    return rResolveInfo;
  }
	  @MJI
  public static int queryIntentActivities__Landroid_content_Intent_2I__Ljava_util_List_2 (MJIEnv env, int objRef, int rIntent0, int v1) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int queryIntentActivityOptions__Landroid_content_ComponentName_2_3Landroid_content_Intent_2Landroid_content_Intent_2I__Ljava_util_List_2 (MJIEnv env, int objRef, int rComponentName0, int rIntent1, int rIntent2, int v3) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int queryBroadcastReceivers__Landroid_content_Intent_2I__Ljava_util_List_2 (MJIEnv env, int objRef, int rIntent0, int v1) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int resolveService__Landroid_content_Intent_2I__Landroid_content_pm_ResolveInfo_2 (MJIEnv env, int objRef, int rIntent0, int v1) {
    int rResolveInfo = MJIEnv.NULL;
    return rResolveInfo;
  }
	  @MJI
  public static int queryIntentServices__Landroid_content_Intent_2I__Ljava_util_List_2 (MJIEnv env, int objRef, int rIntent0, int v1) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int resolveContentProvider__Ljava_lang_String_2I__Landroid_content_pm_ProviderInfo_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rProviderInfo = MJIEnv.NULL;
    return rProviderInfo;
  }
	  @MJI
  public static int queryContentProviders__Ljava_lang_String_2II__Ljava_util_List_2 (MJIEnv env, int objRef, int rString0, int v1, int v2) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int getInstrumentationInfo__Landroid_content_ComponentName_2I__Landroid_content_pm_InstrumentationInfo_2 (MJIEnv env, int objRef, int rComponentName0, int v1) {
    int rInstrumentationInfo = MJIEnv.NULL;
    return rInstrumentationInfo;
  }
	  @MJI
  public static int queryInstrumentation__Ljava_lang_String_2I__Ljava_util_List_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static int getDrawable__Ljava_lang_String_2ILandroid_content_pm_ApplicationInfo_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rString0, int v1, int rApplicationInfo2) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getActivityIcon__Landroid_content_Intent_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rIntent0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getActivityIcon__Landroid_content_ComponentName_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rComponentName0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getDefaultActivityIcon____Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getApplicationIcon__Ljava_lang_String_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rString0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getApplicationIcon__Landroid_content_pm_ApplicationInfo_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rApplicationInfo0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getActivityLogo__Landroid_content_Intent_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rIntent0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getActivityLogo__Landroid_content_ComponentName_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rComponentName0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getApplicationLogo__Landroid_content_pm_ApplicationInfo_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rApplicationInfo0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getApplicationLogo__Ljava_lang_String_2__Landroid_graphics_drawable_Drawable_2 (MJIEnv env, int objRef, int rString0) {
    int rDrawable = MJIEnv.NULL;
    return rDrawable;
  }
	  @MJI
  public static int getText__Ljava_lang_String_2ILandroid_content_pm_ApplicationInfo_2__Ljava_lang_CharSequence_2 (MJIEnv env, int objRef, int rString0, int v1, int rApplicationInfo2) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
	  @MJI
  public static int getXml__Ljava_lang_String_2ILandroid_content_pm_ApplicationInfo_2__Landroid_content_res_XmlResourceParser_2 (MJIEnv env, int objRef, int rString0, int v1, int rApplicationInfo2) {
    int rXmlResourceParser = MJIEnv.NULL;
    return rXmlResourceParser;
  }
	  @MJI
  public static int getApplicationLabel__Landroid_content_pm_ApplicationInfo_2__Ljava_lang_CharSequence_2 (MJIEnv env, int objRef, int rApplicationInfo0) {
    int rCharSequence = MJIEnv.NULL;
    return rCharSequence;
  }
	  @MJI
  public static int getResourcesForActivity__Landroid_content_ComponentName_2__Landroid_content_res_Resources_2 (MJIEnv env, int objRef, int rComponentName0) {
    int rResources = MJIEnv.NULL;
    return rResources;
  }
	  @MJI
  public static int getResourcesForApplication__Landroid_content_pm_ApplicationInfo_2__Landroid_content_res_Resources_2 (MJIEnv env, int objRef, int rApplicationInfo0) {
    int rResources = MJIEnv.NULL;
    return rResources;
  }
	  @MJI
  public static int getResourcesForApplication__Ljava_lang_String_2__Landroid_content_res_Resources_2 (MJIEnv env, int objRef, int rString0) {
    int rResources = MJIEnv.NULL;
    return rResources;
  }
	  @MJI
  public static int getPackageArchiveInfo__Ljava_lang_String_2I__Landroid_content_pm_PackageInfo_2 (MJIEnv env, int objRef, int rString0, int v1) {
    int rPackageInfo = MJIEnv.NULL;
    return rPackageInfo;
  }
	  @MJI
  public static void installPackage__Landroid_net_Uri_2Landroid_content_pm_IPackageInstallObserver_2ILjava_lang_String_2__V (MJIEnv env, int objRef, int rUri0, int rIPackageInstallObserver1, int v2, int rString3) {
  }
	  @MJI
  public static void deletePackage__Ljava_lang_String_2Landroid_content_pm_IPackageDeleteObserver_2I__V (MJIEnv env, int objRef, int rString0, int rIPackageDeleteObserver1, int v2) {
  }
	  @MJI
  public static int getInstallerPackageName__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	  @MJI
  public static void clearApplicationUserData__Ljava_lang_String_2Landroid_content_pm_IPackageDataObserver_2__V (MJIEnv env, int objRef, int rString0, int rIPackageDataObserver1) {
  }
	  @MJI
  public static void deleteApplicationCacheFiles__Ljava_lang_String_2Landroid_content_pm_IPackageDataObserver_2__V (MJIEnv env, int objRef, int rString0, int rIPackageDataObserver1) {
  }
	  @MJI
  public static void freeStorageAndNotify__JLandroid_content_pm_IPackageDataObserver_2__V (MJIEnv env, int objRef, long v0, int rIPackageDataObserver1) {
  }
	  @MJI
  public static void freeStorage__JLandroid_content_IntentSender_2__V (MJIEnv env, int objRef, long v0, int rIntentSender1) {
  }
	  @MJI
  public static void getPackageSizeInfo__Ljava_lang_String_2Landroid_content_pm_IPackageStatsObserver_2__V (MJIEnv env, int objRef, int rString0, int rIPackageStatsObserver1) {
  }
	  @MJI
  public static void addPackageToPreferred__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static void removePackageFromPreferred__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static int getPreferredPackages__I__Ljava_util_List_2 (MJIEnv env, int objRef, int v0) {
    int rList = MJIEnv.NULL;
    return rList;
  }
	  @MJI
  public static void addPreferredActivity__Landroid_content_IntentFilter_2I_3Landroid_content_ComponentName_2Landroid_content_ComponentName_2__V (MJIEnv env, int objRef, int rIntentFilter0, int v1, int rComponentName2, int rComponentName3) {
  }
	  @MJI
  public static void replacePreferredActivity__Landroid_content_IntentFilter_2I_3Landroid_content_ComponentName_2Landroid_content_ComponentName_2__V (MJIEnv env, int objRef, int rIntentFilter0, int v1, int rComponentName2, int rComponentName3) {
  }
	  @MJI
  public static void clearPackagePreferredActivities__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	  @MJI
  public static int getPreferredActivities__Ljava_util_List_2Ljava_util_List_2Ljava_lang_String_2__I (MJIEnv env, int objRef, int rList0, int rList1, int rString2) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setComponentEnabledSetting__Landroid_content_ComponentName_2II__V (MJIEnv env, int objRef, int rComponentName0, int v1, int v2) {
  }
	  @MJI
  public static int getComponentEnabledSetting__Landroid_content_ComponentName_2__I (MJIEnv env, int objRef, int rComponentName0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setApplicationEnabledSetting__Ljava_lang_String_2II__V (MJIEnv env, int objRef, int rString0, int v1, int v2) {
  }
	  @MJI
  public static int getApplicationEnabledSetting__Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static boolean isSafeMode____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static void movePackage__Ljava_lang_String_2Landroid_content_pm_IPackageMoveObserver_2I__V (MJIEnv env, int objRef, int rString0, int rIPackageMoveObserver1, int v2) {
  }
} 
