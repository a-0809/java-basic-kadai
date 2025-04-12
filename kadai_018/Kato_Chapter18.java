package kadai_018;

	abstract public class  Kato_Chapter18 {
	public String familyName = "加藤";  //姓
	public String givenName = "";   //名
	public String address  = "東京都中野区〇×";        //住所
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
			public void commonlutroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonlutroduce();
		eachIntroduce();
		}
}	


