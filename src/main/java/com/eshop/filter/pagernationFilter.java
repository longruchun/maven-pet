package com.eshop.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshop.util.systemContext;


public class pagernationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse )response;
		
		//返程穿越时又清除掉
	   try {
		   
		 //过滤器中,读取request中的分页参数,写入systemContext中,
		   String  offset=req.getParameter("pageOffset");
		   int  _offset=req.getParameter("pageOffset")==null?0:Integer.parseInt(req.getParameter("pageOffset"));
		   chain.doFilter(request, response);
		   
		   //读取过滤器初始化参数中设定的pageSize
		   //String _pageSize=
		
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		
		systemContext.removeoffset();//返程穿越时又清除掉
		systemContext.removePageSize(null);
		systemContext.removeoffset();
		
	}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
