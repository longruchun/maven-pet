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
		
		//���̴�Խʱ�������
	   try {
		   
		 //��������,��ȡrequest�еķ�ҳ����,д��systemContext��,
		   String  offset=req.getParameter("pageOffset");
		   int  _offset=req.getParameter("pageOffset")==null?0:Integer.parseInt(req.getParameter("pageOffset"));
		   chain.doFilter(request, response);
		   
		   //��ȡ��������ʼ���������趨��pageSize
		   //String _pageSize=
		
	} catch (Exception e) {
		// TODO: handle exception
	}finally {
		
		systemContext.removeoffset();//���̴�Խʱ�������
		systemContext.removePageSize(null);
		systemContext.removeoffset();
		
	}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
}
