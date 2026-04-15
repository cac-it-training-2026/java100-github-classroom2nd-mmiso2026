/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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

		System.out.println("\nそれぞれ何個づつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン      >");
		String citbuyString = reader.readLine();
		double citbuy = Double.parseDouble(citbuyString);

		System.out.print("ショコラ      >");
		String chocobuyString = reader.readLine();
		double chocobuy = Double.parseDouble(chocobuyString);

		System.out.print("ピスターシュ   >");
		String pisbuyString = reader.readLine();
		double pisbuy = Double.parseDouble(pisbuyString);

		System.out.println("\nシトロン     " + citbuy + "個");
		System.out.println("ショコラ     " + chocobuy + "個");
		System.out.println("ピスターシュ  " + pisbuy + "個");

		//回答ではintでカッコ内の計算していたけどいいのか？
		System.out.println("\n合計個数   " + (citbuy + chocobuy + pisbuy) + "個");
		System.out.println("合計金額   " + (int) (250 * citbuy + 280 * chocobuy + 320 * pisbuy) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		citostock = (int) (citostock - citbuy);
		chocostock = (int) (chocostock - chocobuy);
		pisstock = (int) (pisstock - pisbuy);

		System.out.println("\n本日のおすすめ商品です。\n");

		System.out.println("シトロン     \\250・・・残り" + citostock + "個");
		System.out.println("ショコラ     \\280・・・残り" + chocostock + "個");
		System.out.println("ピスターシュ  \\320・・・残り" + pisstock + "個");

		double totalbuy = citbuy + chocobuy + pisbuy;
		int totalprice = (int) (250 * citbuy + 280 * chocobuy + 320 * pisbuy);

		System.out.println("\n閉店時間となりました。");
		System.out.println("またのお越しをお待ちしております。");

		System.out.println("\n売上の割合");
		System.out.println("売上合計     \\" + totalprice + "\n");

		System.out.println("内訳");
		System.out.println(
				"シトロン     \\" + (int) (250 * citbuy) + "・・・" + (int) ((250 * citbuy) / totalprice * 100) + "%");
		System.out.println("ショコラ     \\" + (int) (280 * chocobuy) + "・・・"
				+ (int) ((280 * chocobuy) / totalprice * 100) + "%");
		System.out.println(
				"ピスターシュ  \\" + (int) (320 * pisbuy) + "・・・" + (int) ((320 * pisbuy) / totalprice * 100) + "%");

	}

}
