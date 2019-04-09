/*
 *  클래스 이름 : ValidatorTest.java
 *
 *  버전 정보 : 1.0.0
 *
 *  날짜 : 2019-04-07
 *
 *  저작권 : 이예지
 */

import java.util.Arrays;
import java.util.List;

import com.woowacourse.lotto.util.Validator;
import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
	@Test
	public void checkPurchasingAmountValid_빈문자입력() {
		String amount = "";
		Assert.assertFalse(Validator.checkPurchasingAmountValid(amount));
	}

	@Test
	public void checkPurchasingAmountValid_공백입력() {
		String amount = " ";
		Assert.assertFalse(Validator.checkPurchasingAmountValid(amount));
	}

	@Test
	public void checkPurchasingAmountValid_문자입력() {
		String amount = "천원";
		Assert.assertFalse(Validator.checkPurchasingAmountValid(amount));
	}

	@Test
	public void checkPurchasingAmountValid_1000원미만입력() {
		String amount = "100";
		Assert.assertFalse(Validator.checkPurchasingAmountValid(amount));
	}

	@Test
	public void checkPurchasingAmountValid_정상작동() {
		String amount = "1000";
		Assert.assertTrue(Validator.checkPurchasingAmountValid(amount));
	}

	@Test
	public void checkOverlapNumberValid_중복존재() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Assert.assertFalse(Validator.checkOverlapNumber(1, list));
	}

	@Test
	public void checkOverlapNumberValid_정상작동() {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		Assert.assertTrue(Validator.checkOverlapNumber(5, list));
	}
}
