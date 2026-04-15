/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {

	public static void main(String[] args) throws IOException {
		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citostock = 30;
		int chocostock = 30;
		int pisstock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250・・・残り" + citostock + "個");
		System.out.println("ショコラ     \\280・・・残り" + chocostock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisstock + "個");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個づつ買いますか？（最大30個まで）\n");

		System.out.print("シトロン      >");
		String citbuyString = reader.readLine();
		//↑string型だから、入力されたものは文字列として認識
		// 入力した文字列を数値に変換 
		int citbuystr = Integer.parseInt(citbuyString);

		System.out.print("ショコラ      >");
		String chocobuyString = reader.readLine();
		int chocobuystr = Integer.parseInt(chocobuyString);

		System.out.print("ピスターシュ   >");
		String pisbuyString = reader.readLine();
		int pisbuystr = Integer.parseInt(pisbuyString);

		System.out.println("\nシトロン     " + citbuystr + "個");
		System.out.println("ショコラ     " + chocobuystr + "個");
		System.out.println("ピスターシュ  " + pisbuystr + "個");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

	}

}
