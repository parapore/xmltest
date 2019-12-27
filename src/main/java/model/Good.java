package model;

import java.io.Serializable;

public class Good implements Serializable {
	private int goodCount = 0;

	public int getGoodCount() {
		return goodCount;
	}

	public void setGoodCount(int goodCount) {
		this.goodCount = goodCount;
	}


}
