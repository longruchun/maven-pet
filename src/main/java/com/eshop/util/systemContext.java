package com.eshop.util;

public class systemContext {
    
	  //设计3个ThreadLocal来记录与线程有关的与分页有关的变量
	 public static ThreadLocal<Integer> offset=new ThreadLocal<Integer>();//偏移量
	 public static ThreadLocal<Integer> pageSize=new ThreadLocal<Integer>();//每页记录数
	 public static ThreadLocal<Integer> count=new ThreadLocal<Integer>();//总计 
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
