package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_xorcode_andtweet_net_Connection extends NativePeer{
	  @MJI
	public static int postRequest__Ljava_lang_String_2Lorg_apache_http_client_HttpClient_2Lorg_apache_http_client_entity_UrlEncodedFormEntity_2__Ljava_lang_String_2(MJIEnv env, int objRef, int strRef, int clientRef, int entityRef){
		return env.newString("");
	}
	  @MJI
	public static int postRequest__Ljava_lang_String_2Lorg_apache_http_client_entity_UrlEncodedFormEntity_2__Ljava_lang_String_2(MJIEnv env, int objRef, int strRef, int entityRef){
		return env.newString("");
	}
	  @MJI
	//public JSONObject updateStatus(String message, long inReplyToId)
	public static int updateStatus__Ljava_lang_String_2J__Lorg_json_JSONObject_2(MJIEnv env, int objRef, int strRef, long id){
		return env.newObject("org.json.JSONObject");
	}
	  @MJI
	public static int getCredentials____Ljava_lang_String_2(MJIEnv env, int objRef){
		return env.newString("");
	}
	  @MJI
	public static int getRequest__Ljava_lang_String_2Lorg_apache_http_client_HttpClient_2__Ljava_lang_String_2(MJIEnv env, int objRef, int strRef, int cltRef){
		return env.newString("");
	}
}
