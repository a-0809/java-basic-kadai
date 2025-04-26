package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう");
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
			String input = scanner.next();
				
			//正しいじゃんけんの手か判断する
			if( (input.equals("r") || input.equals("s") || input.equals("p") )) {
				scanner.close();
				//自分のじゃんけんの手を返す
				return input ;
				//エラー出力、再度自分のじゃんけんの手を選ぶ
			} else {
				System.out.println("入力値がエラーです。正しい手を入力してください");
			}
		}
	}
		//対戦相手のじゃんけんの手を乱数で選ぶ
		public String getRandom() {
			//配列にじゃんけんの手をセットする
			String[] hand = {"r", "s", "p"};
			//乱数で対戦相手のじゃんけんの手を選ぶ
			int random = (int) Math.floor(Math.random() * 3);
			//対戦相手のじゃんけんの手を返す
			return hand[random];
		}
		
		//じゃんけんを行う
		public void playGame() {
			//自分と対戦相手のじゃんけんの手を出力する
			HashMap<String, String> map = new HashMap<String, String>();
			map.put("r", "グー");
			map.put("s", "チョキ");
			map.put("p", "パー");
			
			String me = getMyChoice();
			String rival = getRandom();
			
			System.out.println("自分の手は" + map.get(me) + ",対戦相手の手は" + map.get(rival));
			//自分と対戦相手のじゃんけんの手を比較する・結果を出力する
			if (me.equals(rival)) {
				System.out.println("あいこです");
			} else if ( (me.equals("r") && rival.equals("s")) || (me.equals("s") && rival.equals("p")) || (me.equals("p") && rival.equals("r")) ) {
				System.out.println("自分の勝ちです");
			} else {
				System.out.println("自分の負けです");
			}
		}
}
