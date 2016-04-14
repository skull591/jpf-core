package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_android_internal_app_AlertController$AlertParams extends NativePeer{
	
	//andrew
	  @MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int contextRef){
		env.setReferenceField(objRef, "mContext", contextRef);
		env.setBooleanField(objRef, "mCancelable", true);
		env.setReferenceField(objRef, "mInflater", env.newObject("android.view.LayoutInflater"));
	}
	  @MJI
  public static void apply__Lcom_android_internal_app_AlertController_2__V (MJIEnv env, int objRef, int rAlertController0) {
  }
	  @MJI
  public static void createListView__Lcom_android_internal_app_AlertController_2__V (MJIEnv env, int objRef, int rAlertController0) {
  }
}
