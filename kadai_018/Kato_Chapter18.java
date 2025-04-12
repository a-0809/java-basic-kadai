package kadai_018;

public abstract class  Kato_Chapter18 {
	String familyName;  //姓
	String givenName;   //名
	String address;        //住所
	
	public Kato_Chapter18(String familyName, String givenNmae, String address) {
		this.familyName = familyName;
		this.givenName = givenNmae;
		this.address = address;
	}
	
	public void commonlutroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonlutroduce();
		eachIntroduce();
		System.out.println();
		}
		
	}


