package projectA0507;

// abstract는 상속받는걸 미룰수 있다...? abstract 없으면 오류 발생
public abstract class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색 기능");
	}
}
