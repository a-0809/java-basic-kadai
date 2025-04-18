package kadai_021;

import java.util.HashMap;

	public class Dictionary_Chapter21 {
	
	public void referer(String[] word) {
		
	HashMap<String, String> map = new HashMap<String, String>();

	String result = "";
		
map.put("apple", "りんご");
map.put("peach", "桃");
map.put("banana", "バナナ");
map.put("lemon", "レモン");
map.put("pear", "梨");
map.put("kiwi", "キウィ");
map.put("strawberry", "いちご");
map.put("grape", "ぶどう");
map.put("muscat", "マスカット");
map.put("cherry", "さくらんぼ");


	for (int i = 0; i <word.length; i++) {
		result = map.get(word[i]);
		
	if (result == null) {
		//調べる英単語が辞書に追加されていない場合
		result = word[i] + "は辞書に存在しません";
	} else {
		//調べる英単語が辞書に追加されている場合
		result = word[i] + "の意味は" + result;
	}
	
	System.out.println(result);
		}
	}
}

