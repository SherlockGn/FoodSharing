package com.gth.foodshare.util;

import java.util.ArrayList;
import java.util.List;

import com.gth.foodshare.model.Mall;

public class SearchUtils {
	public static String addResultSpan(String data, String key) {
//		System.out.println("search: data = " + data + ", key = " + key);
		String retString = data.replaceAll(key, "<span class=\"searchResult\">" + key + "</span>");
		if (data.equals(retString))
			return null;
//		System.out.println("retString = " + retString);
		return retString;
	}

	public static Mall addResultSpan(Mall mall, String key) {
		Mall retMall = mall.clone();
		String tp1, tp2, tp3;
		tp1 = addResultSpan(mall.getTitle(), key);
		retMall.setTitle(tp1 == null ? mall.getTitle() : tp1);
		tp2 = addResultSpan(mall.getSubtitle(), key);
		retMall.setSubtitle(tp2 == null ? mall.getSubtitle() : tp2);
		tp3 = addResultSpan(mall.getAddress(), key);
		retMall.setAddress(tp3 == null ? mall.getAddress() : tp3);
		if (tp1 == null && tp2 == null && tp3 == null)
			return null;
		return retMall;
	}

	public static List<Mall> addResultSpan(List<Mall> lstMall, String key) {
		List<Mall> retList = new ArrayList<Mall>();
		for (Mall mall : lstMall) {
			Mall tpMall = addResultSpan(mall, key);
			if (tpMall != null)
				retList.add(tpMall);
		}
		return retList;
	}
}
