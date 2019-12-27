package dev;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Good;
import model.GoodLogic;

/**
 * Servlet implementation class XmlServlet
 */

public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public XmlServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 初回起動かどうかを判定するための処理
		// アプリケーションスコープから値を取得
		ServletContext sc = this.getServletContext();
		Good g = (Good) sc.getAttribute("yoine");

		// 初回起動判定の続き
		// アプリケーションスコープに値がなければ初回なのでnewする
		if (g == null) {
			g = new Good();
			sc.setAttribute("yoine", g);
		}

		// リクエストパラメーターの取得
		request.setCharacterEncoding("UTF-8");
		String yoine = request.getParameter("action");

		// いいねボタン押されたら
		if (yoine != null) {

			// YoineLogicでいいねを加算
			GoodLogic yl = new GoodLogic();
			yl.goodPlus(g);

			// いいねの数をアプリケーションスコープに保存
			sc.setAttribute("good", g);
		}

		// フォワード
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
