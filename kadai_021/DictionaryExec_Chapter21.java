package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		//辞書クラスのインスタンス作成
		Dictionary_Chapter21 map = new Dictionary_Chapter21();
		//調べる英単語を配列にセットする
		String[] wordArray= new String[] { "apple", "banana",  "grape", "orange" };
		
		map.referer(wordArray);
		
	}

}

