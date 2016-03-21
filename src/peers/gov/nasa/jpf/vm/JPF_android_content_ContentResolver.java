package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_ContentResolver extends NativePeer{
		@MJI
	  public static int getType__Landroid_net_Uri_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rUri0) {
	    int rString = MJIEnv.NULL;
	    return rString;
	  }
		@MJI
	  public static int delete__Landroid_net_Uri_2Ljava_lang_String_2_3Ljava_lang_String_2__I (MJIEnv env, int objRef, int rUri0, int rString1, int rString2) {
	    int v = (int)0;
	    return v;
	  }
		@MJI
	  public static int insert__Landroid_net_Uri_2Landroid_content_ContentValues_2__Landroid_net_Uri_2 (MJIEnv env, int objRef, int rUri0, int rContentValues1) {
	    int rUri = MJIEnv.NULL;
	    return rUri;
	  }
		@MJI
	  public static int query__Landroid_net_Uri_2_3Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rUri0, int rString1, int rString2, int rString3, int rString4) {
		  int rCursor = env.newObject("android.database.Cursor");
	    return rCursor;
	  }
		@MJI
	  public static int update__Landroid_net_Uri_2Landroid_content_ContentValues_2Ljava_lang_String_2_3Ljava_lang_String_2__I (MJIEnv env, int objRef, int rUri0, int rContentValues1, int rString2, int rString3) {
	    int v = (int)0;
	    return v;
	  }
		@MJI
	  public static int acquireProvider__Ljava_lang_String_2__Landroid_content_IContentProvider_2 (MJIEnv env, int objRef, int rString0) {
	    int rIContentProvider = MJIEnv.NULL;
	    return rIContentProvider;
	  }
		@MJI
	  public static int acquireProvider__Landroid_content_Context_2Ljava_lang_String_2__Landroid_content_IContentProvider_2 (MJIEnv env, int objRef, int rContext0, int rString1) {
	    int rIContentProvider = MJIEnv.NULL;
	    return rIContentProvider;
	  }
		@MJI
	  public static int acquireProvider__Landroid_net_Uri_2__Landroid_content_IContentProvider_2 (MJIEnv env, int objRef, int rUri0) {
	    int rIContentProvider = MJIEnv.NULL;
	    return rIContentProvider;
	  }
		@MJI
	  public static int acquireExistingProvider__Landroid_content_Context_2Ljava_lang_String_2__Landroid_content_IContentProvider_2 (MJIEnv env, int objRef, int rContext0, int rString1) {
	    int rIContentProvider = MJIEnv.NULL;
	    return rIContentProvider;
	  }
		@MJI
	  public static int acquireExistingProvider__Landroid_net_Uri_2__Landroid_content_IContentProvider_2 (MJIEnv env, int objRef, int rUri0) {
	    int rIContentProvider = MJIEnv.NULL;
	    return rIContentProvider;
	  }
		@MJI
	  public static boolean releaseProvider__Landroid_content_IContentProvider_2__Z (MJIEnv env, int objRef, int rIContentProvider0) {
	    boolean v = false;
	    return v;
	  }
		@MJI
	  public static int openInputStream__Landroid_net_Uri_2__Ljava_io_InputStream_2 (MJIEnv env, int objRef, int rUri0) {
	    int rInputStream = MJIEnv.NULL;
	    return rInputStream;
	  }
		@MJI
	  public static int openOutputStream__Landroid_net_Uri_2__Ljava_io_OutputStream_2 (MJIEnv env, int objRef, int rUri0) {
	    int rOutputStream = MJIEnv.NULL;
	    return rOutputStream;
	  }
		@MJI
	  public static int openOutputStream__Landroid_net_Uri_2Ljava_lang_String_2__Ljava_io_OutputStream_2 (MJIEnv env, int objRef, int rUri0, int rString1) {
	    int rOutputStream = MJIEnv.NULL;
	    return rOutputStream;
	  }
		@MJI
	  public static int openFileDescriptor__Landroid_net_Uri_2Ljava_lang_String_2__Landroid_os_ParcelFileDescriptor_2 (MJIEnv env, int objRef, int rUri0, int rString1) {
	    int rParcelFileDescriptor = MJIEnv.NULL;
	    return rParcelFileDescriptor;
	  }
		@MJI
	  public static int openAssetFileDescriptor__Landroid_net_Uri_2Ljava_lang_String_2__Landroid_content_res_AssetFileDescriptor_2 (MJIEnv env, int objRef, int rUri0, int rString1) {
	    int rAssetFileDescriptor = MJIEnv.NULL;
	    return rAssetFileDescriptor;
	  }
		@MJI
	  public static int getResourceId__Landroid_net_Uri_2__Landroid_content_ContentResolver$OpenResourceIdResult_2 (MJIEnv env, int objRef, int rUri0) {
	    int rContentResolver$OpenResourceIdResult = MJIEnv.NULL;
	    return rContentResolver$OpenResourceIdResult;
	  }
		@MJI
	  public static int modeToMode__Landroid_net_Uri_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rUri0, int rString1) {
	    int v = (int)0;
	    return v;
	  }		
		@MJI
	  public static int applyBatch__Ljava_lang_String_2Ljava_util_ArrayList_2___3Landroid_content_ContentProviderResult_2 (MJIEnv env, int objRef, int rString0, int rArrayList1) {
	    int rContentProviderResult = MJIEnv.NULL;
	    return rContentProviderResult;
	  }
		@MJI
	  public static int bulkInsert__Landroid_net_Uri_2_3Landroid_content_ContentValues_2__I (MJIEnv env, int objRef, int rUri0, int rContentValues1) {
	    int v = (int)0;
	    return v;
	  }
		@MJI
	  public static int acquireContentProviderClient__Ljava_lang_String_2__Landroid_content_ContentProviderClient_2 (MJIEnv env, int objRef, int rString0) {
	    int rContentProviderClient = MJIEnv.NULL;
	    return rContentProviderClient;
	  }
		@MJI
	  public static int acquireContentProviderClient__Landroid_net_Uri_2__Landroid_content_ContentProviderClient_2 (MJIEnv env, int objRef, int rUri0) {
	    int rContentProviderClient = MJIEnv.NULL;
	    return rContentProviderClient;
	  }
		@MJI
	  public static void registerContentObserver__Landroid_net_Uri_2ZLandroid_database_ContentObserver_2__V (MJIEnv env, int objRef, int rUri0, boolean v1, int rContentObserver2) {
	  }
		@MJI
	  public static void unregisterContentObserver__Landroid_database_ContentObserver_2__V (MJIEnv env, int objRef, int rContentObserver0) {
	  }
		@MJI
	  public static void notifyChange__Landroid_net_Uri_2Landroid_database_ContentObserver_2__V (MJIEnv env, int objRef, int rUri0, int rContentObserver1) {
	  }
		@MJI
	  public static void notifyChange__Landroid_net_Uri_2Landroid_database_ContentObserver_2Z__V (MJIEnv env, int objRef, int rUri0, int rContentObserver1, boolean v2) {
	  }
		@MJI
	  public static void startSync__Landroid_net_Uri_2Landroid_os_Bundle_2__V (MJIEnv env, int objRef, int rUri0, int rBundle1) {
	  }
		@MJI
	  public static void requestSync__Landroid_accounts_Account_2Ljava_lang_String_2Landroid_os_Bundle_2__V (MJIEnv env, int clsObjRef, int rAccount0, int rString1, int rBundle2) {
	  }
		@MJI
	  public static void validateSyncExtrasBundle__Landroid_os_Bundle_2__V (MJIEnv env, int clsObjRef, int rBundle0) {
	  }
		@MJI
	  public static void cancelSync__Landroid_accounts_Account_2Ljava_lang_String_2__V (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	  }
		@MJI
	  public static void cancelSync__Landroid_net_Uri_2__V (MJIEnv env, int objRef, int rUri0) {
	  }
		@MJI
	  public static int getSyncAdapterTypes_____3Landroid_content_SyncAdapterType_2 (MJIEnv env, int clsObjRef) {
	    int rSyncAdapterType = MJIEnv.NULL;
	    return rSyncAdapterType;
	  }
		@MJI
	  public static boolean getSyncAutomatically__Landroid_accounts_Account_2Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	    boolean v = false;
	    return v;
	  }
		@MJI
	  public static void setSyncAutomatically__Landroid_accounts_Account_2Ljava_lang_String_2Z__V (MJIEnv env, int clsObjRef, int rAccount0, int rString1, boolean v2) {
	  }
		@MJI
	  public static void addPeriodicSync__Landroid_accounts_Account_2Ljava_lang_String_2Landroid_os_Bundle_2J__V (MJIEnv env, int clsObjRef, int rAccount0, int rString1, int rBundle2, long v3) {
	  }
		@MJI
	  public static void removePeriodicSync__Landroid_accounts_Account_2Ljava_lang_String_2Landroid_os_Bundle_2__V (MJIEnv env, int clsObjRef, int rAccount0, int rString1, int rBundle2) {
	  }
		@MJI
	  public static int getPeriodicSyncs__Landroid_accounts_Account_2Ljava_lang_String_2__Ljava_util_List_2 (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	    int rList = MJIEnv.NULL;
	    return rList;
	  }
		@MJI
	  public static int getIsSyncable__Landroid_accounts_Account_2Ljava_lang_String_2__I (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	    int v = (int)0;
	    return v;
	  }
		@MJI
	  public static void setIsSyncable__Landroid_accounts_Account_2Ljava_lang_String_2I__V (MJIEnv env, int clsObjRef, int rAccount0, int rString1, int v2) {
	  }
		@MJI
	  public static boolean getMasterSyncAutomatically____Z (MJIEnv env, int clsObjRef) {
	    boolean v = false;
	    return v;
	  }
		@MJI
	  public static void setMasterSyncAutomatically__Z__V (MJIEnv env, int clsObjRef, boolean v0) {
	  }
		@MJI
	  public static boolean isSyncActive__Landroid_accounts_Account_2Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	    boolean v = false;
	    return v;
	  }
		@MJI
	  public static int getCurrentSync____Landroid_content_SyncInfo_2 (MJIEnv env, int clsObjRef) {
	    int rSyncInfo = MJIEnv.NULL;
	    return rSyncInfo;
	  }
		@MJI
	  public static int getSyncStatus__Landroid_accounts_Account_2Ljava_lang_String_2__Landroid_content_SyncStatusInfo_2 (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	    int rSyncStatusInfo = MJIEnv.NULL;
	    return rSyncStatusInfo;
	  }
		@MJI
	  public static boolean isSyncPending__Landroid_accounts_Account_2Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, int rAccount0, int rString1) {
	    boolean v = false;
	    return v;
	  }
		@MJI
	  public static int addStatusChangeListener__ILandroid_content_SyncStatusObserver_2__Ljava_lang_Object_2 (MJIEnv env, int clsObjRef, int v0, int rSyncStatusObserver1) {
	    int rObject = MJIEnv.NULL;
	    return rObject;
	  }
		@MJI
	  public static void removeStatusChangeListener__Ljava_lang_Object_2__V (MJIEnv env, int clsObjRef, int rObject0) {
	  }
		@MJI
	  public static int samplePercentForDuration__J__I (MJIEnv env, int objRef, long v0) {
	    int v = (int)0;
	    return v;
	  }
		@MJI
	  public static void maybeLogQueryToEventLog__JLandroid_net_Uri_2_3Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, long v0, int rUri1, int rString2, int rString3, int rString4) {
	  }
		@MJI
	  public static void maybeLogUpdateToEventLog__JLandroid_net_Uri_2Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, long v0, int rUri1, int rString2, int rString3) {
	  }
		@MJI
	  public static int getContentService____Landroid_content_IContentService_2 (MJIEnv env, int clsObjRef) {
	    int rIContentService = MJIEnv.NULL;
	    return rIContentService;
	  }
	}

