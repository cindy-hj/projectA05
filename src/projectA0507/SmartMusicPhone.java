package projectA0507;

public class SmartMusicPhone extends Phone {
	
	public SmartMusicPhone(String owner) {
		super(owner);
	}
	
	@Override
	void musicPhone() {
		System.out.println("음악을 Play한다.");
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색 기능");
	}

}
