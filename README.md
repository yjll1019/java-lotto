### 3주차 미션 - 로또

### 프로그램 설명
1. 사용자는 로또 구입 금액을 입력하면 해당 금액만큼 로또를 발급받습니다.
    (로또 1장의 가격은 1000원입니다.)
2. 구입한 로또의 개수만큼 로또의 번호를 출력합니다.
3. 사용자는 지난 주 당첨 번호와 보너스 볼을 입력합니다.
4. 1번에서 사용자가 발급받은 로또와 3번에서 사용자가 입력한 지난 주 로또를 비교하여 당첨 여부와 수익률을 출력합니다.

### 구현 기능
1. 사용자로부터 구입 금액을 입력받아야 한다. 
2. 구입 금액이 1000이상의 숫자인지 검증해야 한다. (문자, 공백, 빈 문자 입력 시 처리)
3. 사용자가 입력한 금액만큼 로또를 발급해야 한다. 
4. 로또 번호 발급 시 1이상 45이하의 중복되지 않는 수를 발급해야한다.
5. 사용자로부터 지난 주 당첨 번호를 입력받아야 한다.
6. 당첨 번호가 ,로 구분이 되며 1이상 45이하의 값을 가진 6개의 숫자인지 검증해야 한다.(입력된 문자열이 1,,2 인 경우, 문자 또는 공백인 경우, 6개의 수보다 더 많은 수를 입력했을 경우 처리)
7. 사용자로부터 보너스 볼을 입력받아야 한다.
8. 보너스 볼이 1이상 45이하의 값을 가진 1개의 숫자인지 검증해야 한다.(문자, 공백, 5번에서 입력한 숫자와 중복일 경우 처리)
9. 사용자가 발급받은 로또와 지난 주 로또 당첨 번호를 비교하여 당첨 여부를 확인한다.
11. 당첨 여부에 따라 수익률을 계산한다.
12. 당첨 여부와 수익률을 출력한다.
 
### 프로그래밍 요구사항
+ 자바 코드 컨벤션을 지킨다.
+ else 예약어를 사용하지 않는다.
+ 접근 제어자를 용도에 적합하게 사용해 구현한다.
+ 함수의 길이가 10라인을 넘지 않도록 한다.
+ ident depth는 1까지만 허용한다.
+ 메소드의 인자 수를 3개까지만 허용한다.