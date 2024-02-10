package aopexample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class VerificationAspect {
	@Before("execution(* aopexample.Deposit.payment(..)) || execution(* aopexample.Withdraw.drawout(..)) || execution(* aopexample.Beneficiary.addBeneficiary(..))")
	public void accountLogin() {
		System.out.println("Account login");
	}

	@After("execution(* aopexample.Deposit.payment(..)) || execution(* aopexample.Withdraw.drawout(..)) || execution(* aopexample.Beneficiary.addBeneficiary(..))")
	public void accountLogout() {
		System.out.println("Account logout");
	}
}