package com.eshop.util;

public class systemContext {
    
	  //���3��ThreadLocal����¼���߳��йص����ҳ�йصı���
	 public static ThreadLocal<Integer> offset=new ThreadLocal<Integer>();//ƫ����
	 public static ThreadLocal<Integer> pageSize=new ThreadLocal<Integer>();//ÿҳ��¼��
	 public static ThreadLocal<Integer> count=new ThreadLocal<Integer>();//�ܼ� 
	public static int getOffset() {
		return offset.get();
	}
	public static void setOffset(Integer _offset) {
		offset.set(_offset);
	}
	
	public static void removeoffset() {
		offset.remove();
		
	}
	public static int getPageSize() {
		return pageSize.get();
	}
	public static void removePageSize(Integer _pageSize) {
		pageSize.set(_pageSize);
	}
	public static void setPageSize(Integer _pageSize) {
		pageSize.set(_pageSize);
	}
	
	public static ThreadLocal<Integer> getCount() {
		return count;
	}
	public static void setCount(Integer count) {
		pageSize.set( count);
	}
	   
    
    

}
