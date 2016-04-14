package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_google_android_maps_OverlayItem extends NativePeer{
	  @MJI
	public static void $init__Lcom_google_android_maps_GeoPoint_2Ljava_lang_String_2Ljava_lang_String_2__V(MJIEnv env, int objRef, int geoPointRef, int strRef, int strRef2){
	}
	  @MJI
	public static int getTitle____Ljava_lang_String_2 (MJIEnv env, int clsObj){
		return env.newString("title");
	}
	  @MJI
	public static int getSnippet____Ljava_lang_String_2 (MJIEnv env, int clsObj){
		return env.newString("snippet");
	}

}
