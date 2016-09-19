package tdd.test.account;

import org.junit.Test;

import main.Account;

public class AccountTest {
	//테스트 케이스 작성흐름을 위해 일단 놔놓는다.
	//계좌를 생성한다. -> 계좌가 정상적으로 생성됐는지 확인한다.
	
	//이 메서드를 테스트한다.
	@Test
	public void testAccount() throws Exception{
		Account account = new Account();
		//junit을 쓰므로 삭제
		/*if(account == null){
			throw new Exception("계좌생성 실패");
		}*/
		
	}
	
	
	
	//junit을 쓸 것이므로 삭제
	/*public static void main(String[] args){
		AccountTest test = new AccountTest();
		try {
			test.testAccount(); //계좌생성 테스트
			//test.makeAccount(); //이런식으로 테스트한다.
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		System.out.println("성공");
	}*/
}
