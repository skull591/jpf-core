package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_text_format_DateFormat extends NativePeer{
	  @MJI
  public static int getTimeFormat__Landroid_content_Context_2__Ljava_text_DateFormat_2(MJIEnv env, int clsObjRef, int ctxRef){
	  int ref = env.newObject("java.text.DateFormat");
	  return ref;
  }
}
