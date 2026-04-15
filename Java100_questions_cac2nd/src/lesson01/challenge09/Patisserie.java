/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");

		System.out.println("シトロンの味    ・・・" + (int) ((250 * citbuy) / totalprice * 100) + "%");
		System.out.println("ショコラの味    ・・・" + (int) ((280 * chocobuy) / totalprice * 100) + "%");
		System.out.println("ピスターシュの味・・・" + (int) ((320 * pisbuy) / totalprice * 100) + "%");

		System.out.println("\nが楽しめます！");
		System.out.println("値段は\\" + (int) (totalprice / totalbuy / 10) * 10 + "です。");

	}

}
