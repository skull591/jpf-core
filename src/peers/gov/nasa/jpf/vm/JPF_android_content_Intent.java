package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_Intent extends NativePeer{
	@MJI
	public static void $init____V(MJIEnv env, int objRef){
		
	}
	
	@MJI	
	public static void $init__Landroid_content_Context_2Ljava_lang_Class_2__V(MJIEnv env, int objRef, int ctxRef, int clsRef){
		
		int compNameRef = env.newObject("Landroid/content/ComponentName;");
		env.setReferenceField(compNameRef, "mPackage", MJIEnv.NULL);
		int clsNameRef = env.getReferenceField(clsRef, "name");
		
		env.setReferenceField(compNameRef, "mClass", clsNameRef);
		env.setReferenceField(objRef, "mComponent", compNameRef);
	}
	@MJI
  public static int toString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int clone____Ljava_lang_Object_2 (MJIEnv env, int objRef) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
	@MJI
  public static int getPackage____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int getType____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int getScheme____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int toURI____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int createChooser__Landroid_content_Intent_2Ljava_lang_CharSequence_2__Landroid_content_Intent_2 (MJIEnv env, int clsObjRef, int rIntent0, int rCharSequence1) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int cloneFilter____Landroid_content_Intent_2 (MJIEnv env, int objRef) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int getIntent__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int parseUri__Ljava_lang_String_2I__Landroid_content_Intent_2 (MJIEnv env, int clsObjRef, int rString0, int v1) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int getIntentOld__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
//  public static int getAction____Ljava_lang_String_2 (MJIEnv env, int objRef) {
//    int rString = MJIEnv.NULL;
//    return rString;
//  }
	@MJI
  public static int getData____Landroid_net_Uri_2 (MJIEnv env, int objRef) {
    int rUri = MJIEnv.NULL;
    return rUri;
  }
	@MJI
  public static int getDataString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int resolveType__Landroid_content_Context_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rContext0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int resolveType__Landroid_content_ContentResolver_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rContentResolver0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int resolveTypeIfNeeded__Landroid_content_ContentResolver_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rContentResolver0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static boolean hasCategory__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int getCategories____Ljava_util_Set_2 (MJIEnv env, int objRef) {
    int rSet = MJIEnv.NULL;
    return rSet;
  }
	@MJI
  public static void setExtrasClassLoader__Ljava_lang_ClassLoader_2__V (MJIEnv env, int objRef, int rClassLoader0) {
  }
	@MJI
  public static boolean hasExtra__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean hasFileDescriptors____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	
//  public static boolean getBooleanExtra__Ljava_lang_String_2Z__Z (MJIEnv env, int objRef, int rString0, boolean v1) {
//    boolean v = false;
//    return v;
//  }
//
//  public static byte getByteExtra__Ljava_lang_String_2B__B (MJIEnv env, int objRef, int rString0, byte v1) {
//    byte v = (byte)0;
//    return v;
//  }
//
//  public static short getShortExtra__Ljava_lang_String_2S__S (MJIEnv env, int objRef, int rString0, short v1) {
//    short v = (short)0;
//    return v;
//  }
//
//  public static char getCharExtra__Ljava_lang_String_2C__C (MJIEnv env, int objRef, int rString0, char v1) {
//    char v = (char)0;
//    return v;
//  }
//
//  public static int getIntExtra__Ljava_lang_String_2I__I (MJIEnv env, int objRef, int rString0, int v1) {
//    int v = (int)0;
//    return v;
//  }
//
//  public static long getLongExtra__Ljava_lang_String_2J__J (MJIEnv env, int objRef, int rString0, long v1) {
//    long v = (long)0;
//    return v;
//  }
//
//  public static float getFloatExtra__Ljava_lang_String_2F__F (MJIEnv env, int objRef, int rString0, float v1) {
//    float v = (float)0;
//    return v;
//  }
//
//  public static double getDoubleExtra__Ljava_lang_String_2D__D (MJIEnv env, int objRef, int rString0, double v1) {
//    double v = (double)0;
//    return v;
//  }
//
//  public static int getStringExtra__Ljava_lang_String_2__Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0) {
//    int rString = MJIEnv.NULL;
//    return rString;
//  }
//
//  public static int getCharSequenceExtra__Ljava_lang_String_2__Ljava_lang_CharSequence_2 (MJIEnv env, int objRef, int rString0) {
//    int rCharSequence = MJIEnv.NULL;
//    return rCharSequence;
//  }
//
	@MJI
  public static int getParcelableExtra__Ljava_lang_String_2__Landroid_os_Parcelable_2 (MJIEnv env, int objRef, int rString0) {
    int rParcelable = MJIEnv.NULL;
    String s = env.getStringObject(rString0);
    if(s.equals("net.exclaimindustries.geohashdroid.info")){
    	rParcelable = env.newObject("net.exclaimindustries.geohashdroid.Info");
    }
    return rParcelable;
  }
//
//  public static int getParcelableArrayExtra__Ljava_lang_String_2___3Landroid_os_Parcelable_2 (MJIEnv env, int objRef, int rString0) {
//    int rParcelable = MJIEnv.NULL;
//    return rParcelable;
//  }
//
//  public static int getParcelableArrayListExtra__Ljava_lang_String_2__Ljava_util_ArrayList_2 (MJIEnv env, int objRef, int rString0) {
//    int rArrayList = MJIEnv.NULL;
//    return rArrayList;
//  }
//
//  public static int getSerializableExtra__Ljava_lang_String_2__Ljava_io_Serializable_2 (MJIEnv env, int objRef, int rString0) {
//    int rSerializable = MJIEnv.NULL;
//    return rSerializable;
//  }
//
//  public static int getIntegerArrayListExtra__Ljava_lang_String_2__Ljava_util_ArrayList_2 (MJIEnv env, int objRef, int rString0) {
//    int rArrayList = MJIEnv.NULL;
//    return rArrayList;
//  }
//
//  public static int getStringArrayListExtra__Ljava_lang_String_2__Ljava_util_ArrayList_2 (MJIEnv env, int objRef, int rString0) {
//    int rArrayList = MJIEnv.NULL;
//    return rArrayList;
//  }
//
//  public static int getCharSequenceArrayListExtra__Ljava_lang_String_2__Ljava_util_ArrayList_2 (MJIEnv env, int objRef, int rString0) {
//    int rArrayList = MJIEnv.NULL;
//    return rArrayList;
//  }
//
//  public static int getBooleanArrayExtra__Ljava_lang_String_2___3Z (MJIEnv env, int objRef, int rString0) {
//    int rZ = MJIEnv.NULL;
//    return rZ;
//  }
//
//  public static int getByteArrayExtra__Ljava_lang_String_2___3B (MJIEnv env, int objRef, int rString0) {
//    int rB = MJIEnv.NULL;
//    return rB;
//  }
//
//  public static int getShortArrayExtra__Ljava_lang_String_2___3S (MJIEnv env, int objRef, int rString0) {
//    int rS = MJIEnv.NULL;
//    return rS;
//  }
//
//  public static int getCharArrayExtra__Ljava_lang_String_2___3C (MJIEnv env, int objRef, int rString0) {
//    int rC = MJIEnv.NULL;
//    return rC;
//  }
//
//  public static int getIntArrayExtra__Ljava_lang_String_2___3I (MJIEnv env, int objRef, int rString0) {
//    int rI = MJIEnv.NULL;
//    return rI;
//  }
//
//  public static int getLongArrayExtra__Ljava_lang_String_2___3J (MJIEnv env, int objRef, int rString0) {
//    int rJ = MJIEnv.NULL;
//    return rJ;
//  }
//
//  public static int getFloatArrayExtra__Ljava_lang_String_2___3F (MJIEnv env, int objRef, int rString0) {
//    int rF = MJIEnv.NULL;
//    return rF;
//  }
//
//  public static int getDoubleArrayExtra__Ljava_lang_String_2___3D (MJIEnv env, int objRef, int rString0) {
//    int rD = MJIEnv.NULL;
//    return rD;
//  }
//
//  public static int getStringArrayExtra__Ljava_lang_String_2___3Ljava_lang_String_2 (MJIEnv env, int objRef, int rString0) {
//    int rString = MJIEnv.NULL;
//    return rString;
//  }
//
//  public static int getCharSequenceArrayExtra__Ljava_lang_String_2___3Ljava_lang_CharSequence_2 (MJIEnv env, int objRef, int rString0) {
//    int rCharSequence = MJIEnv.NULL;
//    return rCharSequence;
//  }
//
//  public static int getBundleExtra__Ljava_lang_String_2__Landroid_os_Bundle_2 (MJIEnv env, int objRef, int rString0) {
//    int rBundle = MJIEnv.NULL;
//    return rBundle;
//  }
//
	@MJI
  public static int getExtras____Landroid_os_Bundle_2 (MJIEnv env, int objRef) {
	 int rBundle = env.newObject("android.os.Bundle");
    return rBundle;
  }
//
//  public static int getFlags____I (MJIEnv env, int objRef) {
//    int v = (int)0;
//    return v;
//  }
//
//  public static int getComponent____Landroid_content_ComponentName_2 (MJIEnv env, int objRef) {
//    int rComponentName = MJIEnv.NULL;
//    return rComponentName;
//  }
//
//  public static int getSourceBounds____Landroid_graphics_Rect_2 (MJIEnv env, int objRef) {
//    int rRect = MJIEnv.NULL;
//    return rRect;
//  }
//
//  public static int resolveActivity__Landroid_content_pm_PackageManager_2__Landroid_content_ComponentName_2 (MJIEnv env, int objRef, int rPackageManager0) {
//    int rComponentName = MJIEnv.NULL;
//    return rComponentName;
//  }
//
//  public static int resolveActivityInfo__Landroid_content_pm_PackageManager_2I__Landroid_content_pm_ActivityInfo_2 (MJIEnv env, int objRef, int rPackageManager0, int v1) {
//    int rActivityInfo = MJIEnv.NULL;
//    return rActivityInfo;
//  }

//  public static int setAction__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
	@MJI
  public static int setData__Landroid_net_Uri_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rUri0) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int setType__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int setDataAndType__Landroid_net_Uri_2Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rUri0, int rString1) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static int addCategory__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
	@MJI
  public static void removeCategory__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
  }
	
//  public static int putExtra__Ljava_lang_String_2S__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, short v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2I__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2J__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, long v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2F__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, float v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2C__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, char v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rString1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2Ljava_lang_CharSequence_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rCharSequence1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2Landroid_os_Parcelable_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rParcelable1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2_3Landroid_os_Parcelable_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rParcelable1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2D__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, double v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putExtra__Ljava_lang_String_2B__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, byte v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2Landroid_os_Bundle_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rBundle1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3Ljava_lang_CharSequence_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rCharSequence1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2Ljava_io_Serializable_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rSerializable1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3Z__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rZ1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3B__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rB1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3S__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rS1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3C__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rC1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3I__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rI1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3J__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rJ1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3F__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rF1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2Z__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, boolean v1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rString1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtra__Ljava_lang_String_2_3D__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rD1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }

//  public static int putParcelableArrayListExtra__Ljava_lang_String_2Ljava_util_ArrayList_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rArrayList1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putIntegerArrayListExtra__Ljava_lang_String_2Ljava_util_ArrayList_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rArrayList1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putStringArrayListExtra__Ljava_lang_String_2Ljava_util_ArrayList_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rArrayList1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putCharSequenceArrayListExtra__Ljava_lang_String_2Ljava_util_ArrayList_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rArrayList1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtras__Landroid_content_Intent_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rIntent0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int putExtras__Landroid_os_Bundle_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rBundle0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int replaceExtras__Landroid_content_Intent_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rIntent0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int replaceExtras__Landroid_os_Bundle_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rBundle0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static void removeExtra__Ljava_lang_String_2__V (MJIEnv env, int objRef, int rString0) {
//  }
//
//  public static int setFlags__I__Landroid_content_Intent_2 (MJIEnv env, int objRef, int v0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int addFlags__I__Landroid_content_Intent_2 (MJIEnv env, int objRef, int v0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int setPackage__Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int setComponent__Landroid_content_ComponentName_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rComponentName0) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int setClassName__Landroid_content_Context_2Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rContext0, int rString1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
//
//  public static int setClassName__Ljava_lang_String_2Ljava_lang_String_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rString0, int rString1) {
//    int rIntent = MJIEnv.NULL;
//    return rIntent;
//  }
	@MJI
  public static int setClass__Landroid_content_Context_2Ljava_lang_Class_2__Landroid_content_Intent_2 (MJIEnv env, int objRef, int rContext0, int rClass1) {
	//create an ComponentName object
		
	int compNameRef = env.newObject("Landroid/content/ComponentName;");
	env.setReferenceField(compNameRef, "mPackage", MJIEnv.NULL);
	int clsNameRef = env.getReferenceField(rClass1, "name");
	
	env.setReferenceField(compNameRef, "mClass", clsNameRef);
	env.setReferenceField(objRef, "mComponent", compNameRef);
	  
	return objRef;
  }
	@MJI
  public static void setSourceBounds__Landroid_graphics_Rect_2__V (MJIEnv env, int objRef, int rRect0) {
  }
	@MJI
  public static int fillIn__Landroid_content_Intent_2I__I (MJIEnv env, int objRef, int rIntent0, int v1) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static boolean filterEquals__Landroid_content_Intent_2__Z (MJIEnv env, int objRef, int rIntent0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int filterHashCode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static int toUri__I__Ljava_lang_String_2 (MJIEnv env, int objRef, int v0) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int describeContents____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static void writeToParcel__Landroid_os_Parcel_2I__V (MJIEnv env, int objRef, int rParcel0, int v1) {
  }
	@MJI
  public static void readFromParcel__Landroid_os_Parcel_2__V (MJIEnv env, int objRef, int rParcel0) {
  }
	@MJI
  public static int parseIntent__Landroid_content_res_Resources_2Lorg_xmlpull_v1_XmlPullParser_2Landroid_util_AttributeSet_2__Landroid_content_Intent_2 (MJIEnv env, int clsObjRef, int rResources0, int rXmlPullParser1, int rAttributeSet2) {
    int rIntent = MJIEnv.NULL;
    return rIntent;
  }
}
