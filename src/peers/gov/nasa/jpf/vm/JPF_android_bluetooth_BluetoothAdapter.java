package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_android_bluetooth_BluetoothAdapter extends NativePeer{
	@MJI
  public static int getAddress____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int getName____Ljava_lang_String_2 (MJIEnv env, int objRef) {
    int rString = MJIEnv.NULL;
    return rString;
  }
	@MJI
  public static int getState____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static boolean setName__Ljava_lang_String_2__Z (MJIEnv env, int objRef, int rString0) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean disable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean enable____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int getDefaultAdapter____Landroid_bluetooth_BluetoothAdapter_2 (MJIEnv env, int clsObjRef) {
	  int rBluetoothAdapter = env.newObject("android.bluetooth.BluetoothAdapter");
	  return rBluetoothAdapter;
  }
	@MJI
  public static int getRemoteDevice__Ljava_lang_String_2__Landroid_bluetooth_BluetoothDevice_2 (MJIEnv env, int objRef, int rString0) {
    int rBluetoothDevice = MJIEnv.NULL;
    return rBluetoothDevice;
  }
	@MJI
  public static boolean isEnabled____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int getScanMode____I (MJIEnv env, int objRef) {
    int v = (int)0;
    return v;
  }
	@MJI
  public static boolean startDiscovery____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean cancelDiscovery____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static boolean isDiscovering____Z (MJIEnv env, int objRef) {
    boolean v = false;
    return v;
  }
	@MJI
  public static int getBondedDevices____Ljava_util_Set_2 (MJIEnv env, int objRef) {
    int rSet = MJIEnv.NULL;
    return rSet;
  }
	@MJI
  public static int listenUsingRfcommWithServiceRecord__Ljava_lang_String_2Ljava_util_UUID_2__Landroid_bluetooth_BluetoothServerSocket_2 (MJIEnv env, int objRef, int rString0, int rUUID1) {
    int rBluetoothServerSocket = MJIEnv.NULL;
    return rBluetoothServerSocket;
  }
	@MJI
  public static int listenUsingInsecureRfcommWithServiceRecord__Ljava_lang_String_2Ljava_util_UUID_2__Landroid_bluetooth_BluetoothServerSocket_2 (MJIEnv env, int objRef, int rString0, int rUUID1) {
    int rBluetoothServerSocket = MJIEnv.NULL;
    return rBluetoothServerSocket;
  }
	@MJI
  public static boolean checkBluetoothAddress__Ljava_lang_String_2__Z (MJIEnv env, int clsObjRef, int rString0) {
    boolean v = false;
    return v;
  }
}	
