package com.example.java;

import com.example.java.model.Olive;

import java.util.List;


/**
 * Thsi is an <b>olive press</b> application, and its job is to <i>press olive</i>!!
 */
public class OlivePress {

	public int getOil(List<Olive> olives) {

		int totalOil = 0;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

}
