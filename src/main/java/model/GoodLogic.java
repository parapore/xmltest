package model;

public class GoodLogic {
	// 引数をGoodインスタンスにすれば、ここでnewしなくて済む
	// そうすると別クラスでGood	g = new Good();したインスタンスをここで扱える。
	// そんでGoodクラスに値をゲッターセッターで値を渡せる。
	public void goodPlus(Good g) {
		int count = g.getGoodCount();
		count++;
		g.setGoodCount(count);
	}
}
