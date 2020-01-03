package com.wxh.NewServer.MyEntity;

import com.wxh.NewServer.Exception.AjaxResponse;

import java.util.List;

public class TotalInfo {

	private List<AjaxResponse> totalInfo;

	public List<AjaxResponse> getTotalInfo() {
		return totalInfo;
	}

	public void setTotalInfo(List<AjaxResponse> totalInfo) {
		this.totalInfo = totalInfo;
	}

	@Override
	public String toString() {
		return "TotalInfo [totalInfo=" + totalInfo + "]";
	}

	public TotalInfo(List<AjaxResponse> totalInfo) {
		super();
		this.totalInfo = totalInfo;
	}


	
}
