package com.spring.web.vo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class PageVO {
	
	private int pageIndex = 1;				    //현재페이지
	private int pageUnit = 10;				    //페이지갯수
	private int pageSize = 10;	    			//페이지사이즈
	private int firstIndex = 1;		    		//firstIndex
	private int recordCountPerPage = 10;		//recordCountPerPage
	private int totCnt = 0;				      	//총갯수
	private int startDate = 0;			    	//시작데이터
	private int endDate = 0;				    //종료데이터
    private int realEnd = 0;				    //페이징 마지막 숫자
		
	private boolean prev, next;	    			//이전,다음버튼

	
//	getter&setter
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageUnit() {
		return pageUnit;
	}

	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstIndex() {
		return firstIndex;
	}

	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}

	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}

	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}

	public int getTotCnt() {
		return totCnt;
	}

	public void setTotCnt(int totCnt) {
		this.totCnt = totCnt;
	}

	public int getStartDate() {
		return startDate;
	}

	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	public int getEndDate() {
		return endDate;
	}

	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	public int getRealEnd() {
		return realEnd;
	}

	public void setRealEnd(int realEnd) {
		this.realEnd = realEnd;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}
	
	//검색
	private String searchKeyword = "";
  
	//QueryString
	private String queryString = "";
  
	public String getSearchKeyword() {
		return searchKeyword;
	}
	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	public String getQueryString() {
		return queryString;
	}
	public void setQueryString() throws UnsupportedEncodingException {
		String qs = "";
		qs += "&searchKeyword="+URLEncoder.encode(this.searchKeyword, "UTF-8");
		qs += "&pageIndex="+this.pageIndex;
		
		this.queryString = qs;
		
	}



	
}