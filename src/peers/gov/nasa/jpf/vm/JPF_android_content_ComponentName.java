package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_content_ComponentName extends NativePeer{
	@MJI
	public static void $init__Ljava_lang_String_2Ljava_lang_String_2__V(MJIEnv env, int objRef, int pkgNameRef, int clsNameRef){
//		env.getVM().print(env.getStringObject(pkgNameRef));
//		env.setReferenceField(objRef, "mPackage", pkgNameRef);
//		env.setReferenceField(objRef, "mClass", clsNameRef);
//		env.setDeclaredReferenceField(objRef, "android/content/ComponentName", "mPackage", pkgNameRef);
//		env.heap.get(objRef).setDeclaredReferenceField("mPakage", null, pkgNameRef);
//		FieldInfo fi = env.getReferredClassInfo(objRef).getInstanceField("mPackage");
//		System.out.println(env.heap.get(objRef));
//		env.getVM().print(fi.toString());
//		System.out.println("constructing ComponentName");
		env.setReferenceField(objRef, "mPackage", pkgNameRef);
		env.setReferenceField(objRef, "mClass", clsNameRef);
//		System.out.println(env.getStringField(objRef, "mPackage"));
	}
	@MJI
  public static boolean equals__Ljava_lang_Object_2__Z (MJIEnv env, int objRef, int rObject0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int toString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int hashCode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static int clone____Landroid_content_ComponentName_2 (MJIEnv env, int objRef) {
    int rComponentName = MJIEnv.NULL;
    return rComponentName;
  }
	@MJI
  public static int clone____Ljava_lang_Object_2 (MJIEnv env, int objRef) {
    int rObject = MJIEnv.NULL;
    return rObject;
  }
	@MJI
  public static int compareTo__Landroid_content_ComponentName_2__I (MJIEnv env, int objRef, int rComponentName0) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static int compareTo__Ljava_lang_Object_2__I (MJIEnv env, int objRef, int rObject0) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static int getClassName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
	  //andrew
	  int rString = env.getHeap().get(objRef).getReferenceField("mClass");
    return rString;
  }
	@MJI
  public static int getPackageName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
	  //andrew
//    System.out.println(env.heap.get(objRef).getDeclaredReferenceField("mPackage", "Landroid/content/ComponentName;"));
    return MJIEnv.NULL;
  }
	@MJI
  public static int getShortClassName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int flattenToString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int flattenToShortString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int unflattenFromString__Ljava_lang_String_2__Landroid_content_ComponentName_2 (MJIEnv env, int clsObjRef, int rString0) {
    int rComponentName = MJIEnv.NULL;
    return rComponentName;
  }
	@MJI
  public static int toShortString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
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
  public static void writeToParcel__Landroid_content_ComponentName_2Landroid_os_Parcel_2__V (MJIEnv env, int clsObjRef, int rComponentName0, int rParcel1) {
  }
	@MJI
  public static int readFromParcel__Landroid_os_Parcel_2__Landroid_content_ComponentName_2 (MJIEnv env, int clsObjRef, int rParcel0) {
    int rComponentName = MJIEnv.NULL;
    return rComponentName;
  }
}
