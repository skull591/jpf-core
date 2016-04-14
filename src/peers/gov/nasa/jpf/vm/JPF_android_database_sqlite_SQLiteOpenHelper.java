package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_database_sqlite_SQLiteOpenHelper extends NativePeer{
	  @MJI
  public static void close____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static int getWritableDatabase____Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int objRef) {
	  //andrew return a SQLiteDatabase object
    int rSQLiteDatabase = env.newObject("android.database.sqlite.SQLiteDatabase");
    return rSQLiteDatabase;
  }
	  @MJI
  public static int getReadableDatabase____Landroid_database_sqlite_SQLiteDatabase_2 (MJIEnv env, int objRef) {
	  //andrew return a SQLiteDatabase object
	  int rSQLiteDatabase = env.newObject("android.database.sqlite.SQLiteDatabase");
    return rSQLiteDatabase;
  }
	  @MJI
  public static void onCreate__Landroid_database_sqlite_SQLiteDatabase_2__V (MJIEnv env, int objRef, int rSQLiteDatabase0) {
  }
	  @MJI
  public static void onUpgrade__Landroid_database_sqlite_SQLiteDatabase_2II__V (MJIEnv env, int objRef, int rSQLiteDatabase0, int v1, int v2) {
  }
	  @MJI
  public static void onOpen__Landroid_database_sqlite_SQLiteDatabase_2__V (MJIEnv env, int objRef, int rSQLiteDatabase0) {
  }
}
