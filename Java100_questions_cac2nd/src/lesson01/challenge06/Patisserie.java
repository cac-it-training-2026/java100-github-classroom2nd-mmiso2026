/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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
		System.out.println("ピスターシュ \\320・・・残り" + pisstock + "個");

		System.out.println("\nそれぞれ何個づつ買いますか？（最大30個まで)\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String citbuyString = reader.readLine();
		int citbuy = Integer.parseInt(citbuyString);

		System.out.print("ショコラ      >");
		String chocobuyString = reader.readLine();
		int chocobuy = Integer.parseInt(chocobuyString);

		System.out.print("ピスターシュ  >");
		String pisbuyString = reader.readLine();
		int pisbuy = Integer.parseInt(pisbuyString);

		System.out.println("\nシトロン     " + citbuy + "個");
		System.out.println("ショコラ     " + chocobuy + "個");
		System.out.println("ピスターシュ  " + pisbuy + "個");

		//回答ではintでカッコ内の計算していたけどいいのか？
		System.out.println("\n合計個数   " + (citbuy + chocobuy + pisbuy) + "個");
		System.out.println("合計金額   " + (250 * citbuy + 280 * chocobuy + 320 * pisbuy) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citostock = citostock - citbuy;
		chocostock = chocostock - chocobuy;
		pisstock = pisstock - pisbuy;

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250・・・残り" + citostock + "個");
		System.out.println("ショコラ     \\280・・・残り" + chocostock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisstock + "個");
	}
}
