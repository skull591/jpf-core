package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_edu_nyu_cs_omnidroid_app_model_CoreRulesDbHelper extends NativePeer{
	//directly copy from old version, may not be used
	  @MJI
	public static int getRulesMatchingEvent__Ljava_lang_String_2Ljava_lang_String_2__Ljava_util_ArrayList_2(MJIEnv env, int objRef, int str1Ref, int str2Ref){
		int rList = env.newObject("java.util.ArrayList");
		long currentTime = System.currentTimeMillis();
	    int size = (int) currentTime % 6;
	    size *= 40;
	    if(size < 0) size *= -1;
	    
		  FieldInfo fi = env.getHeap().get(rList).getFieldInfo("elementData");
		    int ref = env.newObjectArray("edu.nyu.cs.omnidroid.app.controller.Rule", size);
		    env.setReferenceField(rList, "elementData", ref);
		    env.setIntField(rList, "size", size);
		  
		    return rList;
	}

}
