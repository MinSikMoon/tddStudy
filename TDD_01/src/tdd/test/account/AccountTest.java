package tdd.test.account;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Account;

public class AccountTest {
	//테스트 케이스 작성흐름을 위해 일단 놔놓는다.
	//계좌를 생성한다. -> 계좌가 정상적으로 생성됐는지 확인한다.

	private Account account;

	//이 메서드를 테스트한다.
	@Test
	public void testAccount() throws Exception{
		setup();

	}
	
	//Before를 하려면 private가 아닌 public으로 한다.
	@Before
	public void setup() {
		account = new Account(10000);
	}

	@Test
	public void testGetBalance() throws Exception {
		//setup();
		assertEquals(10000, account.getBalance());
		
		account = new Account(100);
		assertEquals(100, account.getBalance());
		
		account = new Account(0);
		assertEquals(0,account.getBalance());
		
		//이것들을 assertEquals로 바꿔본다.
		/*if(account.getBalance() != 10000){
			fail("getBalance() =>" + account.getBalance());
		}*/
	}
	
	//예금 테스트
	@Test
	public void testDeposit() throws Exception {
		//setup();
		account.deposit(1000);
		assertEquals(11000, account.getBalance());
	}
	
	//출금 테스트
	@Test
	public void testWithdraw() throws Exception {
		//setup();
		account.withdraw(1000);
		assertEquals(9000, account.getBalance());
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
