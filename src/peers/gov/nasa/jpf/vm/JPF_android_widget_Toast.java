package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_widget_Toast extends NativePeer{
	  @MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int contextRef){
		
	}
	  @MJI
  public static void show____V (MJIEnv env, int objRef) {
	  //because we don't have real GUI when the app is run in JPF's VM, so we don't model this method
	  //we only model the makeText method (print out the text in console) 
  }
	  @MJI
  public static void cancel____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void setView__Landroid_view_View_2__V (MJIEnv env, int objRef, int rView0) {
  }
	  @MJI
  public static int getView____Landroid_view_View_2 (MJIEnv env, int objRef) {
    int rView = MJIEnv.NULL;
    return rView;
  }
	  @MJI
  public static void setDuration__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static int getDuration____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static void setMargin__FF__V (MJIEnv env, int objRef, float v0, float v1) {
  }
	  @MJI
  public static float getHorizontalMargin____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
	  @MJI
  public static float getVerticalMargin____F (MJIEnv env, int objRef) {
    float v = (float)0;
    return v;
  }
	  @MJI
  public static void setGravity__III__V (MJIEnv env, int objRef, int v0, int v1, int v2) {
  }
	  @MJI
  public static int getGravity____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getXOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int getYOffset____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	  @MJI
  public static int makeText__Landroid_content_Context_2II__Landroid_widget_Toast_2 (MJIEnv env, int clsObjRef, int rContext0, int v1, int v2) {
	  //andrew
//	  System.out.println("[Toast Message] static message retrived from strings.xml");
	  int rToast = env.newObject("android.widget.Toast");
    return rToast;
  }
	  @MJI
  public static int makeText__Landroid_content_Context_2Ljava_lang_CharSequence_2I__Landroid_widget_Toast_2 (MJIEnv env, int clsObjRef, int rContext0, int rCharSequence1, int v2) {
    //andrew
//	  System.out.println("[Toast Message] "+env.getStringObject(rCharSequence1));
	  int rToast = env.newObject("android.widget.Toast");
    return rToast;
  }
	  @MJI
  public static void setText__Ljava_lang_CharSequence_2__V (MJIEnv env, int objRef, int rCharSequence0) {
  }
	  @MJI
  public static void setText__I__V (MJIEnv env, int objRef, int v0) {
  }
}  