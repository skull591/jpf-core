package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_database_sqlite_SQLiteDatabase extends NativePeer{
	
  @MJI
  public static void finalize____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static long replace__Ljava_lang_String_2Ljava_lang_String_2Landroid_content_ContentValues_2__J (MJIEnv env, int objRef, int rString0, int rString1, int rContentValues2) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static void close____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int delete__Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0, int rString1, int rString2) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static long insert__Ljava_lang_String_2Ljava_lang_String_2Landroid_content_ContentValues_2__J (MJIEnv env, int objRef, int rString0, int rString1, int rContentValues2) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static boolean isReadOnly____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int create__Landroid_database_sqlite_SQLiteDatabase$CursorFactory_2__Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int clsObjRef, int rSQLiteDatabase$CursorFactory0) {
    int rSQLiteDatabase = MJIEnv.NULL;
    return rSQLiteDatabase;
  }
  @MJI
  public static int getPath____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static boolean isOpen____Z (MJIEnv env, int objRef) {
	  return true;
  }
  @MJI
  public static int query__ZLjava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, boolean v0, int rString1, int rString2, int rString3, int rString4, int rString5, int rString6, int rString7, int rString8) {
    int rCursor = env.newObject("android.database.Cursor");
    return rCursor;
  }
  @MJI
  public static int query__Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rString0, int rString1, int rString2, int rString3, int rString4, int rString5, int rString6) {
	  int rCursor = env.newObject("android.database.Cursor");
    return rCursor;
  }
  @MJI
  public static int query__Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rString0, int rString1, int rString2, int rString3, int rString4, int rString5, int rString6, int rString7) {
	  int rCursor = env.newObject("android.database.Cursor");
    return rCursor;
  }
  @MJI
  public static int update__Ljava_lang_String_2Landroid_content_ContentValues_2Ljava_lang_String_2_3Ljava_lang_String_2__I (MJIEnv env, int objRef, int rString0, int rContentValues1, int rString2, int rString3) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void onAllReferencesReleased____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static int releaseMemory____I (MJIEnv env, int clsObjRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setLockingEnabled__Z__V (MJIEnv env, int objRef, boolean v0) {
  }
  @MJI
  public static void beginTransaction____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void beginTransactionWithListener__Landroid_database_sqlite_SQLiteTransactionListener_2__V (MJIEnv env, int objRef, int rSQLiteTransactionListener0) {
  }
  @MJI
  public static void endTransaction____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static void setTransactionSuccessful____V (MJIEnv env, int objRef) {
  }
  @MJI
  public static boolean inTransaction____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean isDbLockedByCurrentThread____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean isDbLockedByOtherThreads____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean yieldIfContended____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean yieldIfContendedSafely____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
  @MJI
  public static boolean yieldIfContendedSafely__J__Z (MJIEnv env, int objRef, long v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static int getSyncedTables____Ljava_util_Map_2 (MJIEnv env, int objRef) {
    int rMap = MJIEnv.NULL;
    return rMap;
  }
  @MJI
  public static int openDatabase__Ljava_lang_String_2Landroid_database_sqlite_SQLiteDatabase$CursorFactory_2I__Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int clsObjRef, int rString0, int rSQLiteDatabase$CursorFactory1, int v2) {
    int rSQLiteDatabase = MJIEnv.NULL;
    return rSQLiteDatabase;
  }
  @MJI
  public static int openOrCreateDatabase__Ljava_lang_String_2Landroid_database_sqlite_SQLiteDatabase$CursorFactory_2__Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int clsObjRef, int rString0, int rSQLiteDatabase$CursorFactory1) {
    int rSQLiteDatabase = MJIEnv.NULL;
    return rSQLiteDatabase;
  }
  @MJI
  public static int openOrCreateDatabase__Ljava_io_File_2Landroid_database_sqlite_SQLiteDatabase$CursorFactory_2__Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int clsObjRef, int rFile0, int rSQLiteDatabase$CursorFactory1) {
    int rSQLiteDatabase = MJIEnv.NULL;
    return rSQLiteDatabase;
  }
  @MJI
  public static int getVersion____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void setVersion__I__V (MJIEnv env, int objRef, int v0) {
  }
  @MJI
  public static long getMaximumSize____J (MJIEnv env, int objRef) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static long setMaximumSize__J__J (MJIEnv env, int objRef, long v0) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static long getPageSize____J (MJIEnv env, int objRef) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static void setPageSize__J__V (MJIEnv env, int objRef, long v0) {
  }
  @MJI
  public static void markTableSyncable__Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0, int rString1) {
  }
  @MJI
  public static void markTableSyncable__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0, int rString1, int rString2) {
  }
  @MJI
  public static int findEditTable__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
  @MJI
  public static int compileStatement__Ljava_lang_String_2__Landroid_database_sqlite_SQLiteStatement_2 (MJIEnv env, int objRef, int rString0) {
    int rSQLiteStatement = MJIEnv.NULL;
    return rSQLiteStatement;
  }
  @MJI
  public static int queryWithFactory__Landroid_database_sqlite_SQLiteDatabase$CursorFactory_2ZLjava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rSQLiteDatabase$CursorFactory0, boolean v1, int rString2, int rString3, int rString4, int rString5, int rString6, int rString7, int rString8, int rString9) {
	  int rCursor = env.newObject("android.database.Cursor");
    return rCursor;
  }
  @MJI
  public static int rawQuery__Ljava_lang_String_2_3Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rString0, int rString1) {
	  int rCursor = env.newObject("android.database.Cursor");
    return rCursor;
  }
  @MJI
  public static int rawQueryWithFactory__Landroid_database_sqlite_SQLiteDatabase$CursorFactory_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2__Landroid_database_Cursor_2 (MJIEnv env, int objRef, int rSQLiteDatabase$CursorFactory0, int rString1, int rString2, int rString3) {
	  int rCursor = env.newObject("android.database.Cursor");
    return rCursor;
  }
  @MJI
  public static long insertOrThrow__Ljava_lang_String_2Ljava_lang_String_2Landroid_content_ContentValues_2__J (MJIEnv env, int objRef, int rString0, int rString1, int rContentValues2) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static long replaceOrThrow__Ljava_lang_String_2Ljava_lang_String_2Landroid_content_ContentValues_2__J (MJIEnv env, int objRef, int rString0, int rString1, int rContentValues2) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static long insertWithOnConflict__Ljava_lang_String_2Ljava_lang_String_2Landroid_content_ContentValues_2I__J (MJIEnv env, int objRef, int rString0, int rString1, int rContentValues2, int v3) {
    long v = (long)0;
    return v;
  }
  @MJI
  public static int updateWithOnConflict__Ljava_lang_String_2Landroid_content_ContentValues_2Ljava_lang_String_2_3Ljava_lang_String_2I__I (MJIEnv env, int objRef, int rString0, int rContentValues1, int rString2, int rString3, int v4) {
    int v = (int)0;
    return v;
  }
  @MJI
  public static void execSQL__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
  @MJI
  public static void execSQL__Ljava_lang_String_2_3Ljava_lang_Object_2__V (MJIEnv env, int objRef, int rString0, int rObject1) {
  }
  @MJI
  public static boolean needUpgrade__I__Z (MJIEnv env, int objRef, int v0) {
    boolean v = false;
    return v;
  }
  @MJI
  public static void setLocale__Ljava_util_Locale_2__V (MJIEnv env, int objRef, int rLocale0) {
  }
}  
