package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_net_http_AndroidHttpClient extends NativePeer{
	  @MJI
	public static int newInstance__Ljava_lang_String_2__Landroid_net_http_AndroidHttpClient_2(MJIEnv env, int objRef, int strRef){
		return env.newObject("android.net.http.AndroidHttpClient");
	}

}
