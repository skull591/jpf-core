package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_com_google_android_maps_GeoPoint extends NativePeer{
	private static int latitude;
	private static int longitude;
	
	  @MJI
	public static void $init__II__V(MJIEnv env, int objRef, int lat, int lon){
		if(lat > 90000000){
			lat = 90000000;
		}
		if(lat < -90000000){
			lat = -90000000;
		}
		if(lon > 180000000){
			lon = 180000000;
		}
		if(lon < -180000000){
			lon = -180000000;
		}
		env.setIntField(objRef, "latitudeE6", lat);
		latitude = lat;
		env.setIntField(objRef, "longitudeE6", lon);
		longitude = lon;
	}
	  @MJI
  public static boolean equals__Ljava_lang_Object_2__Z (MJIEnv env, int objRef, int rObject0) {
//	  String s1 = env.getStringObject(toString____Ljava_lang_String_2(env, objRef));
//	  String s2 = env.getStringObject(toString____Ljava_lang_String_2(env, rObject0));
//	  System.out.println(s1);
//	  System.out.println(s2);
//	  if(env.getIntField(rObject0, "latitudeE6") == env.getIntField(objRef, "latitudeE6") && env.getIntField(objRef, "longitudeE6") == env.getIntField(objRef, "longitudeE6")){
//		  return true;
//	  }
	  if(objRef == rObject0){
		  return true;
	  }
	  return false;
  }
	  @MJI
  public static int toString____Ljava_lang_String_2 (MJIEnv env, int objRef) {
	  String s = "GeoPoint: Latitude: "+ latitude + ", Longitude: "+ longitude;
	  int rString = env.newString(s);
	  return rString;
  }
	  @MJI
  public static int hashCode____I (MJIEnv env, int objRef) {
	  int result = 7;
	  result = 31 * result + latitude;
	  result = 31 * result + longitude;
	  return result;
  }
	  @MJI
  public static int getLatitudeE6____I (MJIEnv env, int objRef) {
	  // this will throw exception. 
	  // I guess the reason is that the two fields in fact are not specified in the maps.jar where everything is stub
//    return env.getIntField(objRef, "latitudeE6");
	  return latitude;
  }
	  @MJI
  public static int getLongitudeE6____I (MJIEnv env, int objRef) {
//    return env.getIntField(objRef, "longitudeE6");
	  return longitude;
  }
}
