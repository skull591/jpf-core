package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_widget_EditText extends NativePeer{
	
	  @MJI
	public static void $init__Landroid_content_Context_2__V(MJIEnv env, int objRef, int contextRef){
	}
	  @MJI
  public static boolean getDefaultEditable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	  @MJI
  public static int getDefaultMovementMethod____Landroid_text_method_MovementMethod_2 (MJIEnv env, int objRef) {
    int rMovementMethod = MJIEnv.NULL;
    return rMovementMethod;
  }
	  @MJI
  public static int getText____Landroid_text_Editable_2 (MJIEnv env, int objRef) {
//    int rEditable = env.newObject("android.text.Editable");
	  int rEditable = env.newString("input");
    return rEditable;
  }
	  @MJI
  public static int getText____Ljava_lang_CharSequence_2 (MJIEnv env, int objRef) {
	  int ref = env.newObject("java.lang.CharSequence");
    return ref;
  }
	  @MJI
  public static void setText__Ljava_lang_CharSequence_2Landroid_widget_TextView$BufferType_2__V (MJIEnv env, int objRef, int rCharSequence0, int rTextView$BufferType1) {
  }
	  @MJI
  public static void setSelection__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void setSelection__II__V (MJIEnv env, int objRef, int v0, int v1) {
  }
	  @MJI
  public static void selectAll____V (MJIEnv env, int objRef) {
  }
	  @MJI
  public static void extendSelection__I__V (MJIEnv env, int objRef, int v0) {
  }
	  @MJI
  public static void setEllipsize__Landroid_text_TextUtils$TruncateAt_2__V (MJIEnv env, int objRef, int rTextUtils$TruncateAt0) {
  }
}
