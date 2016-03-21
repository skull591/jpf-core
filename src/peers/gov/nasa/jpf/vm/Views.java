package gov.nasa.jpf.vm;

import java.util.ArrayList;

public class Views {
	public static ArrayList<Tuple> createdView =new ArrayList<>();
	public static class Tuple{
		int objRef=-1;
		int viewId=-1;
		int viewRef=-1;
	}
}
